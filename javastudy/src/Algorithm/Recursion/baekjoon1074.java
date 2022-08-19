package Algorithm.Recursion;
//Z
import java.io.IOException;
import java.util.*;

public class baekjoon1074 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(Z(N,R,C));
    }
    public static int Z(int N, int R, int C){
        if(N == 0){
            return 0;
        }
        int half = (int) Math.pow(2,N-1);
        //1사분면에 위치할경우
        if(R < half && C >= half){
            return half * half + Z(N-1,R,C-half);
        }
        //2사분면에 위치할경우
        else if(R < half && C < half){
            return Z(N-1,R,C);
        }
        //3사분면에 위치할경우
        else if(R >= half && C < half){
            return 2 * half * half + Z(N-1,R-half,C);
        }
        //4사분면에 위치할경우
        else {
            return 3 * half * half + Z(N-1,R-half,C-half);
        }
    }
}
