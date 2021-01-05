package JavaBasic;

public class prac_12_collectionFrameWork {

	public static void main(String[] args) {
		// 컬렉션 프레임워크 : 게시판 리스트처럼 유사한 객체를 여러개 저장하고 조작해야 할 때가 빈번할 때 사용한다.
		/*
		 * 컬렉션 프레임워크는 인터페이스 + 클래스로 구성
		 * 인터페이스 : 컬렉션에서 수행할 수 있는 각종 연산을 제네릭 타입으로 정의해,
		 * 유사한 클래스에 일관성 있게 접근하게 함. 다중 상속과 유사하게 구현이 가능
		 * 
		 * 클래스 : 컬렉션 프레임워크의 인터페이스를 구현한 클래스
		 * 
		 * 컬렉션 안에는 List (ArrayList, LinkedList, Vector-Stack)
		 * Queue(DelayQueue, PriorityQueoe)
		 * Set(HashSet, TreeSet)이 있다. 
		 * 
		 * Map에는 HashMap, Hashtable, TreeMap, Properties가 있으며
		 * Collection(List, Queue, Set)과 Map은 인터페이스이다.
		 * 
		 * 1) 컬렉션 인터페이스 
		 * 	  List 특징 : 객체의 순서가 있고, 원소가 중복될 수 있다.
		 * 	  Queue 특징 : 객체를 입력한 순서대로 저장하며, 원소가 중복될 수 있다.
		 * 	  Set 특징 : 객체의 순서가 없으며, 동일한 원소를 중복할 수 없다.
		 * 
		 * 2) 컬렉션 인터페이스 주요 함수
		 * */
		
		boolean add; //(E e) 객체를 맨 끝에 추가한다.
		//void clear; //저장된 모든 객체를 제거한다.
		boolean contains; //(Object o) 명시한 객체의 저장 여부를 조사한다.
		boolean isEmpty; //리스트가 비어 있는지 조사한다.
		//Iterator<E> iterator(); Iterator를 반환한다.
		boolean remove; //(Object o) 명시한 첫 번째 객체를 제거하고, 제거 여부를 반환
		int size; //저장된 전체 객체의 개수를 반환한다.
		//T[] toArray(T[] a); 리스트를 배열로 반환
		
	}

}
