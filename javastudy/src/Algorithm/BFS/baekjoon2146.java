package Algorithm.BFS;
//다리만들기
import java.io.IOException;
import java.util.*;

public class baekjoon2146 {

    static int[] mr = {-1,0,1,0};
    static int[] mc = {0,-1,0,1};

    public static class Point{
        Point(int r, int c, int d){
            row = r;
            col = c;
            dist = d;
        }int row, col, dist;
    }

    static int N;
    static int[][] map;
    static int[] result;
    static boolean[][] check;
    static int cnt = 0;
    static int min = 10000;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        map = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                map[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == 1){
                    cnt++;
                    map[i][j] = cnt;
                    divideArea(i,j,cnt);
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] != 0){
                    int distance = measure(i,j);
                    if(distance < min){
                        min = distance;
                    }
                }
            }
        }
        System.out.println(min-1);

    }
    //섬 구분하는 메서드(2,3,4)
    public static void divideArea(int r, int c, int t) {

        check = new boolean[N][N];
        Queue<Point> q = new ArrayDeque<>();

        check[r][c] = true;
        q.add(new Point(r, c, 0));

        while (!q.isEmpty()) {
            Point now = q.remove();
            for (int i = 0; i < 4; i++) {
                int nr = now.row + mr[i];
                int nc = now.col + mc[i];

                if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
                    if (!check[nr][nc] && map[nr][nc] == 1) {
                        check[nr][nc] = true;
                        map[nr][nc] = t;
                        q.add(new Point(nr, nc, 1));
                    }
                }
            }

        }
    }
    //섬 간의 가장 최단거리 구하기
    public static int measure(int r,int c){

        int sample = map[r][c];

        boolean[][] check = new boolean[N][N];
        Queue<Point> q = new ArrayDeque<>();

        check[r][c] = true;
        q.add(new Point(r,c,0));

        while(!q.isEmpty()){
            Point now2 = q.remove();
            if(map[now2.row][now2.col] != 0 && map[now2.row][now2.col] != sample){
                return now2.dist;
            }
            for(int i = 0; i < 4; i++){
                int nr2 = now2.row + mr[i];
                int nc2 = now2.col + mc[i];

                if(nr2 < 0 || nr2 > N-1 || nc2 < 0 || nc2 > N-1){
                    continue;
                }
                if(check[nr2][nc2] || map[nr2][nc2] == sample){
                    continue;
                }

                check[nr2][nc2] = true;
                q.add(new Point(nr2,nc2,now2.dist+1));
            }
        }
        return 10002;
    }
}
