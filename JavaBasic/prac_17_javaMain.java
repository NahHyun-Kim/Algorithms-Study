package JavaBasic;

public class prac_17_javaMain {

	/*
	 * 자바 파일 1개당 선언하는 클래스는 1개만 사용
	 * 2개 이상의 클래스를 선언할 경우, 상속 등의 자바 객체 관리에 어려움이 생김
	 * 
	 * 자바의 메모리
	 * 자바는 컴파일러를 통한 언어. 
	 * 자바의 모든 객체는 반드시 메모리에 존재해야 사용이 가능 
	 * 메모리에 존재하지 않은 객체를 사용할 경우 NullPointerException이 발생,
	 *  ex) NullPointerException(Null값 또는 메모리에 존재하지 않는 객체를 사용, 참조할떄 발생)
	 *  ㄴ String id = request.getParaeter("user_id");
	 *  request.getParameter("user_id") --> 값이 없을 때 Null
	 *  
	 *  메모리 올리기
	 *  String, int, long, float, double과 같은 PDT(primary Data Type)은 자동으로 메모리에 올라감
	 *  static으로 선언되지 않은 자바 파일은 new 함수를 통해 메모리에 올림.
	 *  --> JSP에서 DB 접속을 위해 사용하는 Connection 객체는 static 선언이 되어 있어, new 없이 사용이 가능
	 * Static을 통해 메모리에 올리거나 new 함수를 사용한다.
	 * 
	 *  JVM 메모리 구조
	 *  Class Area(=Method Area, Static Area)
	 *  Stack Area
	 *  Heap Area.....
	 *  
	 *  static으로 선언된 객체(클래스, 함수, 변수)는 Class Area에 저장됨. 
	 *  저장된 객체는 다른 메모리 영역에서 참조하여 사용이 가능(중복 저장은 X)
	 *  static 객체의 값은 메모리에 올라온 여러 자바 객체들로부터 값이 변경될 수 있음
	 *  ex01///
	 *  서로 다른 값이 저장될수 있는 static 객체의 값 관리는 중요하다. 
	 *  싱글톤패턴(a클래스에서 static 변수를 수정 중, 전혀 다른 b 클래스에서 그 static 변수를 수정할 때 충돌 현상 방지를 위해 사용)
	 *  
	 * */
	
	
	//ex 01
	static int num = 0;
	//일 경우, 다른 a 클래스에서 static int num의 num=1과 같이 수정이 가능하다.
}
