package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1078 {

	public static void main(String[] args) throws IOException {
		// codeup 1078 : 짝수 합 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//BufferedReader를 통해 입력받을 숫자를 int형태로 변환하여 저장
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		//1부터 입력받은 수 num 까지의 짝수의 합을 구하기 위한 hap 변수의 초기화
		int hap = 0;
		
		//for문을 통해 1부터 num까지 짝수인 수를 구하여 hap을 계산 후 출력
		for (int i=1; i<=num; i++) {
			if (i%2 == 0) 
				hap += i;
		}
		
		System.out.println(hap);
	}

}
