##include <stdio.h>

main() {

    //462p, 숫자의 좌우 위치 변경 알고리즘
    int i, j, m, k;
    int a[10];

    i = 0;
    while (a[i] != 0)
        i++;

    j=j-1;
    i=0; // c언어는 순서도와 달리 첨자를 0부터 시작(배열)
    m = (i + j) / 2;

    while (1)
    {
        k = a[i];
        a[i] = a[j];
        a[k] = k; //시작값, 끝값 swap
        if (i == m)
            break;
        i++;
        j--;
    }

    for (i=0; i<=9; i++)
        printf("%d", a[i]);
}