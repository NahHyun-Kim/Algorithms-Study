package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1068 {

	public static void main(String[] args) throws IOException {
		// 점수(정수, 0~100)를 입력받아 평가 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score = Integer.parseInt(br.readLine());
		
		br.close();
		
		if (score >= 90) {
			System.out.println("A");
		} else {
			if (score >= 70) {
				System.out.println("B");
			} else {
				if (score >= 40) {
					System.out.println("C");
				} else {
					if (score >= 0) {
						System.out.println("D");
					}
				}
			}
		}
	}

}
