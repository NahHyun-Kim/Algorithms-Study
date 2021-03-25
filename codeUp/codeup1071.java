package codeUp_100;

import java.util.Scanner;

public class codeup1071 {

	public static void main(String[] args) {
		// codeup 1071 : 0이 입력될 때까지 무한 출력
		
		Scanner in = new Scanner(System.in);
		
		int num;
		while(true) {
			num = in.nextInt();
			
			if(num==0) 
				break;
			
			System.out.println(num);
		}
	}

}
