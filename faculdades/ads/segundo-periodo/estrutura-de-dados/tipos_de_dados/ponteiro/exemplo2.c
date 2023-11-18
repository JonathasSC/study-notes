#include <stdio.h>

int main()
{
    int x = 10;
    int *pointer;
    pointer = &x;
    printf("O valor de X é: %i", x);
    printf("Endereço de memória de X é: %i\n", &x);
    printf("Ponteiro aponta para: %i\n", pointer);
    printf("Ponteiro aponta para: %i\n", *pointer);
    getchar();
    return 0;
}