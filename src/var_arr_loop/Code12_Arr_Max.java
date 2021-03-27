package var_arr_loop;

import java.util.Scanner;

public class Code12_Arr_Max {

    public static void main(String[] args) {
        //n개의 정수를 입력받아 배열에 저장 후,
        //0개 이상의 정수들을 더하여 얻을 수 있는 최대값을 구함
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] data = new int[n];
        for (int i=0; i<n; i++)
            data[i] = kb.nextInt();
        kb.close();

        int maxSum = 0;
        for(int i=0; i<n; i++) {
            //i가 바뀌는 구간에서 sum을 reset
            int sum = 0;
            for(int j=i; j<n; j++) {
                //sum에 data[j]값만 더해주면 됨
                sum += data[j];
                for(int k=i; k<j; k++)
                    sum += data[k];
                if (sum > maxSum)
                    maxSum = sum;
            }
        }
        System.out.println("The max sum is " + maxSum);
    }
}
