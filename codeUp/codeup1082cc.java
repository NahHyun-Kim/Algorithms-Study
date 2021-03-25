package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1082cc {

	public static void main(String[] args) throws IOException {
		// 16진수 구구단(A~F 중 하나가 입력될때, 1부터 F까지 곱한 16진수 구구단 출력)
		// ex) B입력 : B*1부터 B*F단까지
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/**
		 * 풀이법 : 입력받은 수를 16진수 형태로 저장 후,
		 * Integer.toHexString을 통해 곱한 값을 String으로 변환해서 저장 후 표현하거나
		 * --> toHexString을 할 시 소문자로 입력이 되기 때문에 toUpperCase() 사용
		 * 
		 * 처음부터 System.out.format(또는 printf)을 통해 %x*%x=%X\n, i,j,i*j 형식으로 표현한다.
		 * **/
		//입력 받은 문자열을 16진수로 변환
		int input = Integer.valueOf(br.readLine(), 16);
		
		String ii, res;
		for(int i=1; i<16; i++) {
			ii = Integer.toHexString(i).toUpperCase();
			res = Integer.toHexString(input * i).toUpperCase();
			
			System.out.println(Integer.toHexString(input).toUpperCase() + "*" + ii + "=" + res);
		}
				
				
				
	}

}
