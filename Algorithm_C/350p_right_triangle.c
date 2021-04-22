#include <stdio.h>

main() {
    //350p, 산기실기 대비
    //열이 i행부터 시작하는 별찍기(오른쪽으로 붙는 역삼각형)
    int i, j, k;
    int a[5][5] = {0};

    k = 0;
    for (i=0; i<=4; i++) {
        for (j=i; j<=4; j++) {
            k++;
            a[i][j] = k;
        }
    }

    for (int x=0; x<=4; x++) {
        for (int y=0; y<=4; y++)
            printf("%3d", a[x][y]);
        printf("\n");

    }

}