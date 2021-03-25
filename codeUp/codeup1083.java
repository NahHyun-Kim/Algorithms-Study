package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1083 {

	public static void main(String[] args) throws IOException {
		// 3,6,9인 경우 수 대신 영문자 X를 출력한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		br.close();
		for(int i=1; i<=input; i++) {
			if(i==3 || i==6 || i==9) {
				System.out.print("X" + " ");
			} else {
			System.out.print(i + " ");
		}
		}
	}

}
