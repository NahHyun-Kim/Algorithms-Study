package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1047 {

	public static void main(String[] args) throws IOException {
		// codeup 1047 : 비트시프트연산(정수 1개 입력받아 2배 곱해 출력)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a  = Integer.parseInt(br.readLine());
		
		a = a << 1;
		
		System.out.println(a);
	}

}
