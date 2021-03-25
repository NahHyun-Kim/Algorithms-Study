package codeUp;

import java.util.Scanner;

public class codeup1039cc {

	public static void main(String[] args) {
		// 정수 2개를 입력받아 합 출력하기2(int형을 벗어나기 때문에 다른 데이터형 사용)
		
		Scanner in = new Scanner(System.in);
		
		//long 형태로 scan 받음(긴 숫자도 담을 수 있다.)
		long param = 0;
		
		for(int i=0; i<2; i++) {
			param += in.nextLong();
		}

		System.out.println(param);
	}

}
