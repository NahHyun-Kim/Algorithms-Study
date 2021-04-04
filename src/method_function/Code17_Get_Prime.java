package method_function;

public class Code17_Get_Prime {
    //1~100000 사이의 소수를 찾아 출력한다.
    public static void main(String[] args) {
        for(int i=2; i<=100000; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }
    public static boolean isPrime(int k) {
        if (k<2)
            return false;
        for(int i=2; i*i <= k; i++) {
            if (k%i == 0)
                return false;
        }
        return true;
    }
}
