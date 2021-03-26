package var_arr_loop;

import java.util.Scanner;

public class Code09_Arr_Shift {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++)
            data[i] = kb.nextInt();
        kb.close();

        int tmp = data[n-1]; //가장 마지막 수가 오른쪽 shift 연산에 의해 맨 앞으로 오므로, tmp 변수에 저장
        //5개의 크기를 가지는 배열이라면, n-1까지 인덱스가 저장된다. 맨 마지막 두번째까지의 수가, 오른쪽 shift 되어 마지막 [4]에 위치하므로,
        //[3]을 [4]의 위치로 이동시키기 위해(i+1 인덱스에 i번째 인덱스 대입 -> 오른쪽 shift 1)
        for(int i = n-2; i >= 0; i--) {
            data[i+1] = data[i];
        }
        data[0] = tmp;

        for(int num : data){
            System.out.println(num);
        }
    }
}
