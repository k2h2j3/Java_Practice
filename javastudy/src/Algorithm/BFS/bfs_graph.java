package Algorithm.BFS;

import java.io.IOException;
import java.util.*;

public class bfs_graph {
    static int N,M;
    static boolean[] check;
    static boolean[][] node;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        node = new boolean[N+1][N+1];

        int start = sc.nextInt();
        for(int i = 0; i < M; i++){
            int h = sc.nextInt();
            int r = sc.nextInt();
            node[h][r] = true;
            node[r][h] = true;
        }
        sb.append(start).append("\n");
        bfs(start);
        System.out.println(sb);
    }
    public static void bfs(int s){

        Queue<Integer> q = new LinkedList<>();
        check = new boolean[N+1];

        q.add(s);
        check[s] = true;

        while(!q.isEmpty()){
            int now = q.remove();
            for(int i = 0; i <= N; i++){
                if(!node[now][i] || check[i]){
                    continue;
                }
                check[i] = true;
                q.add(i);
                sb.append(i).append("\n");
            }
        }
        sb.append(0).append("\n");
    }
}
