#include <stdio.h>

main() {

  //202p, 정수를 입력받아 소인수를 출력
  //알고리즘 : 어떤 수 X를 소인수 분해하려면 X를 2부터 X의 제곱근까지 숫자로 나누어떨어지게 하는 수를 검사
  //X를 처음으로 나누어떨어지게 하는 수가 있으면, 소수이며 X의 소인수가 된다.

  int b, c, d, e, mok, nmg;
  int a[100];

  scanf("%d", &b);
  c = -1; //c언어의 첨자변수 배열은 0부터 시작

  while(1) 
  {
    d = 2;
    e = (int)sqrt(b); //입력 받은 값 b의 제곱근을 구해 e에 저장

    while (1)
    {
      if (d>e)
      {
        d = b;
        break;
      }
      mok = b / d;

      nmg = b - mok * d; //나머지 값은 제수*몫의 값을 값에서 빼준다.
      if (nmg == 0) // 나누어 떨어지면
        break;
      else
        d++; //d값을 b의 제곱근 값인 e까지 증가시키고 나누어 소인수를 검사
    }
    c++;
    a[c] = d;
    if (b==d)
      break;
    b = mok;
  }
  for (int i=0; i<=c; i++)

    print("%d", a[i]);

}