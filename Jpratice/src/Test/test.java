package Test;

import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class test {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T, input;
        T = sc.nextInt();



        for(int i = 1; i < T + 1; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            double sum = 0;

            for(int j = 0; j < 10; j++) {

                input = sc.nextInt();
                list.add(input);
                list.sort(Comparator.naturalOrder());

            }
            for(int k = 1; k < 9; k++){
                sum = sum + list.get(k);

            }
            int result = (int) Math.round(sum / 8);

            System.out.print("#"+ i + " " + result);
            System.out.print("\n");
        }





    }

}

