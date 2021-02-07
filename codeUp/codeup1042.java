package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1042 {

	public static void main(String[] args) throws IOException {
		// codeup 1042 : 정수 2개 입력받아 나눈 몫 출력하기(설명)
		
		/* Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println(a/b); */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		System.out.println(Integer.parseInt(st.nextToken()) / Integer.parseInt(st.nextToken()));
	}

}
