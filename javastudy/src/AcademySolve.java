import java.util.Scanner;

public class AcademySolve {

    public static void main(String[] args) {

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

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); //입력갯수

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
        }




    }
}
