#include <stdio.h>

main() {
  //19년도 3회 기출문제
  //재귀 함수 호출
  int i;
  printf("숫자를 입력하시오: ");
  scanf("%d", &i);
  recursive(i);
}

//n=5를 대입하면, 5,4,3,2,1까지 else 값으로 실행되어 저장된다.
//n=0이 되면, n<1이 true가 되므로 return 2를 하고, 그 값을 5번 돌려 계산해준다
//2*2+1 = 5, 11, 23, 47, 95값으로 95가 출력된다.
int recursive(int n) {
  int i;
  if (n<1) 
    return 2;
  else {
    i = 2 * (recursive(n-1)) + 1; //5,11,23,....
    printf("%d ", i);
    return i;
  }
}