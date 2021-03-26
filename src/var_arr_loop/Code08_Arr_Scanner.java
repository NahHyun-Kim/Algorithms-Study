package var_arr_loop;

import java.util.Scanner;

public class Code08_Arr_Scanner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //배열의 크기를 입력받아, data[n]이라는 배열 생성
        int n = kb.nextInt();
        int [] data = new int[n];

        for(int i=0; i<n; i++){
            data[i] = kb.nextInt();
    }
        kb.close();

        int sum = 0, max=data[0];

        for(int i=0;i<n;i++) {
            sum += data[i]; //sum = sum + data[i];
            //data[i]의 값이 max보다 크면, max값을 새로 지정(=최종적으로 가장 큰 수가 max값으로 들어감)
            if(data[i] > max) {
                max = data[i];
            }
        }

        System.out.println("The Sum is " + sum + "and the Max is " + max);
    }
}
