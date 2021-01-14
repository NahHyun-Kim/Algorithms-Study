package Baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2562_2 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * List<Integer> list = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt(),
		 * sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
		 * sc.nextInt());
		 * 
		 * sc.close();
		 * 
		 * //list 타입만 받으므로, 위에 Arrays.asList를 통해 ArrayList 형태로 변환
		 * 
		 * int value = Collections.max(list); int index = list.indexOf(value) + 1;
		 * 
		 * System.out.println(value + "\n" + index);
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int index = 0;
		
		for(int i=0; i<9; i++) {
			
			int val = Integer.parseInt(br.readLine());
			
			if (val > max) {
				max = val;
				index = i+1;
			}
			
		}
		
		System.out.print(max + "\n" + index);
	}

}
