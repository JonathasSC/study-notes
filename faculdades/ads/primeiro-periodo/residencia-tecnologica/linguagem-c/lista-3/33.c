#include <stdio.h>

int calcularPares(int num1, int num2){
    int count = 0;
    int sum = 0;

    for (int num = num1; num <= num2; num++){
        num % 2 == 0 ? sum += num, count++ : sum;
    }

    return sum / count;
}

int main()
{
    int num1;
    int num2;

    printf("Digite um valor: ");
    scanf("%i", &num1);

    printf("Digite um valor: ");
    scanf("%i", &num2);

    printf("Media dos pares entre %i e %i: %i",num1, num2, calcularPares(num1, num2));
    return 0;
}
