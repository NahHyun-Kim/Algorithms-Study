package codeup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class codeup1110 {

	public static void main(String[] args) throws IOException {
		// codeup 1110 : 정수 그대로 출력하기(불필요한 안내 문구 x)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long input = Integer.parseInt(br.readLine());
		
		System.out.println(input);
		br.close();

	}

}
