public class make_bin_1902 {

    public static void main(String[] args) {
        int a[] = new int[8];
        int d = 11, n=0;

        do {
            a[n++] = d % 2; //d를 몫이 0이 될때까지 나누어, 그 나머지를 배열에 저장
            d /= 2;
        } while (d>0); //2진수 변환 시, 거꾸로 읽어야 함

        for (n=7; n>=0; n--)
            System.out.printf("%d", a[n]);
        // 거꾸로 읽어야 하기 때문에, 배열의 끝부터 처음 순서대로 출력
        // 결과는 00001011이 나온다(이유 : 배열 빈 공간에 0으로 초기화 되므로, 입력되지 않은 앞 4자리도 0으로 채워짐)
    }
}
