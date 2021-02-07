package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1063 {

	public static void main(String[] args) throws IOException {
		// codeup 1063 : 두 정수 입력 받아 큰 수 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String[] num = br.readLine().split(" ");
		
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		//조건문을 사용하지 않고 삼항 연산자를 사용하여 출력
		/**
		 * 삼항 연산자 : 조건식 ? (참일때의 값) : (거짓일 떄의 값) 
		 * >> 123 > 456 ? 참일때 0 : 거짓일때 1
		 * 
		 * a가 b보다 큰 경우 a를 출력해야 하므로 a, 거짓인 경우 b를 출력해야 하므로 b
		 * **/
		int res = a > b ? a : b;
		
		System.out.println(res);
	}

}
