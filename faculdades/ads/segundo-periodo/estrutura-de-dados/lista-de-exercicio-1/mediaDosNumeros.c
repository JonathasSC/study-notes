#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int num;
    int sum = 0;
    int count = 0;
    float average;

    do
    {
        printf("Digite o %d numero: ", count);
        scanf("%d", &num);
        sum += num;
        count++;

    } while (num != 0);

    if (count > 0)
    {
        count--;
        average = sum / count;
    }

    printf("A média dos %d numeros digitados é %.2f", count, average);

    return 0;
}
