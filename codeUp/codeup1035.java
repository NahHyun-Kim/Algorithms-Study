package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1035 {

	public static void main(String[] args) throws IOException {
		// 16진 정수 1개를 입력받아 8진수로 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//16진수 정수를 1개 입력받음
		int res = Integer.parseInt(br.readLine(), 16);
		
		// 전체적으로 String.format 함수보다 Integer.parseInt를 통한 진수 입력, to... 를 통한 변환이 더 빠르다.
		String oct = Integer.toOctalString(res);
		
		System.out.println(oct);
		
	}

}
