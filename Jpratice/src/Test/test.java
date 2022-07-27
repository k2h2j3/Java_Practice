package Test;

import java.util.*;

public class test {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc = 1; tc <= T; tc++) {

            int N = sc.nextInt();
            System.out.println("#" + tc);

            for(int i = 1; i <= N; i++){

                String inputStr = sc.next();
                int inputNum = sc.nextInt();
                System.out.println();

                for(int j = 0; j < inputNum; j++){

                    System.out.print(inputStr);
                }

            }
        }



    }

}

