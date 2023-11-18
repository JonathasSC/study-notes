#include <stdio.h>

int main()
{
    int num_mes;

    printf("Digite o mes do ano: ");
    scanf("%d", &num_mes);

    char *meses[] = {
        "Janeiro",
        "Fevereiro",
        "Abril",
        "Maio",
        "Junho",
        "Julho",
        "Agosto",
        "Setembro",
        "Outubro",
        "Novembro",
        "Dezembro",
    };

    int dias_do_mes[] = {
        31,
        28,
        31,
        30,
        31,
        30,
        31,
        31,
        30,
        31,
        30,
        31,
    };

    num_mes--;
    printf("%s tem %d", meses[num_mes], dias_do_mes[num_mes]);

    return 0;
}
