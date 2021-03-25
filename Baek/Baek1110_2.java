package Baek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek1110_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] cutNumber = new int[2];
		
		int n = Integer.parseInt(br.readLine());
		int sum = n;
		int count = 0;
		
		if (n < 10) {
			cutNumber[0] = 0;
			cutNumber[1] = n;
		} else {
			cutNumber[0] = n / 10;
			cutNumber[1] = n % 10;
		}
		
		while(true) {
			sum = cutNumber[0] + cutNumber[1];
			cutNumber[0] = cutNumber[1];
			cutNumber[1] = sum % 10;
			count++;
			
			if (((cutNumber[0] * 10) + cutNumber[1]) == n) {
				break;
			}
		}
		
		System.out.println(count);
	}

}
