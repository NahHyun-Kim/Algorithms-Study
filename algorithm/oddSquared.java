package algorithm;

import java.util.Scanner;

public class oddSquared {

	public static void main(String[] args) {
		//1���� 99���� Ȧ���� ������ ���� ���Ͻÿ�.
		//÷�ڷ� for�� ���� i����, ���� ���� : 1~99
		//������ ������ % ���(2�� ������ 0�̸� ¦��, 1�̸� Ȧ��)
		
		int hap=0;
		
		for(int i=1; i<=99; i++) {
			if(i % 2 == 1) {
				hap += i * i;
			}
		}
		
		/*
		 *�Ǵ� for(int i=1; i<=99; i+=2) { 
		 *hap+= i*i; 
		 *�� ���·� 1���� 2�� �����ϴ� Ȧ���� ���� ���� ���� �ִ�.
		 */
		
		System.out.println("1���� 99���� Ȧ���� ������ ���� : " + hap + " �Դϴ�.");
		//���� 2) n���� �Է¹��� m������ �� �� Ȧ���� ��
	Scanner sc = new Scanner(System.in);
	int hap2 = 0;
	
	System.out.println("���� ���� �Է��ϼ���. : ");
	int n = sc.nextInt();
	
	System.out.println("���� ���� �Է��ϼ���. : ");
	int m = sc.nextInt();
	
	for(int i=n; i<m; i++) {
		if(i%2 == 1) {
			hap2 += i * i;
		}
	}
	
	System.out.println(n + "���� " + m + "���� Ȧ���� ������ ���� " + hap2 + "�Դϴ�.");
	}
}
