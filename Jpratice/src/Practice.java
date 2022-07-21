import java.util.*;

public class Practice {
    //연습 문제 1. 3개의 점수를 입력받아 평균을 내는 문제
    public int sumnumber(int a, int b, int c){
        int sum = a + b + c;
        sum = sum / 3;
        return sum;
    }

    public static void main(String[] args){

        // 연습문제 1. 답

        /*int a = 80;
        int b = 75;
        int c = 55;

        Practice sumnum = new Practice();
        int x = sumnum.sumnumber(a, b, c);
        System.out.println(x);*/

        // 연습문제 2. 자연수를 입력받아 홀수인지 짝수인지 맞추기
        // 연습 문제 2. 답

       /* System.out.println("자연수를 입력하세요\n");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x % 2 == 1) {
            System.out.println("홀수입니다");
        }
        else {
            System.out.println("짝수입니다");
        }*/

        // 연습 문제 3. 리스트 [1, 3, 5, 4, 2] 를 [5, 4, 3, 2, 1]로 만들기
        // 연습 문제 3. 답

        /*ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        System.out.println(myList); // [1, 3, 5, 4, 2] 출력
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);*/

        // 연습 문제 4. ['Life', 'is', 'too', 'short'] 리스트를 "Life is too short" 문자열로 만들어 출력.
        // 연습 문제 4. 답

        /*ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(myList); // [Life, is, too, short] 출력
        String line = String.join(" ", myList);
        System.out.println(line);*/

        // 연습 문제 5. 다음의 맵 grade에서 "B'에 해당되는 값을 추출
        // 연습 문제 5. 답

        /*HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        Integer score = grade.get("B");
        System.out.println(score);*/

        // 연습 문제 6. 다음의 numbers 리스트에서 중복 숫자를 제거
        // 연습 문제 6. 답

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력

        HashSet<Integer> set = new HashSet<Integer>(numbers);
        System.out.println(set);

        // 연습 문제 7.




    }
}
