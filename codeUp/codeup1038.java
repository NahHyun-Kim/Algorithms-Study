package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1038 {

	public static void main(String[] args) throws IOException {
		//정수 2개 입력받아 합 출력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		br.close();
		
		System.out.println(Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()));
	
		
	}	
}
