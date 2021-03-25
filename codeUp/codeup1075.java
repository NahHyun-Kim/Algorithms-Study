package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1075 {

	public static void main(String[] args) throws IOException {
		// codeup 1075 : 정수 1개 입력받아 카운트다운 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		br.close();
		for(int i=num-1; i>=0; i--) {
			System.out.println(i);
		}
	}

}
