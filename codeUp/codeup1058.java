package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1058 {

	public static void main(String[] args) throws IOException {
		// codeup 1058 : 둘 다 거짓일 경우만 참 출력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = br.readLine().split(" ");
		
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		if (a==0 && b==0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
