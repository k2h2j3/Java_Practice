package Algorithm.Recursion;

import java.io.IOException;
import java.util.*;

public class baekjoon1780 {

    static int N;
    static int[][] paper;
    static int minus,zero,one;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        minus = 0;
        zero = 0;
        one = 0;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        paper = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                paper[i][j] = sc.nextInt();
            }
        }
        recursion(0,0,N);

        System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);
    }
    public static void recursion(int r, int c, int n){

        if(check(r,c,n)){
            if(paper[r][c] == -1){
                minus++;
            }
            else if(paper[r][c] == 0){
                zero++;
            }
            else{
                one++;
            }
            return;
        }
        int E_size = n/3;

        //123
        //456
        //789

        //1
        recursion(r,c,n/3);
        //2
        recursion(r,c+E_size,n/3);
        //3
        recursion(r,c+2*E_size, n/3);
        //4
        recursion(r+E_size,c,n/3);
        //5
        recursion(r+E_size,c+E_size,n/3);
        //6
        recursion(r+E_size,c+2*E_size,n/3);
        //7
        recursion(r+2*E_size,c,n/3);
        //8
        recursion(r+2*E_size,c+E_size,n/3);
        //9
        recursion(r+2*E_size,c+2*E_size,n/3);
    }
    public static boolean check(int r, int c, int n){

        int sample = paper[r][c];

        for(int i = r; i < r + n; i++){
            for(int j = c; j < c +n; j++){
                if(sample != paper[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
