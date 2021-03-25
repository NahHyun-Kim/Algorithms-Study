package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1040 {

	public static void main(String[] args) throws IOException {
		// codeup1040 : 정수 1개 입력받아 부호 바꿔 출력하기

		/* Scanner in = new Scanner(System.in);
		
		int res = -(in.nextInt());
		
		System.out.println(res); */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int res = -(Integer.parseInt(br.readLine()));
		
		System.out.println(res);
	}

}
