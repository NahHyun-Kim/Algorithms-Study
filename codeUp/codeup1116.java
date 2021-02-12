package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1116 {

	public static void main(String[] args) throws IOException {
		// codeup 1116 : 사칙연산 계산기, 1117 : 두 실수의 곱(소수 둘쨰자리까지)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		/* int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int hap = a+b;
		int minus = a-b;
		int gop = a*b;
		int divide = a/b;
		
		System.out.printf("%d+%d=%d\n", a,b,hap);
		System.out.printf("%d-%d=%d\n", a,b,minus);
		System.out.printf("%d*%d=%d\n", a,b,gop);
		System.out.printf("%d/%d=%d", a,b,divide);
		br.close(); */
		
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		String gop = String.format("%.2f", a*b);
		
		System.out.println(gop);
		br.close();
	}

}
