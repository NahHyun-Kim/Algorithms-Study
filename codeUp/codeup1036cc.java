package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class codeup1036cc {

	public static void main(String[] args) throws IOException {
		// 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력하기
		/* Scanner in = new Scanner(System.in);
		
		//charAt() String문자열 중 n번째 값을 char 형으로 저장, int로 형변환
		char a = in.nextLine().charAt(0);
		
		in.close();
		
		int res = (int)a;
		
		System.out.println(res); */
		
		//BufferedReader 로 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력하기
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				char at = br.readLine().charAt(0);
				
				int res = (int)at;
				
				System.out.println(res);
		
	}

}
