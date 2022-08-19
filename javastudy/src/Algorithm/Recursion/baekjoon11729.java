package Algorithm.Recursion;
//하노이의 탑
import java.io.IOException;
import java.util.*;

public class baekjoon11729 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println((int)Math.pow(2,n)-1);
        hanoi(1,3,n);
        System.out.println(sb);

    }
    public static void hanoi(int start,int goal, int n){
        if(n == 1){
            sb.append(start + " " + goal).append("\n");
            return ;
        }
        hanoi(start, 6-start-goal, n-1);
        sb.append(start + " " + goal).append("\n");
        hanoi(6-start-goal, goal, n-1);
    }
}
