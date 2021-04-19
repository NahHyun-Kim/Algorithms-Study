public class make_start_7_1801 {

    public static void main(String[] args) {
        //18년도 1회 기출, 1~7까지 순서대로 별찍기(숫자)
        int i, j, n;
        n = 7;

        for (i=1; i<=n; i++) { //7행
            for (j=1; j<=i; j++) { //각 행까지 값을 채움
                System.out.printf("%3d", j); //각 행까지의 값을 출력, 3칸 공백 형태
            }
            System.out.println(); //한 줄 출력이 끝나면(열 마감) 한줄 띄어쓰기

        }
    }
}
