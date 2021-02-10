package codeup;

public class codeup1108 {

	public static void main(String[] args) {
		// codeup1108 : hello 20번 출력후 한칸 띄우고 world 연속 30번 출력하기
		int hellocount = 20;
		int worldcount = 30;
		
		int i=0;
		while(i<hellocount) {
			System.out.print("hello");
			i++;
		}
		
		//hello를 30번 반복한 후 다시 초기화를 해줌
		i=0;
		System.out.print(" ");
		
		while(i<worldcount) {
			System.out.print("world");
			i++;
		}
	}

}
