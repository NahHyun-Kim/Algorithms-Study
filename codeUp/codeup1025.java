package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1025 {

	public static void main(String[] args) throws IOException {
		// 각 정수의 자릿수별로 분류해 [] 안에 입력해서 출력하기 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String res = br.readLine();
		
		char[] spl = res.toCharArray();
		
		for (int i=0; i<spl.length; i++) {
			System.out.print("[" + spl[i]);
			for (int j=spl.length-1; j>i; j--) {
				System.out.print("0");
			}
			System.out.println("]");
		}
	}

}
