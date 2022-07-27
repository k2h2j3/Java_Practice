package Test;

import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class test {


    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();

            for(int i = 1; i <= T; i++) {
                String N;
                N = sc.next();
                char[] arr = N.toCharArray();
                int Max = arr.length;
                int result = 0;
                for(int j = 0; j < Max; j++){
                    if(arr[j] == arr[Max-j-1]){
                        result = 1;
                    }
                    else{
                        result = 0;
                    }
                }
                System.out.print("#" + i + " " + result);
                System.out.println();
                
            }

            

    }

}

