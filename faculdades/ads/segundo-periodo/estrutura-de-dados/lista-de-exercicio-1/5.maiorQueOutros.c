#include <stdio.h>
#include <math.h>

int inputInt(char string[])
{
    int response;
    printf("%s ", string);
    scanf("%i", &response);

    return response;
}

int main()
{
    int num1 = inputInt("Digite o primeiro numero:");
    int num2 = inputInt("Digite o segundo numero:");
    int num3 = inputInt("Digite o terceira numero:");

    num1 > num2 + num3 ? printf("Primeiro maior que soma dos outros") : printf("Primeiro menor que soma dos outros");

    return 0;
}
