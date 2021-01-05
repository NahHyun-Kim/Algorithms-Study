package Baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek15552_2 {

	public static void main(String[] args) throws IOException {
		
		//BufferedReader만을 이용해 입력, 출력은 System.out.println 객체 사용
		//StringBuilder를 이용해 객체명.append로 문자열을 완성하여, 그것을 출력
		//StringTokenizer를 이용한 가공 방식은 같음 , 형변환시 Integer.parseInt 사용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
		}
		br.close();
		
		System.out.println(sb);
		
	}

}
