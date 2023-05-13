#include <stdio.h>
#include <math.h>

int main()
{
    float a, b, c, D, x1, x2;

    printf("Diga os coeficientes a, b e c da equacao de segundo grau: ");
    scanf("%f %f %f", &a, &b, &c);

    D = pow(b, 2) - 4*a*c;

    if (D < 0)
    {
        printf("Nao existem raizes reais.\n");
    }
    else if (D == 0)
    {
        x1 = -b / (2*a);
        printf("Existe uma raiz real: x = %.2f\n", x1);
    }
    else
    {
        x1 = (-b + sqrt(D)) / (2*a);
        x2 = (-b - sqrt(D)) / (2*a);
        printf("Existem duas raizes reais: x1 = %.2f e x2 = %.2f\n", x1, x2);
    }

    return 0;
}