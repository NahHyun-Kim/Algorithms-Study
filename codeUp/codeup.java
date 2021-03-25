package codeUp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codeup {

	public static void main(String[] args) throws IOException {
		// codeup 1020 : 주민번호 입력받아 형태 바꿔 출력하기
		/*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = br.readLine();
		
		br.close();
		
		StringTokenizer st = new StringTokenizer(num, "-");
		bw.write(st.nextToken() + st.nextToken());
		
		bw.flush();
		bw.close(); */
		
		Scanner in = new Scanner(System.in);
		
		String num = in.next();
		
		String res = num.replaceAll("-", "");
		
		System.out.println(res);
	}

}
