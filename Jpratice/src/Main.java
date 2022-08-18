import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        int result = Integer.MAX_VALUE;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        while( st.hasMoreTokens()){
            int temp = 0;

            StringTokenizer st_2 = new StringTokenizer(st.nextToken(),"+");

            while(st_2.hasMoreTokens()){
                temp += Integer.parseInt(st_2.nextToken());
            }
            if(result == Integer.MAX_VALUE){
                result = temp;
            }
            else{
                result -= temp;
            }
        }
        System.out.println(result);
    }
}















