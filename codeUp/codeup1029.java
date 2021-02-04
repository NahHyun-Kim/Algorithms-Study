package codeUp;

import java.util.Scanner;

public class codeup1029 {

	public static void main(String[] args) {
		// 실수를 입력받아 11자리까지 반올림하여 출력하기
		Scanner in = new Scanner(System.in);
		
		double res = in.nextDouble();
		
		System.out.println(String.format("%10.11f",res));
	}

}
