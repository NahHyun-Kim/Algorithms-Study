package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1072 {

	public static void main(String[] args) throws IOException {
		// codeup 1072 : 정수 입력받아 계속 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력 받을 횟수를 bufferedReader로 입력받아 int 형태로 저장
		String n = br.readLine();
		
		String[] res = br.readLine().split(" ");
		//입력 받은 횟수만큼 숫자를 입력받아 한줄씩 출력함

		for(String st: res) {
			System.out.println(st);
		}
	}

}
