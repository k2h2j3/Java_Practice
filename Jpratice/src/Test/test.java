package Test;

import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class test {


    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int T;
            T = sc.nextInt();


            for(int i=1;i <= T; i++) {
                // N을 입력으로받기 (N * N 배열 생성)
                int N = sc.nextInt();
                // 배열안에 넣을 값(1부터 시작)
                int num = 1;

                //X좌표, Y좌표 초기화
                int Xstart = 0;
                int Ystart = 0;
                //X좌표, Y좌표 끝 위치
                int Xend = N - 1;
                int Yend = N - 1;

                // N X N 배열(달팽이배열 생성)
                int[][] arr = new int[N][N];
                //배열안에 넣을 값이 배열크기와 같을 때까지
                while(num <= N*N)
                {
                    //(0,1)->(0,2)->(0,3)...(0,N-1)
                    for(int move = Ystart; move <= Yend; move++){
                        arr[Xstart][move] = num;
                        num++;
                    }
                    //X좌표 1증가 (0,N-1) ->(1,N-1) : 기존위치에서 한칸내려서부터 값을 입력해야하기 때문
                    Xstart++;

                    //(1,N-1) -> (2,N-1) -> (3,N-1)...(N-1,N-1)
                    for(int move = Xstart; move <= Xend; move++){
                        arr[move][Yend] = num;
                        num++;
                    }
                    //Y좌표 1 감소 (N-1,N-1) -> (N-1,N-2) : 기존위치에서 한칸 왼쪽부터 값을 입력해야하기 때문
                    Yend--;

                    //(N-1,N-2) -> (N-1,N-3) -> (N-1,N-4)...(N-1,0)
                    for(int move = Yend; move >= Ystart; move--){
                        arr[Xend][move] = num;
                        num++;
                    }
                    //X좌표 1감소 (N-1,0) -> (N-2,0) :한칸 위에서부터 값을 입력해야하기 때문
                    Xend--;

                    //(N-2,0) -> (N-3,0) -> (N-4,0)... (1,0)
                    for(int move = Xend; move >= Xstart; move--){
                        arr[move][Ystart] = num;
                        num++;
                    }
                    //Y좌표 1증가 (1,0) -> (1,1): 처음 값넣은 시점에서 좌표(1,1)씩 밀려난상태에서 다시 start
                    Ystart++;

                }
                System.out.println("#"+i);
                for(int a=0;a<N;a++){
                    for(int b=0;b<N;b++){
                        System.out.print(arr[a][b]+" ");
                    }
                    System.out.println();
                }


            }






    }

}

