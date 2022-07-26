package Test;

import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class test {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();

        for(int i = 1; i <= N; i++ ) {
            int num = i;
            int cnt = 0; // "-" 카운트
            int clapnum;
            while (num > 0) {
                clapnum = num % 10;
                if (clapnum == 3 || clapnum == 6 || clapnum == 9)
                {
                    cnt++;
                }
                num = num / 10;

            }
            if(cnt == 0) {
                    System.out.print(i);

            }
            else{
                while(cnt-- > 0){
                    System.out.print("-");
                }


            }
            System.out.print(" ");

        }
        sc.close();
    }

}

