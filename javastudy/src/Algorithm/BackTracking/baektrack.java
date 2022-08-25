package Algorithm.BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baektrack {

    static int[] mr = {-1,0,1,0};
    static int[] mc = {0,-1,0,1};

    static int[] Point_C = new int[9];
    static int[] Point_R = new int[9];

    static char[][] map;
    static int result = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map = new char[3][3];

        for(int i = 0; i < 3; i++){
            String line = br.readLine();
            for(int j = 0; j < 3; j++){
                map[i][j] = line.charAt(j);
            }
        }

        for(int i = 0; i < 9; i++){
            Point_C[i] = i % 3;
            Point_R[i] = i / 3;
        }

        crew(new int[5], 0, 0);
        System.out.println(result);

    }

    public static void crew(int[] crew, int n,int member){

        if(n == 5){
            for(int i = 0; i < crew.length;i++){
                System.out.print(crew[i] + " ");
            }
            System.out.println();
            return;
        }

        if(member == 9){
            return;
        }

        crew[n] = member;
        crew(crew, n+1 ,member+1);
        crew(crew, n,member+1);
    }

}
