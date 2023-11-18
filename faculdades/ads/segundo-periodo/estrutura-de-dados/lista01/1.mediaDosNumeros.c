#include <stdio.h>

float inputFloat(char string[])
{
    float response;
    printf("%s ", string);
    scanf("%f", &response);

    return response;
}

int main()
{
    float num1 = inputFloat("Digite o primeiro numero:");
    float num2 = inputFloat("Digite o segundo numero:");

    if (num2 != 0)
    {
        float result = num1 / num2;
        printf("O quociente dos numeros: %.2f", result);
    }
    else
    {
        printf("Divisao por zero");
    }

    return 0;
}
