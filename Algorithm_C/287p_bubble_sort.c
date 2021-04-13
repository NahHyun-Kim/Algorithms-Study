#include <stdio.h>

main()
{
    //287p, 버블정렬 + 데이터 교환이 일어나지 않으면 체크 후 종료(flag 변수 생각하기)
    int n, i, j, sw, cnt, k;
    int data[10];
    n = -1; //배열의 첨자가 0부터 시작하므로 시작값 -1로 초기화(n+1해서 0부터 시작하도록)

    do
    {
        n++;
        scanf("%d", &data[n]);
    } while (n<9); //배열의 0번지부터 9번지까지 10개의 데이터를 입력받음
    cnt = 0;

    for (i = 1; i <= 9; i++)
    {
        sw = 0; // 한 회전이 돌아올때마다 데이터의 변화 여부를 체크하는 sw 변수를 0으로 초기화
        for (j=0; j<= (9-i); j++)
        {
            if (data[j] > data[j+1])
            {
                k = data[j];
                data[j] = data[j+1];
                data[j+1] = k;

                cnt++;
                sw = 1; // 데이터 위치의 변환이 있었으므로 sw=1로 지정
            }
        }
        if (sw == 0)
            break; // 더 이상 데이터 위치의 변환이 없으면, 정렬이 끝난 것이므로 종료

    }

    printf("%d ", cnt);
    for(int x=0; x <=9; x++)
        printf("%d ", data[x]); //배열의 위치 0~9번지의 값을 출력

}
