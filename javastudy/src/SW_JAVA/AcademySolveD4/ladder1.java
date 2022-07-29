package SW_JAVA.AcademySolveD4;
import java.util.*;

//SW Academy 1210 : 사다리 타기 1
public class ladder1 {
    public static int[][] ladder = new int[100][100];
    public static boolean find = false;
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);


        for (int tc = 1; tc <= 10; tc++) {

            int result = 0;
            int N = sc.nextInt();
            find = false;


            //사다리 배열 만들기
            for (int i = 0; i < ladder.length; i++){
                for(int j = 0; j < ladder[i].length; j++){
                    int input = sc.nextInt();
                    ladder[i][j] = input;
                }
            }
            for (int i = 0; i < 100; i++){
                //스타팅 지점 찾기
                if (ladder[0][i] == 1) {
                    //사다리 타기
                    findX(0, i);
                    //2 발견하면 i지점 반환
                    if (find) {
                        result = i;
                        break;
                    }
                }
            }
            System.out.println("#"+ tc + " " + result);



        }


}
    //사다리 타기 1 메서드
    public static void findX(int col, int row) {
        boolean route[][] = new boolean[100][100];
        while(col < 100){
            route[col][row] = true;
            if(ladder[col][row] == 2){
                find = true;
                break;
            }
            if(row + 1 < 100 && ladder[col][row+1] == 1 && route[col][row+1] == false){
                row++;
            }
            else if(row - 1 >= 0 && ladder[col][row-1] == 1 && route[col][row-1] == false){
                row--;
            }
            else{
                col++;
            }
        }
    }


}

