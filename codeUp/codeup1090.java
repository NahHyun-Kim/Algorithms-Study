package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1090 {

	public static void main(String[] args) throws IOException {
		// codeup 1090 : 수 나열하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		//시작하는 값
		long start = Integer.parseInt(input[0]);
		
		//등비의 값
		long gop = Integer.parseInt(input[1]);
		
		//지정된 n번째의 수를 나타냄
		long where = Integer.parseInt(input[2]);
		
		for(int i=2; i<=where; i++) {
			start = start * gop;
		}
		
		System.out.println(start);
		br.close();
	}

}
