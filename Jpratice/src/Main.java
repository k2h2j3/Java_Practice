import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String input1 = sc.next();
        String input2 = sc.next();
        int[] arr1 = new int[input1.length()+1];
        int[] arr2 = new int[input2.length()+1];
        int[] arr3 = new int[arr1.length+1];

        for(int i = 0; i< arr1.length; i++){
            arr1[i] = input1.charAt(i) - '0';
        }
        for(int i = 0; i< arr1.length; i++){
            arr2[i] = input2.charAt(i) - '0';
        }
        for(int i = 0; i < arr1.length;i++){
            arr3[i] = arr2[i] + arr1[i];
        }
        for(int i = 1; i < arr3.length;i++){
            if(arr3[i]>=10){
                arr3[i] = (arr3[i] % 10);
                arr3[i-1] += 1;
            }
        }
        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i]);
        }
    }


}





