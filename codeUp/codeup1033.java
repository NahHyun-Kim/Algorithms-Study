package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1033 {

	public static void main(String[] args) throws IOException {
		// 10진 정수 입력받아 16진수로 출력하기(10진수 -> 16진수 대문자)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*int res = Integer.parseInt(br.readLine());
		
		//기존 10진수 -> 16진수로 변환 후 , a~f까지(16진수의 구성요소) 인쇄되므로 대문자로 변환하는 toUpperCase() 함수 사용
		System.out.println(String.format("%x", res).toUpperCase()); */
		
		/* Scanner in = new Scanner(System.in);
		
		int res = in.nextInt();
		System.out.println(String.format("%x", res).toUpperCase()); */
		
		String res = Integer.toHexString(Integer.parseInt(br.readLine()));
		
		System.out.println(res.toUpperCase());
	
	}

}
