package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1114 {

	public static void main(String[] args) throws IOException {
		// codeup 1114(두 정수의 합 출력), 1115(long형 정수형 값 출력)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		/*int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int hap = a+b;
		System.out.println(hap);
		
		br.close(); */
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
				
		long hap = a + b;
		System.out.println(hap);
		br.close();
	}

}
