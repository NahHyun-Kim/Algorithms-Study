package JavaBasic;

public class prac_18_exception {

	public static void main(String[] args) {
	/*
	 * 컴파일러의 예외 처리
	 * ArithmeticException; //0으로 나누기와 같은 부적절한 산술 연산 수행 시
	 * IllegalArguementException; //메서드에 부적절한 인수 전달 시 발생
	 * IndexOutOfBoundsExcpetion; //배열, 벡터 등 범위를 벗어난 인덱스를 사용할 때 발생
	 * NoSuchElementException; //요구한 원소가 없을 때 발생
	 * NullPointerExcpetion; //null값을 가진 참조 변수에 접근할 때 발생
	 * NumberFormatException; //숫자로 바꿀 수 없는 문자열을 숫자로 변환하려 할 때 발생(ex "11"은 가능하나 "김나현"은 int로 변환 불가능)
	 * 
	 * String[] str = new String[4];
	 * String temp = str[4]; 일 경우 0,1,2,3 번째 인덱스를 벗어나 참조하여 IndexOutOfBoundsException 발생
	 * ArrayList, List, Vector, int[], String[]..과 같은 배열 객체에서 발생
	 * */
	
	// NumberFormatException : 밑의 경우, 제대로된 경우 parseInt변환 예시 코딩
		String name = "김나현";
	//int v = Integer.parseInt(name);
	
	// System.out.println(v); 오류 발생(바꿀 수 없는 String 문자열을 parseInt로 바꿀 것을 요구함)
		
		String strnum1 = "1234";
		String strnum2 = "5678";
		
		int v1 = Integer.parseInt(strnum1);
		int v2 = Integer.parseInt(strnum2);
		
		int hap = v1+v2;
		
		System.out.println("parseInt를 사용한 변환 : " + hap);
		
		int v3 = 123;
		int v4 = 456;
		String strback1 = String.valueOf(v3);
		String strback2 = String.valueOf(v4);
		
		System.out.println("숫자값을 문자열로 변환하여 더한 값 : " + strback1 + strback2);
	
	/*
	 * 일반 예외 - 컴파일러가 발생할 가능성을 발견 가능
	 * ClassNotFoundException 존재하지 않는 클래스를 사용하려고 할 때 발생
	 * NoSuchFieldException 명시한 필드를 포함하지 않을 때 발생
	 * NuSuchMethodException 클래스가 명시한 메서드를 포함하지 않을 떄 발생
	 * ------> 자바 파일의 컴파일(이클립스 저장)이 정상적으로 되었는지, 톰캣 재부팅 확인
	 * 
	 * InterruptedException 인터럽트 되었을때 발생
	 * IOException 데이터 읽기 같은 입출력 문제가 있을 때 발생
	 * 
	 * */
	
	
	}
}
