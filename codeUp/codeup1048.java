package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1048 {

	public static void main(String[] args) throws IOException {
		// codeup1048 : 한 번에 2의 거듭제곱 배로 출력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = br.readLine().split(" ");
		
		br.close();
		
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		int res = a<<b;
		
		System.out.println(res);
	}

}
