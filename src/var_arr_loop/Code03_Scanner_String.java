package var_arr_loop;

import java.util.Scanner;

public class Code03_Scanner_String {

    public static void main(String[] args) {
        String str = "설계산출물 작성중";
        String input = null; // null은 생략 가능

        Scanner kb = new Scanner(System.in);

        System.out.print("What are you doing? : ");
        input = kb.next(); //문자열 입력(next : 첫번째 글자만 인식, 설계산출물 만 인식됨)

        // == 연산자는 primitive 타입에 대해서만 사용이 가능함
        // String끼리의 match 여부는 .equals 함수를 사용
        if(str.equals(input)) {
            System.out.println("Strings match! :)");
        } else {
            System.out.println("Strings do not match! :(");
        }
    }
}
