package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1067 {

	public static void main(String[] args) throws IOException {
		// 정수 1개 입력받아 분석하기 (if 문 안의 중첩 if문)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
	if (num < 0) {
			System.out.println("minus");
		if (num %2 == 0) {
			System.out.println("even");
		} else{ 
			System.out.println("odd");
		} 
		
	} else {
		System.out.println("plus");
			if (num % 2 == 0) {
				System.out.println("even");
			} else{ 
				System.out.println("odd");
			} 
		}
	
	}
}