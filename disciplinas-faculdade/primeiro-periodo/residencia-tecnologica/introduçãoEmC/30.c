#include <stdio.h>

int main()
{
    int maiores_de_idade = 0;

    for (int pessoa = 1; pessoa <= 10; pessoa++){
        int idade;

        printf("Digite a idade da pessoa %i: ", pessoa);
        scanf("%i",&idade);

        if (idade >= 18){
            maiores_de_idade += 1;
        };
    }

    printf("%i pessoas sao maiores de idade", maiores_de_idade);

    return 0;
}
