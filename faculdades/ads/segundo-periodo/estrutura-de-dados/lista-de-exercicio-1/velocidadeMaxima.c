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
    float vel_max = inputFloat("Informe a velocidde maxima da via:");
    float vel_mot = inputFloat("Informe a velocidde do motorista:");

    float vel_acima = vel_mot - vel_max;

    if (vel_acima > 0 && vel_acima < 11)
    {
        printf("A multa sera de R$ 50");
    }
    else if (vel_acima >= 11 && vel_acima <= 30)
    {
        printf("A multa sera de R$ 100");
    }
    else if (vel_acima >= 31)
    {
        printf("A multa sera de R$ 200");
    }
    else
    {
        printf("Sem multa! boa viagem.");
    }

    return 0;
}
