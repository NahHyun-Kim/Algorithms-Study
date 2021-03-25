package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1086 {

	public static void main(String[] args) throws IOException {
		// codeup 1086 : 저장용량 계산하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long tomega = 8388608;
		
		String[] input = br.readLine().split(" ");
		
		long width = Integer.parseInt(input[0]);
		long height = Integer.parseInt(input[1]);
		long bit = Integer.parseInt(input[2]);
		
		double res = (double)(width * height * bit) / tomega;
		
		System.out.printf("%.2f MB", res);
	}

}
