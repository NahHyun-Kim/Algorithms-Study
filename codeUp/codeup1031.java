package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1031 {

	public static void main(String[] args) throws IOException {
		// 10진 정수 1개를 입력받아 8진수로 출력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int res = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(String.format("%o", res));
	}

}
