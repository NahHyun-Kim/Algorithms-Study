#include <stdio.h>

main() {

  //205p, 10진수를 입력받아 2진수로 변환하여 출력하기
  int b, bb, c, mok, nmg, i;
  int a[10];

  scanf("%d", &b);
  bb = b;
  c = -1; //배열의 첨자는 0부터 시작하므로, -1로 초기화한다(++하였을때 0이 되도록)

  do
  {
    c++; //배열 첨자 c 선증가
    mok = b / 2; //2로 나누어 나온 나머지 값을 배열에 저장
    a[c] = nmg;
    b = mok; //2로 나눈 나머지를 2진수 배열에 저장(역순), 몫 값을 그 다음 나눌 mok 으로 대입
  } while (mok != 0);
  printf("%d", bb);
  for (i=c; i>=0; i--)
    printf("%d", a[i]);
  
}