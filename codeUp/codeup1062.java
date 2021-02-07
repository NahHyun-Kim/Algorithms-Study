package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1062 {

	public static void main(String[] args) throws IOException {
		// codeup 1062 : 기초-비트단위논리연산 xor 하여 출력하기

					/**
					 * 비트단위 연산자
					 * bitwise : ~ 를 붙여 표현
					 * bitwise 연산자
					 * 1) & (bitwise and)
					 * 2) | (bitwise or)
					 * 3) ^ (bitwise xor) - 배타적 논리합, 서로 다를 때 1이 출력된다.
					 * 4) << (bitwise left shift)
					 * 5) >> (bitwise right shift)
					 * 
					 * 
					 * ex : 서로 다를 때 1 출력 3(00000011, 5-00000101)이면 00000110 출력(다를때만 1 출력)
					 * **/
					
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String[] num = br.readLine().split(" ");
					
					int a = Integer.parseInt(num[0]);
					int b = Integer.parseInt(num[1]);
					
					int shift = a ^ b;
					
					System.out.println(shift);
	}

}
