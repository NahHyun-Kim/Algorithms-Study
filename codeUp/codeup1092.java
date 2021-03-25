package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1092 {

	public static void main(String[] args) throws IOException {
		// codeup 1092 : 함께 문제 푸는 날(최소공배수)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] cycle = br.readLine().split(" ");
		
		int cy1 = Integer.parseInt(cycle[0]);
		int cy2 = Integer.parseInt(cycle[1]);
		int cy3 = Integer.parseInt(cycle[2]);
		
		int day = 1;
		while(true) {
			day++;
			if(day % cy1 ==0 && day % cy2 ==0 && day % cy3 ==0) {
				break;
			}
		}
		
		System.out.println(day);
		
		br.close();
	}

}
