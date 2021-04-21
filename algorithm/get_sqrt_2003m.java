public class get_sqrt_2003m {
//3,13 출력
    static int sqrt(int n) {
        int r = 1;
        while (r*r <= n)
            r++;
        r--;
        return r;
    }
    public static void main(String[] args) {
        //제곱근 구하는 연산
           int n, m = 0;
            for (n=3; n<13; n++) {
            m = sqrt(n);}
            System.out.printf("%d, %d", m, n);
}
}