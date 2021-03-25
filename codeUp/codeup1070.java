package codeUp_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1070 {

	public static void main(String[] args) throws IOException {
		// 월 입력받아 계절 출력하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//BufferdReader로 입력받은 월을 int형으로 변환(switch문에 정수형으로만 넣을 수 있음)
		int month = Integer.parseInt(br.readLine());
		
		switch(month) {
		//switch() case break 제어문에서 break를 제어하면 멈추지 않고 다음 명령어를 실행 할 수 있다.
		case 12:
		case 1:
		case 2:
			System.out.println("winter");
		break;
		
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
		break;
		
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
		break;
		
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
		break;
		}
	}

}
