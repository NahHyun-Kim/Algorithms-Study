package var_arr_loop;

import java.util.Scanner;

public class Code15_Arr_Insert_Sort {
    public static void main(String[] args) {
        //사용자로부터 n개의 정수를 입력받으며, 정수가 하나씩 입력될때마다 현재까지 입력된 정수를 오름차순으로 정렬하여 출력
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++) {
            //새로 입력된 값을 임시로 (tmp)가지며, 비교
            int tmp = kb.nextInt();
            //뒤에서부터 끼워넣을 곳을 찾음
           int j = i-1;

            //현재 입력된 가장 마지막 값 data[j]가 새로 입력된 tmp보다 큰 동안(=작거나 같은 값이 나타날 때까지)
           while(j>=0 && data[j] > tmp) {
               //한 칸씩 뒤로 보냄
                data[j+1] = data[j];
                //j를 1씩 감소시켜서 다음 값과 비교
                j--;
           }
           //ex) data[j]=4이고 tmp=5일때, while문은 false가 되며,
            //tmp에 있는 5는 4 다음인 data[j+1]의 위치에 있어야 한다.
           data[j+1] = tmp;

           //이미 들어올 때, i개가 있었으므로 tmp 값까지 입력된 개수는 i+1개이다.
            for(int k=0; k<i+1; k++)
                System.out.print(data[k] + " ");
            System.out.println();


        }
        kb.close();

    }
}
