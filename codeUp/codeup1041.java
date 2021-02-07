package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1041 {

	public static void main(String[] args) throws IOException {
		// codeup1041 : 문자 1개 입력받아 다음 문자 출력하기
		
		/* Scanner in = new Scanner(System.in);
		
		char a = in.nextLine().charAt(0);
		
		char b = (char) (a+1);
		
		System.out.println(b); */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char a = br.readLine().charAt(0);
		
		br.close();
		
		char b = (char) (a+1);
		
		System.out.println(b);
	}

}
