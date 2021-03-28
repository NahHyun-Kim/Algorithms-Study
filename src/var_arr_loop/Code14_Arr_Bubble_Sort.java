package var_arr_loop;

import java.util.Scanner;

public class Code14_Arr_Bubble_Sort {
    public static void main(String[] args) {

        //n개의 정수를 입력받은 후, 오름차순으로 정렬하여 출력
        //Bubble Sort
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++) {
            data[i] = kb.nextInt();
        }

        kb.close();

        //data[i=n-1]의 자리에 가장 큰 수를 보냄
        //sort대상의 마지막 인덱스 i, i의 인덱스가 1이 될때까지
        for(int i=n-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                //data[j]와 data[j+1]의 값을 비교해, 전자가 크면 뒤로 보냄(tmp변수 사용)
                if(data[j] > data[j+1]) {
                    //swap data[j] and data[j+1]
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }

        System.out.println("Sorted data : ");
        for(int sorted_data : data) {
            System.out.println(sorted_data);
        }
    }
}
