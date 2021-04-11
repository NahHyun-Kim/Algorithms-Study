##include <stdio.h>

main() {
    //276p, 선택 정렬(오름차순)
    int m, i, j, k, x;
    int data[10];
    m = -1; //배열의 위치가 0부터 시작, data의 첨자 m이 m+1시 0이 되도록 초기화

    do
    {
        m++;
        scanf("%d", &data[m]);
    } while (m<9); //data[0]~data[9]까지 10개의 데이터를 입력받음

    i = -1; // 배열 data의 첨자 0부터 시작, 초기화 값 -1 (순서도에서는 1부터 시작하므로 초기값 0으로 줌)
    do
    {
        i++;
        j = i;
        do
        {
            j++;
            if (data[i] > data[j]) //앞에 있는 data[i]의 값이 data[j]보다 크다면
            { //swap 로직
                k = data[i]; //k는 data[i]와 data[j]를 교환하기 위해 필요한 임시 변수
                data[i] = data[j]; //더 작은 값인 data[j]를 앞쪽인 data[i]로 이동
                data[j] = k; //더 큰 값인 data[j] 자리에 data[i] 값(임시 변수 k에 저장중)을 이동

            }
        } while (j < 9); //j가 9보다 작은 동안(0~9, 10번 수행)
   } while (i < 8); //i는 맨 처음 변수로, 가장 마지막 9값까지 비교할 필요 없음(i크기 배열 = i-1, 배열첨자로는 0~n-1이므로 그 값에서 -1)

    for (x=0; x<=9; x++)
        printf("%d ", data[x]); //배열 첨자 0부터 9까지 총 10개의 값 출력

}