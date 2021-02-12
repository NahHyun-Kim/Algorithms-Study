package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1118 {

	public static void main(String[] args) throws IOException {
		// codeup 1118 : 삼각형의 넓이 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int down = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		
		double area = (double)down * height / 2;
		
		System.out.printf("%.1f", area);
		br.close(); */
		
		// codeup 1119 : 날수를 입력하면 몇 시간인지 환산하기
		/* int day = Integer.parseInt(br.readLine());
		int hour = 24;
		
		System.out.print(day * hour);
		br.close(); */ 
		
		// codeup 1120 : 세 정수가 입력하면 평균 출력하기
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		double avg = ((double)a + b + c)/ 3;
		
		System.out.printf("%.2f", avg);
		br.close();
	}

}
