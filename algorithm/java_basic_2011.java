public class java_basic_2011 {

    public static void main(String[] args) {
        int x = 1;
        System.out.println(!(x > 0)); //true의 !인 false 반환
        System.out.println(x > 0 || x < 4); //true or true = true 반환(or연산)
        System.out.println(x << 2); //1을 shift 2 연산(이진수 0001 을 2칸 옆으로 : 0100 (4))
        System.out.println(x & 2); //모두 참일 때만 출력(0001과 0010 and 연산 > 0000)
        System.out.println(x % 3); //1을 3으로 나눈 나머지 출력(1)
    }
}
