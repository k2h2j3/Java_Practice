package Test;

import java.util.*;

public class test {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc = 1; tc <= T; tc++) {

            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();

            //A회사 B회사에 지불할 수도금액
            int costA = 0;
            int costB = 0;
            //가장 합리적인 수도금액
            int bestcost = 0;

            //B사 수도 금액 계산
            if(W > R){
                costB = Q + (W-R)*S;
            }
            else{
                costB = Q;
            }

            //가장 합리적인 가격 도출
            if(costB >= W * P){
                costA = W * P;
                bestcost =  costA;
            }
            else if(costB < W * P){
                bestcost = costB;
            }
            System.out.println("#"+ tc + " " + bestcost);

        }



    }

}

