package JavaBasic;

public class prac_02_char {

	public static void main(String[] args) {
		// char 또는 String 타입의 사용
		char c = 'A';
		char c1 = 65; //일종의 정수 타입이기 때문에 65 대입 가능
		char c2 = '\u0041'; //유니코드 값도 대입이 가능하다.
		char c3 = 'A'; 
		
		boolean condition = true; //논리 리터럴 true/false 중 하나
		
		//자바에서 제공하는 기본 데이터 타입은 선언한 변수의 값만 명확하게 초기화되어 있으면, 자동으로 메모리에 올라간다.
		/* int num = 1; 과 같이 객체 생성하면 메모리에 값이 올라가나, 초기화를 해주지 않으면 실행 시 nullpointException 발생.
		 * int num = null; 을 대입해도, 변수의 주소값만 메모리에 올라가며 널포인터 익셉션 발생
		 * 
		 * 변수 : 선언한 변수의 값을 변경할 수 있다. int num=0; 선언 후 num=1;과 같이 가능
		 * 
		 * 상수 : 선언한 상수의 값을 변경할 수 없다. final int num = 0; (추후 변경 불가능)
		 * */
	}

}
