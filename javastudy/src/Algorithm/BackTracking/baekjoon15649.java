package Algorithm.BackTracking;
//N과 M
import java.io.IOException;
import java.util.*;

public class baekjoon15649 {

    static int N,M;
    static int[] arr;
    static boolean[] check;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N+1];
        check = new boolean[N+1];

        backtrack(0);

    }

    public static void backtrack(int k){
        if(k == M){
            for(int i = 0; i < M; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i < N+1; i++){
            if(!check[i]){
                arr[k] = i;
                check[i] = true;
                backtrack(k+1);
                check[i] = false;
            }
        }
    }
}
