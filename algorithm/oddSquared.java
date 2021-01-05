package algorithm;

import java.util.Scanner;

public class oddSquared {

	public static void main(String[] args) {
		//1부터 99까지 홀수의 제곱의 합을 구하시오.
		//첨자로 for문 돌릴 i설정, 값의 범위 : 1~99
		//나머지 연산자 % 사용(2로 나눌때 0이면 짝수, 1이면 홀수)
		
		int hap=0;
		
		for(int i=1; i<=99; i++) {
			if(i % 2 == 1) {
				hap += i * i;
			}
		}
		
		/*
		 *또는 for(int i=1; i<=99; i+=2) { 
		 *hap+= i*i; 
		 *의 형태로 1부터 2씩 증가하는 홀수의 값을 정할 수도 있다.
		 */
		
		System.out.println("1부터 99까지 홀수의 제곱의 합은 : " + hap + " 입니다.");
		//변형 2) n부터 입력받은 m까지의 수 중 홀수의 합
	Scanner sc = new Scanner(System.in);
	int hap2 = 0;
	
	System.out.println("시작 값을 입력하세요. : ");
	int n = sc.nextInt();
	
	System.out.println("종료 값을 입력하세요. : ");
	int m = sc.nextInt();
	
	for(int i=n; i<m; i++) {
		if(i%2 == 1) {
			hap2 += i * i;
		}
	}
	
	System.out.println(n + "부터 " + m + "까지 홀수의 제곱의 합은 " + hap2 + "입니다.");
	}
}
