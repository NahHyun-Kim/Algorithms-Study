package codeUp_100;

import java.util.Scanner;

public class codeup1089 {

	public static void main(String[] args) {
		// codeup 1089 : 수 나열하기 1(수열)
		
		Scanner in = new Scanner(System.in);
		
		//시작 값 입력
		int series = in.nextInt();
		//등차의 값 입력
		int degree = in.nextInt();
		//몇 번째 수인지 입력
		int num = in.nextInt();
		
		for(int i=2; i<=num; i++) {
			series += degree;
		}
		System.out.println(series);
	}

}
