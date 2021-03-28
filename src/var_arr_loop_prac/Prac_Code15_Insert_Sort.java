package var_arr_loop_prac;

import java.util.Scanner;

public class Prac_Code15_Insert_Sort {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++) {
            int tmp = kb.nextInt();
            int j = i-1;

            //data[j]의 값이 tmp보다 클 동안, tmp변수가 사이에 들어올 공간을 마련하기 위해 data[j[를
            //data[j+1]의 위치로 1칸 이동시킴.
            while(j >= 0 && data[j] > tmp) {
                data[j+1] = data[j];
                j--;
            }
            //data[j]의 값이 tmp보다 더 이상 크지 않으면, ex) data[j] = 3이고 tmp가 4라면?
            //tmp의 값을 data[j]의 다음 인덱스인 data[j+1]에 삽입하면 됨.
            data[j+1] = tmp;

            for(int k=0; k<i+1; k++) {
                System.out.print(data[k] + " ");
            System.out.println();
            }
        }
        kb.close();


    }
}
