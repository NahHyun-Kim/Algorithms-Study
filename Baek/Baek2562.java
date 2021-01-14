package Baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2562 {

	public static void main(String[] args) throws IOException {

		/*
		 * //9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * //9개의 정수를 입력받기 위한 배열 선언, max값 초기화 int[] num = new int[9]; int max = 0; int
		 * index = 0;
		 * 
		 * for (int i=0; i<9; i++) { num[i] = sc.nextInt(); if (num[i] > max) { max =
		 * num[i]; index = (i+1); } }
		 * 
		 * System.out.println(max); System.out.println(index);
		 */
		
		//BufferedReader 를 이용한 백준 풀이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int value[] = new int[9];
		
		
		
		for (int i=0; i<9; i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int index = 0;
		
		int count = 0;
		
		for (int val : value) {
			count++;
			
			if(val > max) {
				max = val;
				index = count;
			}
		}
		System.out.print(max + "\n" + index);
		
	}

}
