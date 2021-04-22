#include <stdio.h>
int isprime(int number) {
    int i;
    for(i=2; i<number; i++)
        if (number % i == 0)
            return 0; //i값으로 나눠떨어지면 소수가 아니므로(i=number 아닌 이상) 0 리턴
        return 1; //number를 number-1까지 또는 sqrt(number) 까지 나누었을 때 나머지가 0인 값이 없다면, 소수이므로 cnt에 1을 리턴

}

main() {
    int number = 10; cnt = 0, i;
    for (i=2; i<=number; i++)
        cnt = cnt + isprime(i); //2~10까지의 수 중 소수인 수의 수(1개당 1 리턴)를 count
    printf("%d %d", i, cnt);

    //출력값은 11, 4가 됨(11 : 10에서 +1증가해서 11이 되고, for문이 false가 되므로 빠져나옴
    //(4 : 2에서 10까지의 소수 - 2,3,5,7 자기 자신-1의 수까지 나누었을 때 약수가 없는(나머지가 0이 되는 경우가 없는)수들의 집합을 count
}