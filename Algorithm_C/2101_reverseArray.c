#include <stdio.h>

int main(){
    int arr[2][5] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    for (int i = 0; i < 2; i++){
        for (int j = 4; j >= 0; j--)
            printf("%2d", arr[i][j]);
        printf(" "); 
    }
    return 0;
}