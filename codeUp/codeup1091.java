package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1091 {

	public static void main(String[] args) throws IOException {
		// codeup 1091 : 수 나열하기 3(n번째 수 출력)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String[] input = br.readLine().split(" ");
		
		//시작할 값
		long start = Integer.parseInt(input[0]);
		long gop = Integer.parseInt(input[1]);
		long plus = Integer.parseInt(input[2]);
		long where = Integer.parseInt(input[3]);
		
		for(int i=1; i<where; i++) {
			start = (start * gop) + plus;
		}
		
		System.out.println(start);
		br.close();
	}

}
