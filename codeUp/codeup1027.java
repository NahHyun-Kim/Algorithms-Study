package codeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1027 {

	public static void main(String[] args) throws IOException {
		// 년월일 입력을 받아 형식 바꾸어 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), ".");
		String year = st.nextToken();
		String month = st.nextToken();
		String day = st.nextToken();
		
		// System.out.println(String.format(day, "%02d") + "-" + String.format(month, "%02d") + "-" + String.format(year, "%04d"));
	}

}
