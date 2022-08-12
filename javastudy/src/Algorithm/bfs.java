package Algorithm;

import java.io.IOException;
import java.util.*;

public class bfs {
    static final int Max_N = 10;
    static int[] mr = {-1,0,1,0};
    static int[] mc = {0,-1,0,1};
    static int[][] maze = new int[Max_N][Max_N];
    static int N;

    public static class Point{
        Point(int r, int c, int d){
            row = r;
            col = c;
            dist = d;
        }
        int row, col, dist;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                maze[i][j] = sc.nextInt();
            }
        }
        int S_row = sc.nextInt();
        int S_col = sc.nextInt();
        int E_row = sc.nextInt();
        int E_col = sc.nextInt();

        int result = bfs(S_row, S_col, E_row, E_col);
        System.out.print(result);

    }

    public static int bfs(int S_row, int S_col, int E_row, int E_col){

        boolean[][] check = new boolean[Max_N][Max_N];
        Queue<Point> que = new ArrayDeque<>();

        check[S_row][S_col] = true;
        Point start = new Point(S_row, S_col, 0);
        que.add(start);

        while(!que.isEmpty()){
            Point now = que.remove();
            if(now.row == E_row && now.col == E_col){
                return now.dist;
            }

            for(int i = 0; i < 4; i++){
                int nr = now.row + mr[i];
                int nc = now.col + mc[i];
                if(nr < 0 || nr > N-1 || nc < 0 || nc > N-1){
                    continue;
                }
                else if(check[nr][nc] == true){
                    continue;
                }
                else if(maze[nr][nc] == 1){
                    continue;
                }
                check[nr][nc] = true;
                Point next = new Point(nr, nc, now.dist + 1);
                que.add(next);
            }
        }
        return -1;
    }
}
