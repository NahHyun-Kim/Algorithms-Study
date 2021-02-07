package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1059 {

	public static void main(String[] args) throws IOException {
		// codeup 1059 : 비트단위로 NOT 하여 출력하기(참, 거짓 바꿔서 출력)
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		//비트 단위를 표시하기 위해 ~를 붙인다.
		int bit = ~a;
		
		System.out.println(bit);
	}

}
