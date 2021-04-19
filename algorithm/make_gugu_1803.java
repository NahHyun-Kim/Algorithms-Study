public class make_gugu_1803 {

    public static void main(String[] args) {
        //구구단, printf 변수 옆에 들어갈 수 찾기
        //18년도 2회 기출(C언어로 출제)
        int i, j;
        for (i=2; i<=9; i++) { //2단부터
            for (j=1; j<=9; j++) { //9단까지
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
        }
    }
}
