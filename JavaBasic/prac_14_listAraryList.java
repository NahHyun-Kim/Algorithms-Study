package JavaBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class prac_14_listAraryList {

	public static void main(String[] args) {
		/*
		 * List 컬렉션 : 순서가 있는 객체를 중복 여부 상관없이 저장하는 리스트 자료구조.
		 * 배열과 유사하지만, 배열과 달리 크기가 가변적이고 ArrayList 객체를 많이 구현.
		 * 그 다음으로 LinkedList 객체를 많이 사용함.
		 * 
		 * ArrayList(가변 크기 배열, 초기 용량 10, get() 연산 빠름, add/remove 연산 느림, 메모리 부담 적음, Iterator 순방향
		 * LinkedList(이중연결리스트, 초기용량0, get() 연산 느림, add/remove 연산 빠름, 메모리 부담 많음, Iterator 순, 역방향
		 * */
		
		//void add(int index, E element) 객체를 인덱스 위치에 추가
		//E get(int index) 인덱스에 있는 객체를 반환
		// ex. rList.get(i) rList에 i번째에 있는 객체를 가져오라는 뜻
		//E remove(int index) 인덱스에 있는 객체를 제거
		//E set(int index, E element) 인덱스에 있는 객체와 주어진 객체를 교체
		//List<E> subList(int from, int to) 주어진 범위에 해당하는 객체를 리스트로 반환
		
		/*
		 * 컬렉션의 데이터 반복 처리
		 * 컬렉션의 종류에 관계 없이 반복자를 이용하면 컬렉션에 포함된 객체를 순차적으로 순회.
		 * for보다 Iterator 인터페이스롤 주로 활용하며, 해당 함수에는
		 * 
		 * */
		
		boolean hasNext; //다음 원소의 존재 여부를 반환한다.
		//E next(); 다음 원소를 반환한다. ex it.next();
		//default void remote(); 마지막에 순회한 컬렉션의 원소를 삭제한다.
		
		List rList = new ArrayList();
		Iterator<String> iterator = rList.iterator();
		while(iterator.hasNext()) { //다음 원소의 존재가 있을 때까지
			String s = iterator.next(); //다음 원소를 String s에 저장
		}
 
	}

	}

