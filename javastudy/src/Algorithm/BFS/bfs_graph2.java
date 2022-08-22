package Algorithm.BFS;
//연결리스트로 구현한 bfs
import java.io.IOException;
import java.util.*;

public class bfs_graph2 {
    static int N,M;
    static ArrayList<Integer>[] node;
    static int[] order;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        int start = sc.nextInt();

        node = new ArrayList[N+1];
        order = new int[N+1];

        for(int i = 1; i <= N; i++){
            node[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            node[s].add(e);
            node[e].add(s);
        }

        for(int i = 1; i <= N; i++){
            Collections.sort(node[i]);
        }

        sb.append(start).append("\n");

        bfs(start);
        for(int i = 1; i <= N; i++){
            System.out.println(order[i]);
        }

    }
    public static void bfs(int s){

        Queue<Integer> q = new LinkedList<>();
        boolean[] check = new boolean[N+1];
        int cnt = 0;

        check[s] = true;
        q.add(s);

        while(!q.isEmpty()){
            int now = q.remove();
            cnt++;
            order[now] = cnt;
            for(int i : node[now]){
                if(check[i]){
                    continue;
                }

                check[i] = true;
                q.add(i);
            }
        }
    }
}
