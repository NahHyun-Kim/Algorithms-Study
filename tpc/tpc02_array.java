package tpc;

public class tpc02_array {

	public static void main(String[] args) {
		// 배열(동일한 타입의 데이터를 여러 개 저장하기 위한 연속적인 메모리 구조)
		int a,b,c;
		a = 10;
		b = 20;
		c = 30;
		
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		hap(arr);
	}

	private static void hap(int[] x) {
		// 반복문 활용 = for , while
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
	
		System.out.println(sum);
	}

}
