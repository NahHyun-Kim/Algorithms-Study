package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1049 {

	public static void main(String[] args) throws IOException {
		// codeup1049 : 두 정수 입력받아 비교하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = br.readLine().split(" ");
		
		br.close();
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		if (a>b) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
