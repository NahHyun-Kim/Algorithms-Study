package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1032 {

	public static void main(String[] args) throws IOException {
		// 10진 정수 입력받아 16진수로 출력하기 1
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String res = String.format("%x", Integer.parseInt(br.readLine()));
		br.close();
		
		System.out.println(res); */
		
		// 같은 방법이나, System.out.println에서 String.format 을 사용시 시간이 좀더 빠르다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int res = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(String.format("%x", res));
	}

}
