package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1065 {

	public static void main(String[] args) throws IOException {
		// 정수 3개 입력받아 짝수만 출력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = br.readLine().split(" ");
		
		br.close();
		
		for (int i=0; i<num.length; i++) {
			if (Integer.parseInt(num[i]) % 2 == 0) {
				System.out.println(num[i]);
			}
		}
	}

}
