#include <stdio.h>

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

int main()
{
    int lado1 = inputInt("Digite o primeiro lado:");
    int lado2 = inputInt("Digite o segundo lado:");
    int lado3 = inputInt("Digite o terceiro lado:");

    if (lado1 < lado2 + lado3 &&
        lado2 < lado1 + lado3 &&
        lado3 < lado2 + lado1)
    {
        if (lado1 != lado2 &&
            lado1 != lado3 &&
            lado2 != lado3)
        {
            printf("triangulo escaleno");
        }
        else if (lado1 == lado2 &&
                 lado1 == lado3 &&
                 lado2 == lado3)
        {
            printf("triangulo equilatero");
        }
        else
        {
            printf("triangulo isoceles");
        }
    }

    else
    {
        printf("Nao pode formar um triangulo");
    }
}