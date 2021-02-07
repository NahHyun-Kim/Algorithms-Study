package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1056 {

	public static void main(String[] args) throws IOException {
		// codeup 1056 : 참/거짓이 서로 다를 때에만 참 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = br.readLine().split(" ");
		
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		if (a != b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
