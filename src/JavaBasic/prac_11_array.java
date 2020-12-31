package JavaBasic;

public class prac_11_array {

	public static void main(String[] args) {
		// Array : 동일한 데이터 타입의 집합을 쉽게 처리할 수 있는 데이터 구조.
		// 그 이상의 복잡한 구조는 컬랙션 객체인 List, ArrayList, HashMap, Vector 활용 권장

		int[] scores = { 100, 90, 50, 95, 85 };
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			sum += scores[i];

			double average = sum / 5; // 5로 나눴을때 소숫점이 나올수도 있기 때문에 실수형인 double형으로 받는다.
		}

		// 배열의 선언 방법
		int[] score; // int scores[];
		// int scores[5]; 는 적합하지 않다. 크기를 지정할 때는
		scores = new int[5];

		int[] score1 = { 100, 90 };
		int[] score11 = new int[] { 100, 90 };
		int [] score2;
		score2 = new int[] {100,90};
		
		//다차원 배열은 배열에 배열이 추가된 형태(다차원 배열보단 컬렉션 개체 활용 권유)
		int[][] arraytwice = new int[3][5];
		//3열 5행의 2차원 배열 객체를 생성하여라. 

	}

}
