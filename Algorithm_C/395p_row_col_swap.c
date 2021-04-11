##include <stdio.h>

main() {
    //395p, 행 열 변환하기
    //ex)3행 4열에 들어간 1~12까지의 숫자를 4행 3열로 변환

    int row, col, i, j, L, m;

    scanf("%d %d", &row, &col);
    int a[row][col];
    int b[row][col];
    int k = 0;

    for (i=0; i<=row-1; i++) { //배열 첨자가 0부터 시작하여, row-1까지
        for (j=0; j<=col-1; j++) {
            m += 1;
            b[L][m] = a[i][j];
            if (m >= row-1) {
                //만약 a[3][5]가 b[5][3] 이라면? 만약 b의 m(3)이 a의 row(3)보다 커지면 행을 증가해야 함
                //따라서 b의 열인 m이 a의 행에 대응하므로(행, 열 변환) row-1보다 큰지 비교하여 크면 다음 행으로 넘김
                L++; //배열 b의 열 m이 배열 a의 행보다 크다면, 행 증가
                m = -1; // m+=1 수행 후 0이 되도록 초기화
            }
        }

    }

    for (int x=0; x<col; x++)
    {
        for (int y=0; y<row; y++)
            printf("%3d", b[x][y]); //b배열 출력
        printf("\n");
    }

}