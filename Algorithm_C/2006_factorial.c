#include <stdio.h>

main() {
    factorial(1);
    factorial(2);
    factorial(3);
    factorial(4);
    factorial(7);

}

factorial(int n) {
    if (n==0) {
        return 1;
    else
        return n * factorial(n-1);
    }
}