package SW_JAVA;

public class AcademySolve3 {

    public static void main(String[] args) {

        //D3 난이도

        //SW Academy 1206 : 조망권 확보된 세대찾기

            /*Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            for(int tc = 1; tc <= T; tc++) {

                //배열 => 배열의 인덱스값 = 가로길이, 배열의 인덱스 안의 값 = 건물의 높이
                ArrayList<Integer> building = new ArrayList<Integer>();
                int[] gaparr = new int[4];

                int N = sc.nextInt(); //가로 길이
                int result = 0; //한 건물당 조망이 확보된 세대 수
                int sum = 0;


                //건물높이 입력 받기
                for(int i = 0; i < N; i++) {
                    int input = sc.nextInt();
                    building.add(input);
                }

                //처음과 끝을 2개씩 공백을 만들고 비교.
                for(int i = 2; i < building.size() -2; i++){

                    int gap1 = building.get(i) - building.get(i-2);
                    gaparr[0] = gap1;
                    int gap2 = building.get(i) - building.get(i-1);
                    gaparr[1] = gap2;
                    int gap3 = building.get(i) - building.get(i+1);
                    gaparr[2] = gap3;
                    int gap4 = building.get(i) - building.get(i+2);
                    gaparr[3] = gap4;

                    Arrays.sort(gaparr);
                    if(gaparr[0] <= 0){
                        result = 0;
                    }
                    else{
                        result = gaparr[0];
                    }
                    sum = sum + result;
                }
                System.out.println("#" + tc + " " + sum);



            }*/
    }
}
