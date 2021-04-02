package method_function;

import java.util.Scanner;

public class Code16_power {

    public static void main(String[] args) {
        //두 수 a,b를 입력받아 a의 b승을 출력하는 예제
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter two integers and press Enter.");

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        int result = power(a,b);
        System.out.println("The result is" + result);
    }

    public static int power(int n, int m){
        int result = 1;
        for (int i=0; i<m; i++)
            result *= n;
        return result;
    }
}
