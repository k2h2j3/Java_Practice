package Algorithm.BackTracking;
//N-Queen
import java.io.IOException;
import java.util.*;

public class baekjoon9663 {
    static int N;
    //같은 행여부(y)
    static boolean[] check1;
    //좌측 대각선(x+y)
    static boolean[] check2;
    //우측 대각선(x-y+n-1)
    static boolean[] check3;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        check1 = new boolean[N+1];
        check2 = new boolean[100];
        check3 = new boolean[100];

        backtrack(0); // 0행부터 시작
        System.out.println(cnt);
    }
    public static void backtrack(int n) {
        if(n == N){
            cnt++;
        }
        //1열씩 돌면서
        for(int i = 0; i < N; i++){
            //겹치는 부분이 있을시 무시
            if(check1[i] || check2[i+n] || check3[i-n+N-1]){
                continue;
            }
            //겹치는 부분 체크 후
            check1[i] = true;
            check2[i+n] = true;
            check3[i-n+N-1] = true;
            //다음 행으로 넘어감
            backtrack(n+1);
            //마치면 다시 돌아가기 위해 체크 해제
            check1[i] = false;
            check2[i+n] = false;
            check3[i-n+N-1] = false;
        }
    }
}