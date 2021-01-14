package JavaBasic;

public class prac_06_functionStructure2 {

	public static void main(String[] args) {
		// static 선언된 함수에서는 static 함수만 호출이 가능
		
		int i=1;
		int j=10;
		
		int k = sum(i,j);
		System.out.println(k);
	}

	private static int sum(int i1, int i2) {
		int sum = 0;
		for (int i=i1; i<= i2; i++) {
			sum += i; //sum = sum+i와 같은 의미
		}
		return sum; //public static int sum의 int 데이터형 = 반환되는 리턴 sum의 데이터형
		
	}

}
