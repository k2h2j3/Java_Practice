package Algorithm.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon1992 {

    static int[][] map;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < N; j++){
                map[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }

        recursion(0,0,N);
        System.out.println(sb);


    }

    public static void recursion(int r, int c, int n){

        if(check(r,c,n)){
            if(map[r][c] == 0){
                sb.append(0);
            }
            else{
                sb.append(1);
            }
            return;
        }

        int half = n/2;

        sb.append('(');
        //12
        //34
        recursion(r,c,half);
        recursion(r,c+half,half);
        recursion(r+half,c,half);
        recursion(r+half,c+half,half);
        sb.append(')');
    }

    public static boolean check(int r, int c, int n){

        int sample = map[r][c];

        for(int i = r; i < r + n; i++){
            for(int j = c; j < c + n; j++){
                if(map[i][j] != sample){
                    return false;
                }
            }
        }
        return true;
    }
}