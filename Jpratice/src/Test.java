import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test {

    public static class Point{
        Point(int r, int c, int f, int m){
            row = r;
            col = c;
            floor = f;
            move = m;
        }int row, col, floor, move;
    }

    static int F,R,C;
    static char[][][] map;
    static StringBuilder sb = new StringBuilder();
    static int[] mc= {-1,1,0,0,0,0};
    static int[] mr = {0,0,-1,1,0,0};
    static int[] ml = {0,0,0,0,1,-1};

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());

            F = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            if(F == 0 && R == 0 && C == 0) {
                System.out.println(sb.toString());
                return;
            }

            int S_col = 0;
            int S_row = 0;
            int S_floor=0;

            map =new char[F][R][C];
            for(int i=0; i<F; i++) {
                for(int j=0; j<R; j++) {
                    String line = br.readLine();
                    for(int k=0; k<R; k++) {
                        map[i][j][k] = line.charAt(k);
                        if(map[i][j][k] == 'S') {
                            S_col =k; S_row = j; S_floor =i;
                            map[i][j][k] = '.';
                        }
                    }
                }
                br.readLine();
            }
            bfs(S_col, S_row, S_floor);
        }
    }

    static void bfs(int c, int r, int f) {

        Queue<Point> q = new LinkedList<>();
        boolean[][][] check = new boolean[F][R][C];

        q.add(new Point(c,r,f,0));
        check[f][r][c] = true;

        while(!q.isEmpty()) {
            Point now = q.remove();
            int nc= now.col;
            int nr= now.row;
            int nf= now.floor;
            int cnt = now.move;

            if(map[nf][nr][nc]=='E') {
                sb.append("Escaped in " + cnt +" minute(s).\n");
                return;
            }

            for(int d=0; d<6; d++) {
                int nx = nc + mc[d], ny = nr + mr[d], nz = nf + ml[d];
                if(nx < 0 || ny < 0 || nz < 0 || nx > C-1 || ny > R-1 || nz > F-1) continue;
                if(check[nz][ny][nx]) continue;
                if(map[nz][ny][nx]=='.' || map[nz][ny][nx]=='E') {
                    check[nz][ny][nx] = true;
                    q.add(new Point(nx, ny, nz, cnt+1));
                }
            }
        }
        sb.append("Trapped!\n");
    }
}
