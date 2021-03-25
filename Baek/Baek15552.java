package Baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek15552 {

	public static void main(String[] args) {

		//BufferedReader를 이용한 입력, StringTokenizer를 이용한 분리,
		//BufferedWriter를 이용해 출력하는 알고리즘
		//st.nextToken(); 대신에 배열형 = st.split(" "); 과 같이 사용 가능
		
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//몇 번을 반복할지 횟수를 물어보는 수를 입력받아 int 형으로 형변환
		int t = Integer.parseInt(br.readLine()); 
		
		StringTokenizer st;
		
		for (int i=1; i<=t; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
		
		
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
