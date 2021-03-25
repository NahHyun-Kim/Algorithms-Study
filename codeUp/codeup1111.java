package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1111 {

	public static void main(String[] args) throws IOException {
		// codeup 1111 : 정수가 입력되면 %를 붙여 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		System.out.println(input + "%");
	}

}
