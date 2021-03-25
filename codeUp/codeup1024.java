package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1024 {

	public static void main(String[] args) throws IOException {
		// 입력받은 단어를 한 줄에 한 글자씩 분리해서 출력하기 (ex boy : 'b' 'o' 'y')
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String res = br.readLine();
		
		//문자열을 char형 배열로 만들어주는 toCharArray 함수 사용
		char[] spl = res.toCharArray();
		
		for (char c : spl) {
			System.out.println("'" + c + "'");
		}

	}

}
