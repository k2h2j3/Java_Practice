package Algorithm.BackTracking;
//부분 수열의 합
import java.io.IOException;
import java.util.*;

public class baekjoon1182 {
    static int N,S;
    static boolean[] check1;
    static int[] arr;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        S = sc.nextInt();
        if(S == 0){
            cnt--;
        }

        arr = new int[N+1];

        for(int i = 1; i <= N; i++){
            arr[i] = sc.nextInt();
        }

        backtrack(0,0);
        System.out.println(cnt);
    }
    public static void backtrack(int n,int sum) {
        if(n == N){
            if(sum == S){
                cnt++;
            }
            return;
        }

        backtrack(n+1,sum);
        backtrack(n+1,sum+arr[n+1]);
    }
}
