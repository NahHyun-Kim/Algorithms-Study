package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class codeup1064 {

	public static void main(String[] args) throws IOException {
		// codeup 1064 : 정수 3개 입력 받아 가장 작은 수 출력하기(삼항 연산자)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = br.readLine().split(" ");
		
		br.close();
		//Arrays.sort를 통해 가장 작은수부터 a,b,c 순으로 저장되도록 정렬
		Arrays.sort(num);
		
		//큰 수도 담을 수 있는 long 형태 정수 자료형으로 순서대로 배열에 담음
		long a = Long.parseLong(num[0]);
		long b = Long.parseLong(num[1]);
		long c = Long.parseLong(num[2]);
		
		//가장 작은 수가 저장되어 출력될 수 있도록 하는 삼항 연산자 사용
		long res = (c<b ? c:b)<a ? (c<b ? c:b):a;
		
		System.out.println(res);

	}

}
