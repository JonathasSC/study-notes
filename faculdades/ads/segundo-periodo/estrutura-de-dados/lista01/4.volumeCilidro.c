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
    float pi = 3.14;

    float raio_cilindro = inputFloat("Raio do cilindro em cm:");
    float altura_cilindro = inputFloat("Altura do cilindro em cm:");

    float volume = pi * pow(raio_cilindro, 2) * altura_cilindro;

    printf("Volume = %.2fcm^2", volume);

    return 0;
}