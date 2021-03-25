package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1037 {

	public static void main(String[] args) throws IOException {
		// 10진 정수 1개를 입력받아 아스키 문자로 출력하기
		/* Scanner in = new Scanner(System.in);
		
		int res = in.nextInt();
		
		//int형 res 변수를 char형으로 형 변환하여 저장
		char asc = (char)res;
		
		System.out.println(asc); */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int res = Integer.parseInt(br.readLine());
		
		br.close();
		
		char asc = (char)res;
		
		System.out.println(asc);
		
	}

}
