#include <stdio.h>

int inputInt(char string[])
{
    int response;
    printf("%s ", string);
    scanf("%i", &response);

    return response;
}

int main()
{
    int sum = 0;

    for (int count = 1; count <= 4; count++)
    {
        printf("%d numero", count);
        int num = inputInt(":");

        if (num % 2 == 0)
        {
            sum += num;
        }
    }

    printf("A soma dos pares = %d", sum);

    return 0;
}
