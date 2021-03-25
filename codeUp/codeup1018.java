package codeUp;

import java.io.IOException;
import java.util.Scanner;

public class codeup1018 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 시간을 입력받아 그대로 출력받음
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		String[] time = str.split(":");
		
		System.out.println(time[0] + ":" + time[1]);
	}

}
