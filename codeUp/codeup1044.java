package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1044 {

	public static void main(String[] args) throws IOException {
		// codeup1044 : 정수 1개 입력받아 1더해 출력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long num = Long.parseLong(br.readLine())+1;
		
		System.out.println(num);
	}

}
