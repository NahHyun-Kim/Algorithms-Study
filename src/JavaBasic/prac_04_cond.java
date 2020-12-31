package JavaBasic;

import java.util.Scanner;

public class prac_04_cond {

	public static void main(String[] args) {
		// if문 (if / if_else / if_else if_else)
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("90점 이상인 점수를 입력하세요 : ");
		int score = s.nextInt();
		String grade = null;
		
		if (score >= 90) {
			if (score >= 96)
				grade = "A+";
			else
				grade = "A0 or A-";
		}
		
		System.out.println("점수는 " + score + "점이며, " + "학점은 " + grade + "등급 입니다.");
	
	// switch문(다중 if문의 기능과 동일하며, 성능상 문제로 if문이 5개 이상인 경우 switch 사용 권장, 조건 수행 내용 뒤에 break 사용
		
		
	
	}

}
