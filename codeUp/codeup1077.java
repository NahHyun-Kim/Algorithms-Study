package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1077 {

	public static void main(String[] args) throws IOException {
		// codeup 1077 : 정수 1개 입력받아 그 수까지 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		for (int i=0; i<=num; i++) {
			System.out.println(i);
		}
	}

}
