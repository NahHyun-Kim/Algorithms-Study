package codeUp_100;

import java.util.Scanner;

public class codeup1079 {

	public static void main(String[] args) {
		// codeup 1079 : 원하는 문자(q)가 입력될때까지 반복 출력하기
		
		Scanner in = new Scanner(System.in);
		
		char letter = 'a';
		
		while(letter != 'q') {
			letter = in.next().charAt(0);
			
			System.out.println(letter);
					
		}
		in.close();
	}

}
