package Baek;

import java.util.Scanner;
public class Baek1110 {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int t = sc.nextInt(); int cnt = 0; int tmp = t;
		 * 
		 * while (true) { int a = tmp/10; int b = tmp%10;
		 * 
		 * if (a+b < 10) { tmp = b * 10 + a+b; } else { tmp = b * 10 + (a+b)%10; }
		 * 
		 * cnt++; if (tmp == t) { break; } }
		 * 
		 * System.out.println(cnt); sc.close();
		 */
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int count = 0;
		int temp = t;
		
		do {
			int a = temp / 10;
			int b = temp % 10;
			
			if (a + b < 10) {
				temp = b * 10 + a+b;
			}else {
				temp = b * 10 + (a+b) % 10;
			}
			
			count++;
			
		} while (temp != t);
			
			System.out.println(count);
	}

}
