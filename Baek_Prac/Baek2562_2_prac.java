package Baek_Prac;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baek2562_2_prac {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		int max = Collections.max(list);
		int index = list.indexOf(max) + 1;
		
		System.out.print(max + "\n" + index);
	}

}
