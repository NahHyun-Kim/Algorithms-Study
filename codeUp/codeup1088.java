package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1088 {

	public static void main(String[] args) throws IOException {
		// codeup 1088 : 3의 배수는 통과?
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=num; i++) {
			if (i%3 == 0) {
				System.out.print("");
			} else {
			System.out.print(i + " ");
			}
		}
		br.close();
	}


}