package JavaBasic;

public class prac_16_wrapperClass {

	public static void main(String[] args) {
		/*
		 * 기본 데이터 타입(int, long, float, double)들은 객체지향 언어 특징을 적용하는데 있어 어려움이 있음.
		 * 기본 타입의 기능 + 포장하여 만든 클래스 = Wrapper Class(Ex. int 기초타입의 포장클래스 --> Integer)
		 * 
		 * Number형(Byte, short, Integer, Long, Float, Double)
		 * Boolean
		 * Character
		 * 
		 * Integer(int value), Integer(String s)
		 * Long(long value, Long(String s))
		 * Double(double value, String(s))
		 * 
		 * Integer 포장 클래스의 종류
		 * 
		 * */
		
		float fl = 1.1f;
		int intValue; //int 타입으로 반환
		double doubleValue; //double 타입으로 반환
		float floatValue; //float 타입으로 반환
		int parsIntStringS; //parseInt int타입으로 반환(문자열-> int)
		String toBinaryString; //(int i) int 타입을 2진수 문자열로 반환
		String toHexString; //(int i) int 타입을 16진수 문자열로 반환
		String toString; //(int i) int 타입을 10진수 문자열로 반환
		Integer valueOf; //(String s) 문자열을 Integer 객체로 반환
		Integer valueOf2; //(String s, int radix) radix 진수의 문자열을 Integer 객체로 반환
	}

}
