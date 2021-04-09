#include <stdio.h>

main() 
{
  //217p
  //7명의 채점 점수 중 최하위 점수와 최상위 점수를 제외한
  //5명의 평균 점수를 구하는 코드 작성
  int m, min, max, hap, avg, i;
  int a[7];

  m = -1; //c언어의 배열 위치는 0부터 시작하므로, ++을 한 후 0이 되도록 초기값 지정

  do
  {
    m++;
    scanf("%d", &a[m]);
  } while (m < 6); //m이 6보다 작은 동안 값을 입력받음

  min = a[0];
  max = a[0];
  hap = a[0]; //최대, 최소, 합의 초기화를 배열의 첫 입력수로 정함
  i = 0;

  while(i < 6)
  {
    i++;
    hap += a[i];
    if (a[i] < min)
      min = a[i];
    if (a[i] > max)
      max = a[i];
  }
  hap = hap - (min+max);
  avg = hap / 5;
  printf("%d %d %d %d", min, max, hap, avg);
}