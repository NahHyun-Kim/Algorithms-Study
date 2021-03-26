package var_arr_loop;

import java.util.Scanner;

public class Code11_Arr_IntArrCnt {

    public static void main(String[] args) {
        //n개의 정수를 입력받아 배열에 저장 후, 중복된 정수쌍의 개수를 카운트하여 출력하기

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] data = new int[n];

        for(int i=0;i<n;i++) {
            data[i] = kb.nextInt();
    }
        kb.close();

        int count = 0;
        //쌍 검사를 위한 중첩 for 문 사용
        //처음부터 마지막배열 -1까지(다음 비교할 j의 자리 남김 : 5크기라면 data[3] 까지임)
        for(int i=0; i<n-1; i++) {
            //5의 크기라면, data[4] 까지이므로 n-1까지 카운트(마지막 j)
            for(int j=i+1; j<n; j++) {
                if(data[i] == data[j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
}

}
