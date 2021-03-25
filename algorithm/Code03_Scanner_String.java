package var_arr_loop;

import java.util.Scanner;

public class Code03_Scanner_String {

    public static void main(String[] args) {
        String str = "설계산출물 작성중";
        String input = null; // null은 생략 가능

        Scanner kb = new Scanner(System.in);

        System.out.print("What are you doing? : ");
        input = kb.next(); //문자열 입력

        if(str == input) {
            System.out.println("Strings match! :)");
        } else {
            System.out.println("Strings do not match! :(")
        }
    }
}
