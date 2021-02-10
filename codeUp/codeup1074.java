package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1074 {

	public static void main(String[] args) throws IOException {
		// codeup 1074 : 1이 될때까지 하나씩 감소하며 출력하기(카운트 다운)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		br.close();
		
		for (int i=num; i>0; i--) {
			System.out.println(i);
		}
	}

}
