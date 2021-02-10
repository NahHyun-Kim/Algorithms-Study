package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1080 {

	public static void main(String[] args) throws IOException {
		// codeup 1080 : 어디까지 더해야 할까? (입력받은 수와 같거나 커질때까지 합해서, 마지막 수를 출력)
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int scanhap = Integer.parseInt(br.readLine());
		
		br.close();
		
		int hap = 0;
		int plus = 1;
		
		while (true) {
			hap += plus;
			
			// 마지막 plus++가 먼저 되어버리면 마지막 수 +1이 되어 출력되므로, 마지막 더해진 수에서 조건을 체크해
			// if조건에 만족한다면 break문을 걸고, 마지막으로 더한 수가 출력될 수 있게 한다.
			if(scanhap <= hap) {
				break;
			}
			
			plus++;
			
		}
		
	System.out.println(plus);	
	}

}
