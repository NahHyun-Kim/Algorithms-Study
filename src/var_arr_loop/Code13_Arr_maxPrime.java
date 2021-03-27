package var_arr_loop;

import java.util.Scanner;

public class Code13_Arr_maxPrime {
    public static void main(String[] args) {
        //1개 이상인 연속된 정수들을 합하여(?) 얻을 수 있는 소수 중에서 최대값을 출력하는 프로그램
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] data = new int[n];

        for(int i=0; i<n; i++)
            data[i] = kb.nextInt();

        kb.close();

        int max = 0;
        //구간의 시작점 i~ j
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {


                //convert data[i]~data[j] into an integer
                //if prime(text)
                //if yes, compare to the max

                int val = 0;
                //1,9,4를 int 형 194로 만드는 과정
                //0*10+1 = 1, 1*10+9=19, 19*10+4 = 194...
                for (int k = i; k <= j; k++)
                    val = val * 10 + data[k];
                
                //소수 여부 검사
                boolean isPrime = true;
                for(int k=2; k*k <= val && isPrime; k++) 
                    if(val % k == 0)
                        isPrime = false;
                
                // 만약 소수라면, max값과 비교
                if (isPrime && val > 1 && val > max)
                    max = val;

            }
        }
        if (max > 0)
            System.out.println(max);
        else
            System.out.println("no Prime");
    }
}
