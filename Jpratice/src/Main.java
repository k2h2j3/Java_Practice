import java.io.IOException;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();
    static int N,M;
    static int[][] map;
    static boolean[] check;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        int V =sc.nextInt();

        map = new int[N+1][N+1];

        for(int i = 0; i < M; i++){
            int S_node = sc.nextInt();
            int E_node = sc.nextInt();

            map[S_node][E_node] = map[E_node][S_node] = 1;
        }
        check = new boolean[N+1];
        dfs(V);
        bfs(V);

        System.out.println(sb2);
        System.out.println(sb);
    }

    public static void bfs(int v){

        check = new boolean[N+1];
        Queue<Integer> q = new ArrayDeque<>();

        sb.append(v).append(" ");
        check[v] = true;
        q.add(v);

        while(!q.isEmpty()){
            int temp = q.remove();

            for(int i = 0 ;i < N+1; i++){
                if(map[temp][i] == 1 && !check[i]){
                    check[i] = true;
                    q.add(i);
                    sb.append(i).append(" ");
                }
            }

        }
    }

    public static void dfs(int v){

        sb2.append(v).append(" ");
        check[v] = true;

        for(int i = 1; i < N+1; i++) {
            if (map[v][i] == 1 && !check[i]) {
                dfs(i);
            }
        }
    }
}















