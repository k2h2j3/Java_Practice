package Algorithm.BackTracking;
//소문난 7공주(bfs+backtracking)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon1941 {

    static int[] mr = {-1,0,1,0};
    static int[] mc = {0,-1,0,1};

    static int[] Point_C = new int[25];
    static int[] Point_R = new int[25];

    static char[][] map;
    static boolean[] check;

    static int result = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map = new char[5][5];

        for(int i = 0; i < 5; i++){
            String line = br.readLine();
            for(int j = 0; j < 5; j++){
                map[i][j] = line.charAt(j);
            }
        }

        for(int i = 0; i < 25; i++){
            Point_C[i] = i % 5;
            Point_R[i] = i / 5;
        }

        crew(new int[7], 0, 0);
        System.out.println(result);

    }

    public static void crew(int[] crew, int n,int member){

        if(n == 7){
            bfs(crew);
            return;
        }

        if(member == 25){
            return;
        }

        crew[n] = member;
        crew(crew, n+1 ,member+1);
        crew(crew, n,member+1);
    }

    public static void bfs(int[] crew){

        Queue<Integer> q = new ArrayDeque<>();
        check = new boolean[7];
        int cnt = 1;
        int som = 0;

        check[0] = true;
        q.add(crew[0]);

        while(!q.isEmpty()){
            int now = q.remove();
            if(map[Point_R[now]][Point_C[now]] == 'S'){
                som++;
            }
            for(int i = 0; i < 4; i++){
                for(int j = 1; j < 7; j++){
                    if(!check[j] && Point_C[now]+mc[i] == Point_C[crew[j]] &&
                            Point_R[now]+mr[i] == Point_R[crew[j]]){
                        check[j] = true;
                        q.add(crew[j]);
                        cnt++;
                    }
                }
            }
        }

        if(cnt == 7 && som >= 4){
            result++;
        }
    }
}
