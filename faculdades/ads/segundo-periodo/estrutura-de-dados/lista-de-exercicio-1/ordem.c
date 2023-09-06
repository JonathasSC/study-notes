#include <stdio.h>
#include <math.h>

int inputInt(char string[])
{
    int response;
    printf("%s ", string);
    scanf("%i", &response);

    return response;
}

char inputString(char string[])
{
    char response;
    printf("%s ", string);
    scanf("%s", &response);

    return response;
}

float inputFloat(char string[])
{
    float response;
    printf("%s ", string);
    scanf("%f", &response);

    return response;
}

int main()
{
    int menor;
    int medio;
    int maior;

    int num1 = inputInt("Digite o primeiro numero:");
    int num2 = inputInt("Digite o segundo numero:");
    int num3 = inputInt("Digite o terceira numero:");

    return 0;
}
