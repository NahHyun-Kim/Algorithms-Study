package JavaBasic;

public class prac_07_object {

	public static void main(String[] args) {
		/*
		 * 자바는 부모 객체를 상속하여 프로그래밍 하는데, 시조 객체는 Object 객체임
		 * extents 부모클래스를 입력하지 않고 클래스를 생성할 경우, 자동으로 시조 object 객체를 상속 받음
		 * */
		
		//다음은 Object 객체에서 제공하는 주요 함수들이다.
		String toString; //객체의 문자 정보 반환
		Boolean equals; //현재 객체와 동일한지 여부 반환
		int hashCode; //객체의 해시코드 반환
		//protected Object clone(); 객체의 사본 생성
		//protected void finalize(); 가비지 컬렉터가 객체를 수거할 때 호출
		//public final Class<?> getClass() 객체 정보 반환
		
		/*
		 * java.io 패키지의 클래스 계층 구조 확인
		 * file, fileDescripter, IntputStream, OutputStream, 
		 * Reader(BufferedReader, InputStreamReader-FileReader)
		 * Writer(BufferedWriter, OutputStreamWriter-FileWrite, PrintWriter)
		 * */
		
		/* request.getAttribute("결과값") 
		 * session.getAttribute("결과값") //데이터타입이 object이다. 
		 * */
		 
	}

}
