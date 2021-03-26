package var_arr_loop;

public class Code10_Arr_Prime {

    public static void main(String[] args) {
        //1부터 10000사이의 모든 소수를 찾아 출력하기

        for(int n = 2; n <= 10000; n++) {
            boolean isPrime = true;

            //2,3, ...,n/2 또는 sqrt(n) 까지 나누어 떨어지면
            for (int i = 2; i * i <= n && isPrime; i++) {
                //나누어 떨어지는 숫자가 하나라도 발견되면
                //나누는 수가 짝수라면 그 즉시 false이므로 break;를 통해 for문을 종료하거나, i 첨자 선언에서 isprime 조건으로 체크
                if (n % i == 0) {
                    //not prime
                    isPrime = false;
                }
            }
            if (isPrime)
                System.out.println(n);
        }
    }
}
