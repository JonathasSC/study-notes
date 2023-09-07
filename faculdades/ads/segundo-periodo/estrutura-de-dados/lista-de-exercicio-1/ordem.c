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

    for (int count = 0; count != 3; count++)
    {
        int num = inputInt("Digite um numero:");
        if (count == 0)
        {
            maior = num;
            medio = num;
            menor = num;
        }
        else
        {
            if (num > maior)
            {
                medio = maior;
                maior = num;
            }
            else if (num < menor)
            {
                medio = menor;
                menor = num;
            }
            else if (num > menor && num < maior)
            {
                medio = num;
            }
        }
    }

    printf("Os numeros em ordem ficam: %d, %d, %d", menor, medio, maior);

    return 0;
}
