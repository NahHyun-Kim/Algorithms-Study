package JavaBasic;

public class prac_09_override {

	public static void main(String[] args) {
		// 상속받은 부모의 함수를 자식 클래스에서 재정의(수정)하는 것
		
		/*
		 * 부모 클래스 함수와 동일한 함수 정의를 사용하며,
		 * 반환 타입은 동일하다.
		 * 부모 클래스의 함수보다 접근 범위(public, private, protected)를 더 좁게 수정할 수 없다.
		 * 추가적인 예외(Exception)가 발생할 수 있음을 나타낼 수 없다.
		 * 
		 * private : 부모 클래스 전용으로 , 자식에 상속 X
		 * final : 상수, 더 이상 수정할 수 없다.
		 * 
		 * @Override //override한다는 것을 알려주기 위한 어노테이션
		 * void findArea() {} 와 같이 사용
		 * 
		 * */
	}

}
