package JavaBasic;

public class prac_05_functionStructure {

	//main()메서드는 반환할 데이터가 없으므로 void를 사용한다.
	public static void main(String[] args) {
		// 조건문 (switch, if문)
		// 반복문(while문, do~while문, for문)
		
		
		// while문과 do-while문은 반복할 조건을 알 경우 사용한다.
		/*
		 * while (true) { System.out.println("it's true"); //무한반복 }
		 */
		
		/*
		 * do { System.out.println("do-while문은 while 조건식이 거짓이라도, 한 번은 꼭 실행합니다."); }
		 * while(조건식);
		 */
		
		// for문은 반복할 횟수를 알 경우 사용하며(많은 사용), while문에 비해 성능이 느리다.
		/*
		 * int i=0;
		 * 
		 * for(i=0; i<2; i++) { System.out.println(i); }
		 */
		
		/*
		 * public(접근 지정자) static(객체를 생성하지 않아도 메모리에 올려 실행) int(반환 타입)
		 *  sum (메서드 이름) (int i1, int i2 - 매개변수 목록)
		 * */
		
	}
							//외부에서 데이터를 전달받을 수 있는 매개변수
		public static int sum(int i1, int i2) {		
			
			int sum=0; //지역 변수	: 매개변수나 메서드 본체에 선언된 변수이다.	
			for(int i=i1; i<=i2; i++);
			return sum;
		}
}
