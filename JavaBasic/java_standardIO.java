package JavaBasic;

import java.io.IOException;
import java.util.Scanner;

public class java_standardIO {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		
		// int를 입력 받을 때 사용하는 nextInt 메서드
		int a, b;
		System.out.println("a값을 입력하세요 : ");
		a = in.nextInt();
		
		System.out.println("b값을 입력하세요 : ");
		b = in.nextInt();
		
		System.out.print("a와 b의 값은 ");
		System.out.println(a + " " + b);
		
		
		// char를 입력 받을때는 (char)System.int.read 메서드 사용
		char ch;
		ch = (char)System.in.read();
		System.out.println(ch);
		
		
	}

}
