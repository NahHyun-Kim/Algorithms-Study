package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1230 {

	public static void main(String[] args) throws IOException {
		// codeup 1230 : 터널 통과하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String high = br.readLine();
		br.close();
		
		StringTokenizer st = new StringTokenizer(high, " ");
		
		int high1 = Integer.parseInt(st.nextToken());
		int high2 = Integer.parseInt(st.nextToken());
		int high3 = Integer.parseInt(st.nextToken());
		
		if (high1 > 170 && high2 > 170 && high3 > 170) {
			System.out.println("PASS");
		} else {
			System.out.print("CRASH ");
			if (high1 <= 170) {
				System.out.println(high1);
			} else {
				if (high2 <= 170) {
					System.out.println(high2);
				} else {
					System.out.println(high3);
				}
			}
		}
	}

}
