package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1069 {

	public static void main(String[] args) throws IOException {
		// 평가 입력 받아서 다르게 출력하기(중첩 if 문 아닌, switch문 사용)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//switch의 값은 정수값만 가능하나, 문자도 아스키코드 정수값으로 표현이 가능하기 때문에 charAt을 통해 문자로 변환한다.
		char rate = br.readLine().charAt(0);

		//switch문을 이용한 평가에 따른 내용 출력(switch(정수값), case 'A': 형식)
		switch(rate) 
		{
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
	}
	}
}
