#include <stdio.h>
main() {
  int i,j,m,k;
  int arr[6] = {4,5,8,1,2,0};
  i = 0;

  while(arr[i] != 0) 
    i++;
  j = j-1;
  i = 0;
  m = (i+j) / 2;
  while(1)
  {
    //swap
    k = arr[i];
    arr[i] = arr[j];
    arr[j] = k;
    if (i==m)
      break;
    i++;
    j--;
  }
  for (i=0; i<=5; i++)
    printf("%d ", arr[i]);
}