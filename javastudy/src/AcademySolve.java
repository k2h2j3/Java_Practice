import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class AcademySolve {

    public static void main(String[] args) {

        //SW Academy 2058

       /* int inputnum;
        int sum = 0;
        System.out.println("1~9999 사이의 숫자를 입력");

        Scanner s = new Scanner(System.in);

        inputnum = s.nextInt();

        while(inputnum > 0){

            sum = sum + inputnum % 10;
            inputnum = inputnum / 10;
        }

        System.out.println(sum);*/

        //SW Academy 2071

        /*Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //입력갯수

        for(int i = 1; i <= n; i++)
        {
            float sum=0;
            float avg=0;
            for(int j=1; j<=10; j++){
                int input=sc.nextInt();
                if(input >=0&&input<=10000)
                {
                    sum +=input;
                    if(j==10)
                    {
                        avg= sum/10;
                    }
                }
            }  System.out.printf("#%d %.0f\n", i, avg);
        }*/

        //SW Academy 2070

        /*Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int i = 1; i < T+1; i++){

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(num1 > num2){
                System.out.printf("#%d >\n",i);
            }
            else if(num1 == num2){
                System.out.printf("#%d =\n",i);
            }
            else{
                System.out.printf("#%d <\n",i);
            }
        }*/

        // SW Academy 2068

        /*Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int i = 1; i < T+1; i++) {

            ArrayList<Integer> mylist = new ArrayList<>(10);
            for(int j = 0; j< 10; j++){
                mylist.add(sc.nextInt());
                mylist.sort(Comparator.reverseOrder());

            }
            System.out.printf("#%d %d", i,mylist.get(0));

        }*/

        //SW Academy 2072

        /*Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int i = 1; i < T+1; i++) {
            //홀수 덧셈합
            int sum = 0;

            ArrayList<Integer> mylist = new ArrayList<>(10);
            for(int j = 0; j< 10; j++){
                mylist.add(sc.nextInt());
                if (mylist.get(j) % 2 == 1) {
                    sum = sum + mylist.get(j);
                }


            }
            System.out.printf("#%d %d\n", i,sum);

        }*/

        // SW Academy 2063

        /*Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        ArrayList<Integer> mylist = new ArrayList<>(T);
        for(int i = 0; i< T; i++){
            mylist.add(sc.nextInt());
            mylist.sort(Comparator.reverseOrder());

        }
        System.out.printf("%d\n", mylist.get(T / 2));

    }*/

        //SW Academy 2056

        /*Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int i = 1; i< T+1; i++){

            String date = sc.next();

            if(date.length() != 8) {
                System.out.printf("#%d %d",i, -1);
            }

            String year_s = date.substring(0,4);
            String month_s = date.substring(4,6);
            String day_s = date.substring(6,8);

            int month_i = Integer.parseInt(month_s);
            int day_i = Integer.parseInt(day_s);

            if (month_i > 12 || month_i < 1){
                System.out.printf("#%d -1",i);
                continue;
            }

            if (month_i == 2) {
                if(day_i > 28 || day_i < 1){
                    System.out.printf("#%d -1",i);
                    continue;
                }
            }

            if (month_i == 1 || month_i == 3 || month_i == 5 || month_i == 7 || month_i == 8 ||
                    month_i == 10 || month_i == 12){
                if(day_i > 31 || day_i < 1){
                    System.out.printf("#%d -1",i);
                    continue;
                }
            }
            else {
                if(day_i > 30 || day_i <1){
                    System.out.printf("#%d -1",i);
                    continue;
                }

            }
            System.out.printf("\n#%d %s/%s/%s\n",i, year_s, month_s, day_s);


        }*/








    }
}
