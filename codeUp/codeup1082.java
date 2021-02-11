package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1082 {

	public static void main(String[] args) throws IOException {
		// 16진수 구구단(A~F 중 하나가 입력될때, 1부터 F까지 곱한 16진수 구구단 출력)
		// ex) B입력 : B*1부터 B*F단까지
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력받은 수를 16진수로 변환하여 저장
		int n = Integer.parseInt(br.readLine(), 16);
		
		for(int i=1; i<=15; i++) {
			System.out.format("%X*%X=%X\n", n,i,n*i);
		}
	}
}
