public class array2_2004m {

    public static void main(String[] args) {
        //20년 4회대비 모의고사 2차원배열 형태분석
        int[][] a = new int[3][5]; //3행 5열의 배열 생성
        for (int i=0; i<3; i++) {
            for (int j=0; j<5; j++) {
                a[i][j] = i + j; //01234 / 12345 / 23456의 값 = 각 열(1~5)+각 행 값 결과와 같다.

            }
            System.out.println();
        }
    }
}
