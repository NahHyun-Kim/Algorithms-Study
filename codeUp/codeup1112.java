package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1112 {

	public static void main(String[] args) throws IOException {
		// codeup1112 : 두 정수 출력 / codeup1113 : 순서 바꿔 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		//공백을 두고 입력받기 때문에 정규식으로 split 하여 input[] 배열에 순서대로 저장
		/* String[] input = br.readLine().split(" ");
		
		int firstnum = Integer.parseInt(input[0]);
		int lastnum = Integer.parseInt(input[1]);
		
		System.out.println(firstnum + " " + lastnum);
		br.close(); */
		
		String[] input = br.readLine().split(" ");
		
		int firstnum = Integer.parseInt(input[1]);
		int lastnum = Integer.parseInt(input[0]);
		
		System.out.println(firstnum + " " + lastnum);
		br.close();
	}

}
