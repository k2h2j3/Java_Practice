package Test;

import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*int T;
        T=sc.nextInt();*/

        // ABCDEFGHIJKLMNOPQRSTUVWXYZ
        String[] alphaarr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
                                "P","Q", "R","S","T","U","V","W","X","Y","Z"};

        int[] numberarr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        ArrayList<Character> inputlist = new ArrayList<Character>();


        /*for(int j= 0; j <26; j++){
            System.out.printf(alphaarr[j]);
        }
        System.out.printf("\n");
        for(int j= 0; j <26; j++){
            System.out.printf("%d",numberarr[j]);
        }*/

        String input = sc.next();
        System.out.println(input);

        for (int k =0; k <= input.length(); k++){

            char alphachar = input.charAt(k);
            inputlist.add(alphachar);

        }

        System.out.print(inputlist);


        }


}

