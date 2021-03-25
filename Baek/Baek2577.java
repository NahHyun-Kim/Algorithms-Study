package Baek;

import java.io.IOException;
import java.util.Scanner;

public class Baek2577 {

	public static void main(String[] args) throws IOException {
		//세 수 A,B,C를 주어진 후, A*B*C의 결과에 0~9까지 숫자가 몇번씩 쓰였는지 구하는 프로그램 작성
		
		Scanner in = new Scanner(System.in);
		
		int val = (in.nextInt() * in.nextInt() * in.nextInt());
		String str = Integer.toString(val);
		
		in.close();
		
		for(int i=0; i<10; i++) {
			int cnt = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}

}
