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
    float latao = inputFloat("Quantidade de latao desejada (em gramas):");
    float cobre = latao * 0.7;
    float zinco = latao * 0.3;

    printf("Sera necessario\n");

    printf("%.2fg de cobre\n", cobre);
    printf("%.2fg de zinco\n", zinco);

    return 0;
}
