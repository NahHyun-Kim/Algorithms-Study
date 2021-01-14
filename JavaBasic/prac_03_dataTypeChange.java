package JavaBasic;

public class prac_03_dataTypeChange {

	public static void main(String[] args) {
		// 자동으로 데이터 타입 변환
		double d1 = 5 * 3.14; // 정수 5를 실수 5.0으로 자동 타입 변환한다.
		System.out.println(d1);
		
		double d2 = 1; //정수 1을 실수 1.0으로 자동 타입 변환한다.
		System.out.println(d2);
		
		/* 강제로 데이터 타입 변환 */
		// double의 3.14를 float로 형 변환해 f에 3.14F 저장
		float f = (float) 3.14;;
		System.out.println(f);
		
		// int의 300을 byte로 형 변환하면 데이터 손실이 발생
		byte b = (byte)300;
		System.out.println(b);
		
		// double의 3.14를 byte로 형 변환하면 데이터가 손실되고 3만 저장
		byte x = (byte)3.14;
		System.out.println(x);
		
		// float의 3.14를 double로 형 변환하면 데이터 손실 없이 저장
		double d = (double)3.14f;
		System.out.println(d); //3.14 출력
		
		
		/* 데이터 타입은 작은단위 -> 큰 단위로는 변경이 가능하나,
		 * 큰 단위 -> 작은 단위로 변경할 떄는 불가능하거나, ()를 통해 형변환 하더라도 데이터의 손실이 발생한다.
		 * 
		 * byte, boolean : 8비트
		 * short, char : 16비트
		 * int, float : 32비트
		 * double, long : 64비트
		 * float, double은 실수를 담는 데이터 타입이다. PDT(primitive data type)
		 * 
		 * [] : 배열 접근 / . : 객체 접근 / () : 메서드 호출
		 * 비교 연산자 : >, < , >=, <=, != , instanceof (데이터 값 or 데이터 타입의 비교)
		 * 비트 연산자 : &(AND), |(OR), ~(NOT), ^(XOR)
		 * 
		 * */
	}

}
