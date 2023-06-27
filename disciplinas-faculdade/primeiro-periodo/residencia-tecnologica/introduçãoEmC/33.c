#include <stdio.h>

int main()
{   
    int sum = 0;
    int count = 0;

    for (int number = 13; number <= 73; number++ ){
        if ( number % 2 == 0 ){
            sum += number;
            count++;
        }
    }

    printf("Media dos pares entre 13 e 73: %i", sum / count);

    return 0;
}
