import java.io.IOException;
import java.util.*;

public class Main {

    static int N;
    static int[][] paper;
    static int blue,white;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        blue = 0;
        white = 0;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        paper = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                paper[i][j] = sc.nextInt();
            }
        }

        recursion(0,0,N);

        System.out.println(white);
        System.out.println(blue);
    }
    public static void recursion(int r, int c, int n){

        if(check(r,c,n)){
            if(paper[r][c] == 0){
                white++;
            }
            else{
                blue++;
            }
            return;
        }
        int half = n/2;
        //1사분면
        recursion(r,c+half,n/2);
        //2사분면
        recursion(r,c,n/2);
        //3사분면
        recursion(r+half,c, n/2);
        //4사분면
        recursion(r+half,c+half,n/2);
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















