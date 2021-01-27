package codeUp;

import java.util.Scanner;

public class codeup1012 {

	public static void main(String[] args) {
		/*
		 * codeup 1011
		 * 
		 * Scanner in = new Scanner(System.in);
		 * 
		 * String str = in.next();
		 * 
		 * char ch = str.charAt(0);
		 * 
		 * System.out.println(ch);
		 */
		
		
		//codeup 1012 : 자릿수를 맞추기 위해 String.format("%0nf", 변수); 형태 사용 Scanner in = new
		Scanner in = new Scanner(System.in);
		
		float a;
		
		a = in.nextFloat(); String st = String.format("%06f",a);
		 
		in.close();
		
		System.out.println(st);
		 
		/*
		 * codeup 1014 
		 * Scanner in = new Scanner(System.in);
		 * 
		 * String s1 = in.next(); String s2 = in.next();
		 * 
		 * char ch1 = s1.charAt(0); char ch2 = s2.charAt(0);
		 * 
		 * System.out.println(ch2); Sysetem.out.println(ch1);
		 */
		
	}

}
