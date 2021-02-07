package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1061 {

	public static void main(String[] args) throws IOException {
		// codeup 1061 : 비트단위로 or 하여 출력하기

			/**
			 * 비트단위 연산자
			 * bitwise : ~ 를 붙여 표현
			 * bitwise 연산자
			 * 1) & (bitwise and)
			 * 2) | (bitwise or)
			 * 3) ^ (bitwise xor)
			 * 4) << (bitwise left shift)
			 * 5) >> (bitwise right shift)
			 * 
			 * **/
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] num = br.readLine().split(" ");
			
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			
			int shift = a | b;
			
			System.out.println(shift);
	}

}
