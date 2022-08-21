package Algorithm.BackTracking;
//N과 M(2)
import java.io.IOException;
import java.util.*;

public class baekjoon15650 {

    static int N,M;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];

        //s는 기준숫자(기준 숫자를 시작으로 숫자를 증가시켜 배열에 저장하는 것)
        backtrack(0,1);
    }

    public static void backtrack(int k,int s){

        if(k == M){
            for(int i = 0; i < M; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = s; i < N+1; i++) {

            arr[k] = i;
            backtrack(k+1,i+1);
        }
    }
}
