package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1034 {

	public static void main(String[] args) throws IOException {
		// 8진 정수 1개 입력받아 10진수로 출력하기
		
		/* Scanner in = new Scanner(System.in);
		
		// Integer.valueOf(Integer Wrapper 객체가 필요한 경우 사용) 
		int a = Integer.valueOf(in.next(), 8);
		
		System.out.println(a); */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		
		System.out.println(Integer.parseInt(n, 8));
		
	}

}
