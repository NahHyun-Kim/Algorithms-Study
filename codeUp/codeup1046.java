package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1046 {

	public static void main(String[] args) throws IOException {
		// codeup 1046 : 정수 3개 입력받아 합과 평균 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num[] = br.readLine().split(" ");
		
		br.close();
		long a = Long.parseLong(num[0]);
		long b = Long.parseLong(num[1]);
		long c = Long.parseLong(num[2]);
		
		long hap = a+b+c;
		
		System.out.println(a+b+c);
		System.out.println(String.format("%.1f", (float)hap/3));
		
	}

}
