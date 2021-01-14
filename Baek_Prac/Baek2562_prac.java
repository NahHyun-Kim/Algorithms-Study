package Baek_Prac;

import java.util.Scanner;

public class Baek2562_prac {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] array = {in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt() };
		
		in.close();
		
		//입력한 수의 갯수, 최댓값의 인덱스, 최댓값 변수의 초기화
		int count = 0;
		int index = 0;
		int max = 0;
		
		//array[] 변수에 값이 존재할때까지 int value라는 변수에 차례로 넣어라.
		for (int value : array) {
			count++;
			
			if (value > max ) {
				max = value;
				index = count;
		}
			
		}
		
		//System.out.print(max + "\n" + index); 로도 표기 가능
		System.out.println(max);
		System.out.println(index);
	}

}
