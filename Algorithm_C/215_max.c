#include <stdio.h>

main() {
  //215p
  //10개의 수를 배열에 저장 후, 가장 큰 값을 출력
  int i;
  int a[10];
  int j=-1; max=0; //배열 0부터 시작하도록 j++할 때 0이 되도록 초기값 지정

  do
  {
    j++;
    scanf("%d", &a[j]);
  } while (j < 9); //10개의 값 입력(0~9)

  for (i=0; i<=9; i++)

  {
    if (a[i] > max)
    max = a[i];
  }

  printf("%d", max);
  
}