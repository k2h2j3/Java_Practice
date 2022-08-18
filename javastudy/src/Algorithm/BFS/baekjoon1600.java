package Algorithm.BFS;
//말이 되고픈 원숭이
import java.io.IOException;
import java.util.*;

public class baekjoon1600 {

    static int[] mr = {-1,0,1,0};
    static int[] mc = {0,-1,0,1};
    static int[] mr_h = {2,1,-1,-2,-2,-1,1,2};
    static int[] mc_h = {1,2,2,1,-1,-2,-2,-1};

    public static class Point{
        Point(int r, int c,int h,int t){
            row = r;
            col = c;
            horse = h;
            time = t;
        }int row, col, horse, time;
    }

    static int K,C,R;
    static int[][] map;
    static boolean[][][] check;


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();
        C = sc.nextInt();
        R = sc.nextInt();

        map = new int[R][C];
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                map[i][j] = sc.nextInt();
            }
        }

        int result = bfs();
        System.out.println(result);
    }
    public static int bfs(){

        check = new boolean[R][C][K+1];
        Queue<Point> q = new ArrayDeque<>();

        check[0][0][0] = true;
        q.add(new Point(0,0,0,0));

        while(!q.isEmpty()){
            Point now = q.remove();
            if(now.row == R-1 && now.col == C-1){
                return now.time;
            }
            if(now.horse < K){
                for(int t = 0; t < 8; t++){
                    int nr = now.row + mr_h[t];
                    int nc = now.col + mc_h[t];

                    if(nr >= 0 && nr < R && nc >= 0 && nc < C){
                        if(!check[nr][nc][now.horse+1] && map[nr][nc] == 0){
                            check[nr][nc][now.horse+1] = true;
                            q.add(new Point(nr,nc, now.horse+1, now.time+1));
                        }
                    }
                }
            }

            for(int i = 0; i < 4; i++){
                int nr = now.row + mr[i];
                int nc = now.col + mc[i];

                if(nr >= 0 && nr < R && nc >= 0 && nc < C){
                    if(!check[nr][nc][now.horse] && map[nr][nc] == 0){
                        check[nr][nc][now.horse] = true;
                        q.add(new Point(nr,nc,now.horse,now.time+1));
                    }
                }
            }
        }
        return -1;
    }
}