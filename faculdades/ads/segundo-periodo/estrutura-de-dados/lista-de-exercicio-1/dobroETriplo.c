#include <stdio.h>
#include <locale.h>

int main()
{
    int num;
    printf("digite um numero: ");
    scanf("%d", &num);

    if (num % 2 == 0)
    {
        printf("O dobro do numero %d = %d", num, num * 2);
    }
    else
    {
        printf("O triplo do numero %d = %d", num, num * 3);
    }
    /* code */
    return 0;
}
