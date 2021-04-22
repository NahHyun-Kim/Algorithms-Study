public class cross_fill_2001m {

    static int a[][] = new int[5][5];
    public static void main(String[] args) {
        //20년 1회대비 모의고사 문제풀이
        //1부터 25까지의 숫자를 5행 5열 배열에 대각선으로 채우기
        int i, L, k;
        i = L = 0; //5행 5열에 1~25까지 넣을 값
        do {
            for (int j=0; j<5; j++) { //2차원 배열의 행을 기준
                k = i - j; //i : 회전수(배열 첨자가 0으로 시작하는 것을 가정하여, 0~7회전까지)
                //ex) 2번째 회전인 1회전에는 (0,1)에 2, (1,0)에 3이 들어간다.
                // 이는 회전수(i = 1)-현재 행값(j = 0) = 열값(k = 1 )가 된다.
                if (k<0 || k>4)
                    continue; //행값의 배열주소는 0미만, 4초과(0~4까지 5행 5열)일 수 없으므로 지나친다.
                a[j][k] = ++L; //증가된 L값을 넣는다(1씩 증가)
            }
        } while(i++ < 8); //0~7까지 회전한다. 회전수 안에 들 때까지 반복, 초과 시 종료
        prnt();
    }

    static void prnt() {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++)
                System.out.printf("%3d", a[x][y]);
            System.out.println();
        }
    }
}
