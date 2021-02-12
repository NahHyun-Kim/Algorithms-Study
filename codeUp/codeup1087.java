package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1087 {

	public static void main(String[] args) throws IOException {
		// codeup 1087 : 여기까지! 이제 그만~ (입력된 정수보다 작을 동안만 계속 더하는 프로그램)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		int hap = 0;
		int plus = 1;
		while(true) {
			hap += plus;
			plus++;
			
			if(hap >= input) {
				break;
			}
		}
		System.out.println(hap);
		br.close();
	}

}
