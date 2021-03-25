package var_arr_loop;

import java.util.Scanner;

public class Code02_Scanner_Int {

    public static void main(String[] args) {
        int number = 123;
        Scanner keyboard = new Scanner(System.in); //c언어에서의 scanf #include <stdio.h>...
        System.out.print("Enter an Integer : ");

        int input = keyboard.nextInt(); //scanf(%d)

        if(input == number) {
            System.out.println("Numbers match! :)");
        } else {
            System.out.println("Numbers do not match! :(");
        }

        keyboard.close();
    }
}
