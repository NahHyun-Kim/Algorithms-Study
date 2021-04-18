#include <stdio.h>

recur(i) {
    printf("%d", i);
    if (i<1)
        return 2;
    else
        return 3*recur(i-1) + 1;
}

main() {
    int n;
    n = recur(7);
    printf("\n");
    printf("%d", n);

    //76543210, 한줄 띄고 5467 출력
    //재귀함수 호출로 7~1까지 저장 후, i-1하여 0이 되었을때 출력 후 else로 넘어가 2를 리턴
    //저장된 7~1에 대해서 리턴값 2를 recur(i-1) 함수에 넣고, 7번 계산한 결과값 출력(ㄴ5467)
}