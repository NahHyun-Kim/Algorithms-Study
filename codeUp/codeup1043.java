package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1043 {

	public static void main(String[] args) throws IOException {
		// codeup1043 : 정수 2개 입력받아 나눈 나머지 출력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		System.out.println(Integer.parseInt(st.nextToken()) % Integer.parseInt(st.nextToken())); 
		
		/*
		 * Scanner in = new Scanner(System.in);
		 * 
		 * int a = in.nextInt(); int b = in.nextInt();
		 * 
		 * System.out.println(a % b);
		 */
	}

}
