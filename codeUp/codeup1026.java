package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1026 {

	public static void main(String[] args) throws IOException {
		// 시분초를 입력받아 분만 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		
		br.close();
		
		String time = st.nextToken();
		int minute = Integer.parseInt(st.nextToken());
		String second = st.nextToken();
		
		System.out.println(minute);
	}

}
