package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1054 {

	public static void main(String[] args) throws IOException {
		// codeup1054 : 둘다 참일 경우만 참 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = br.readLine().split(" ");
		
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		if (a==1 && b==1) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
