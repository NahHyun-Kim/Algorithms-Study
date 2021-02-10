package codeUp_100;

import java.util.Scanner;

public class codeup1073 {

	public static void main(String[] args) {
		// codeup 1073 : 0이 입력될때까지 계속 출력하기
		
		Scanner in = new Scanner(System.in);
		
		int n = 1;
		
		while(n != 0) {
			n = in.nextInt();
			
			if(n==0) 
				break;
			System.out.println(n);
			
		}
		
	}

}
