package Test;

import java.util.*;

public class test {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //int T = sc.nextInt();

        for(int tc = 1; tc <= 10; tc++) {

            int[][] arr = new int[100][100];
            int[] row = new int[100];
            int[] column = new int[100];
            int[] comp = new int[4];

            int sumL = 0;
            int sumR = 0;
            int N = sc.nextInt();


                //입력 받은 값 2차원 배열에 넣기
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        int input = sc.nextInt();
                        arr[i][j] = input;
                    }
                }

                //행 계산 값 넣기
                for (int i = 0; i < 100; i++) {
                    int sum = 0;
                    for (int j = 0; j < 100; j++) {
                        sum = sum + arr[i][j];
                    }
                    row[i] = sum;
                }
                Arrays.sort(row);
                //행중 가장 큰 값 comp배열에 추가
                comp[0] = row[99];

                //열 계산값 넣기
                for (int i = 0; i < 100; i++) {
                    int sum = 0;
                    for (int j = 0; j < 100; j++) {
                        sum = sum + arr[j][i];
                    }
                    column[i] = sum;
                }
                Arrays.sort(column);
                //열중 가장 큰 값 comp배열에 추가
                comp[1] = column[99];

                //왼쪽 대각선 합 계산
                for (int i = 0; i < 100; i++) {
                    sumL = sumL + arr[i][i];
                }
                comp[2] = sumL;

                //오른쪽 대각선 합계산
                for (int i = 0; i < 100; i++) {
                    sumR = sumR + arr[i][99 - i];
                }
                comp[3] = sumR;

                //comp배열에서 오름차순으로 정렬
                Arrays.sort(comp);

                //가장 큰 값 출력
                System.out.println("#" + tc + " " + comp[3]);
            }






    }

}

