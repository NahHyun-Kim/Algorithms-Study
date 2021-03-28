package var_arr_loop_prac;

import java.util.Scanner;

public class Prac_Code14_Bubble_Sort {
    public static void main(String[] args) {
        //버블 정렬(뒤에서부터 비교, 큰 수가 있으면 뒤로 가도록 정렬)

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] data = new int[n];

        for(int i=0; i<n; i++) {
            data[i] = kb.nextInt();
        }

        for(int i=n-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                //앞에 있는 수(data[j])가 뒤에 있는 수(data[j+1])보다 크면,
                //swap(위치 바꿈, 임시로 변수를 저장하는 tmp 변수 이용)
                if (data[j] > data[j+1]) {
                    int tmp = data[j];
                    data[j] =data[j+1];
                    data[j+1] = tmp;
            }
            }
        }
        System.out.println("Sorted Data : ");
        for(int sorted_num : data) {
            System.out.println(sorted_num);
        }
    }
}
