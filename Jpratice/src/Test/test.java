package Test;

import java.util.*;

public class test {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //int T = sc.nextInt();

        for(int tc = 1; tc <= 10; tc++) {

            //입력 값: 덤프 수, 각 상자의 높이
            int dump = sc.nextInt();
            int[] boxarr = new int[100];
            //가장 높은 위치와 가장 낮은 위치의 차이 값
            int result;

            for(int i = 0; i < boxarr.length; i++){

                int boxH = sc.nextInt();
                boxarr[i] = boxH;
            }
            //오름차순으로 정렬
            Arrays.sort(boxarr);

            for(int i = 0; i < dump; i++){
                boxarr[0] = boxarr[0] + 1; //가장 낮은 높이의 상자에 상자 1개를 쌓고
                boxarr[99] = boxarr[99] -1; //가장 높은 높이의 상자에 상자 1개를 뺀다.
                Arrays.sort(boxarr);
            }
            result = boxarr[99] - boxarr[0];
            System.out.println("#" + tc + " " + result);

        }





    }

}

