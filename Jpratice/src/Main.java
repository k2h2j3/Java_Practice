import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int L,C;
    static StringBuilder sb;
    static char[] result;
    static char[] str;

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        result = new char[L];
        str = new char[C];


        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < C; i++){
            str[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(str);
        backtrack(0,0);

    }
    public static void backtrack(int n,int s) {

        if(n == L){
            if(check()){
                System.out.println(result);
            }
            return;
        }

        for(int i = s; i < str.length; i++){

            result[n] = str[i];
            backtrack(n+1,i+1);
        }
    }
    public static boolean check(){

        int vo = 0;
        int con = 0;

        for(char i : result){
            if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){
                vo++;
            }
            else{
                con++;
            }
        }

        if(vo >= 1 && con >= 2){
            return true;
        }
        else{
            return false;
        }
    }
}














