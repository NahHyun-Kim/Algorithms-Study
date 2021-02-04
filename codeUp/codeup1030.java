package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1030 {

	public static void main(String[] args) throws IOException {
		// 정수 1개를 입력받아 그대로 출력하기(-2132123 같은 수도 출력)
		/* Scanner in = new Scanner(System.in);
		
		long res = in.nextLong();
		
		System.out.println(res); */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long res = Long.parseLong(br.readLine());
		
		System.out.println(res);
		
	}
}
