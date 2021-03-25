package codeup;

import java.util.Scanner;

public class codeup1109 {

	public static void main(String[] args) {
		// codeup 1109 : 보안카드 접수증(이름, 나이, 부서코드, 보안키 출력)
		Scanner in = new Scanner(System.in);
		
		String name = in.next();
		int age = in.nextInt();
		char deptcode = in.next().charAt(0);
		float key = in.nextFloat();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(deptcode);
		System.out.println(key);
	}

}
