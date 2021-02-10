package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1079br {

	public static void main(String[] args) throws IOException {
		// codeup1079 : 원하는 문자가 입력될 때까지 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] alpha = br.readLine().split(" ");
		
		br.close();
		
		for(int i=0; i<alpha.length; i++) {

			System.out.println(alpha[i]);
			
			//마지막 입력된 q가 입력된 후 break가 걸려야 하므로 if문을 출력문 밑에 배치
			if (alpha[i].equals("q")) {
				break;
			}
		}
	}

}
