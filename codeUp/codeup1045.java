package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1045 {

	public static void main(String[] args) throws IOException {
		// codeup1045 : 정수 2개 입력받아 자동 계산하기(합.차.곱.몫.나머지.나눈 값)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		 
		br.close();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(String.format("%.2f", (float)a/b));
	}

}
