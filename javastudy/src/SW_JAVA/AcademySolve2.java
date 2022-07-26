package SW_JAVA;

public class AcademySolve2 {

        public static void main(String[] args) {

        //D2 난이도

        //SW Academy 1926

        /*Scanner sc = new Scanner(System.in);
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
        sc.close();*/

            //SW Academy 1984

        /*Scanner sc = new Scanner(System.in);
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
        }*/

    }
}
