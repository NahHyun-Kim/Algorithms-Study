package codeup;

public class codeup1106 {

	public static void main(String[] args) {
		// int형의 최소 수와 최대 수 출력하기
		/* int minvalue = -2147483648;
		int maxvalue = 2147483647;
		
		System.out.print(minvalue + " ");
		System.out.print(maxvalue); */
		
		int a = 0x80000000;
		int b = 0x7fffffff;
		
		System.out.printf("%d %d", a,b);
	}

}
