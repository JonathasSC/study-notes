#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x = 10, y = 20;
    int *ponteiro; // Declarando ponteiro
    ponteiro = &x; // Ponteiro aponta para X
    *ponteiro = y; // Ponteiro recebe valor de Y(20) e atribui á X

    printf("x: %i\ny: %i", x, y);
    getchar();
    return 0;
};