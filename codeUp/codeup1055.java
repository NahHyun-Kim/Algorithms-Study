package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1055 {

	public static void main(String[] args) throws IOException {
		// codeup1055 :  하나라도 참이면 참 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//공백으로 나누어 입력받은 값을 num[] 배열에 담음 (or StringTokenizer 사용)
		String[] num = br.readLine().split(" ");
		
		br.close();
		
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		//and 연산자(&&)= 둘다 참이여야 참 , or 연산자(||) = 하나만 참이여도 참
		if (a==1 || b==1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
