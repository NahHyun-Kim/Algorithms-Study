package algorithm;

public class Max_MinValue {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE; //정수형 데이터 중 가장 작은 값으로 초기화
		int min = Integer.MAX_VALUE; //정수형 데이터 중 가장 큰 값으로 초기화
		
		int[] mynumber = {1,2,3,4,5};
		
		for(int i=0; i<=mynumber.length-1; i++) {
			
			if (mynumber[i] > max) { //[i]값이 max보다 크면
				max = mynumber[i];
			}
			if (mynumber[i] < min) { //[i]값이 min보다 작으면
				min = mynumber[i]; 
			}
		}
		
		System.out.println("최댓값은 : " + max);
		System.out.println("최솟값은 : " + min);
	}
	}

