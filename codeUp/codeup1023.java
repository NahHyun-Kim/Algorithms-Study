package codeUp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class codeup1023 {

	public static void main(String[] args) throws IOException {
		// 실수 1개를 입력받아 부분별로 출력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		String res = br.readLine();
		
		br.close();
		
		st = new StringTokenizer(res ,".");
		
		System.out.print(st.nextToken() + "\n" + st.nextToken());
	}

}
