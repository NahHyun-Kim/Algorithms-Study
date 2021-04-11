##include <stdio.h>

main()
{
    //301p, 석차 구하기 알고리즘(높은 점수일수록 1등이다.)
    //만약 달리기 기록같이, 기록이 적어야 1등에 가까워진다면 부등호 방향 반대로(자신값>상대값 이라면 자신의 등수 +1)
    int m, n, i, j;
    int jumsu[10], rank[10];

    m = -1; //배열의 위치가 0으로 시작, m++을 수행 후 0이 되도록 초기화

    do{
        m++;
        scanf("%d", &jumsu[m]);
    } while (m<9); //배열 첨자 0~9까지 10개의 점수를 입력받음
    n = 9; //배열의 끝 위치(0~9까지 총 10개)
    i = 0; //배열의 시작 위치(0~9까지 총 10개, 0부터 시작)

    while (i <= n)
    {
        rank[i] = 1; //모든 점수는 우선적으로 1등으로 가정한 후, 비교를 통해 석차를 정한다.
        i++;
    }
    i = 0; //배열의 위치인 0으로 초기화
    while (i <= n)
    {
        j = 0;
        while (j <= n) //자기 자신 i와 비교하는 j값을 전체 갯수(배열첨자 0~9, 10개)와 비교
            {
                if (jumsu[i] < jumsu[j]) // 자신보다 상대 점수가 높다면
                    rank[i]++; // 석차가 1등수 밀려남(예 : 자기 자신이 70, 상대가 80이라면 난 2등이 된다.)
                j++;
            }
            i++; // 수행 후 while (i<=n)으로 이동하여 다시 자신 값 증가 후, j값 전체와 비교 수행
    }

    for(int x=0; x<10; x++)
        printf("%d ", jumsu[x]); //jumsu 값 모두 출력
    printf("\n");

    for(int x=0; x<10; x++)
        printf("%d ", rank[x]); //rank 값 모두 출력
}