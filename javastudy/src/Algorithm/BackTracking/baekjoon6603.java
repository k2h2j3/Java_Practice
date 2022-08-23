package Algorithm.BackTracking;

import java.io.IOException;
import java.util.*;

public class baekjoon6603 {

    static StringBuilder sb;
    static int[] result;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while(true){
            int N = sc.nextInt();
            if(N == 0){
                break;
            }
            arr= new int[N];
            result = new int[6];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            sb = new StringBuilder();
            backtrack(0,0);
            System.out.println(sb);

        }
    }
    public static void backtrack(int n,int s) {
        if(n == 6){
            for(int i = 0; i < 6; i++){
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = s; i < arr.length; i++){

            result[n] = arr[i];
            backtrack(n+1,i+1);
        }
    }
}
