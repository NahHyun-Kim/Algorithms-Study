package codeUp_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class codeup1084 {

	public static void main(String[] args) throws IOException {
		// codeup1084 : 빛 섞어 색 만들기
		// 일반 System.out.println 메소드를 사용할 시 시간 초과가 나옴. BufferedWriter를 쓸 것
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int r = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		br.close();
		
		int count = 0;
			for(int i=0; i<r; i++) {
				for(int j=0; j<g; j++) {
					for(int k=0; k<b; k++) {
						bw.write(i + " " + j + " " + k + "\n");
						count++;
					}
				}
			}
			bw.write(String.valueOf(count));
			bw.flush();
			bw.close();
			
	}

}
