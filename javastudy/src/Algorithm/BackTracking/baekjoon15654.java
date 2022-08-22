package Algorithm.BackTracking;

import java.io.IOException;
import java.util.*;

public class baekjoon15654 {

    static int N,M;
    static int[] result;
    static int[] arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        result = new int[M];
        check = new boolean[10001];

        backtrack(0);
        System.out.println(sb);
    }
    public static void backtrack(int k){

        if(k == M){
            for(int i = 0; i < M; i++){
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i < arr.length; i++){
            if(!check[arr[i]]){
                check[arr[i]] = true;
                result[k] = arr[i];
                backtrack(k+1);
                check[arr[i]] = false;
            }
        }
    }
}
