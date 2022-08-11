import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        int cnt = 0;
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            int height = sc.nextInt();
            arr[i] = height;
        }

        for(int i = 0; i < N; i++){
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            stack.push(arr[i]);
            cnt += stack.size()-1;
        }
        System.out.println(cnt);

    }

}












