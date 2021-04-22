public class gcd_lcm_2002m {
    static int a = 25, b = 15;
    //큰 수/작은 수로 나누어 떨어지면, 작은 수가 최대공약수,큰 수가 최대공배수

    public static void main(String[] args) {
        //유클리드 호제법으로 최대공약수, 최소공배수 구하기
        //산업기사 20년 2월 예상 모의고사 풀이(java)
        int l;
        if (a<b)
            swap();
        l = a * b; //최소공배수 l은 두수의 곱/최대공약수(a)
        gcm();
        l = l/a; //최대공약수로 나눔
        System.out.printf("%d %d", a,l);
    }

     public static void swap() {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    public static void gcm() {
        while (b != 0) {
            a = a % b; //나머지값을 a에 저장
            swap(); //큰 수와 작은 수 교환
        }
    }
}
