package codeUp_100;

import java.util.Scanner;

public class codeup1076cc {

	public static void main(String[] args) {
		// codeup 1076 : 문자 1개 입력받아 알파벳 출력하기
		
		Scanner in = new Scanner(System.in);
		
		/* char ch = in.nextLine().charAt(0);
		
		int b = (int)ch;
		
		for(int i=97; i<=b; i++) {
			System.out.print((char)i + " ");
		} */
		
		char alpha = in.next().charAt(0);
		
		char start = 'a';
		
		while (start <= alpha) {
			System.out.print(start + " ");
			start += 1;
		}
		
	}

}
