package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1051 {

	public static void main(String[] args) throws IOException {
		// codeup 1051 : 두 정수 입력받아 비교하기
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = br.readLine().split(" ");
		
		br.close();
		
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		if (b>=a) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
