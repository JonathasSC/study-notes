#include <stdio.h>

int main()
{	
    int maior_valor, valor_recebido = 0;
    for(int count = 1; count <= 20; count++){

        printf("Digite o %i valor: ", count);
        scanf("%i", &valor_recebido);

        if (count == 1){
            maior_valor = valor_recebido;
        } else {
            if (valor_recebido > maior_valor){
                maior_valor = valor_recebido;
            } else {
                maior_valor = maior_valor;
            }
        }
    }
    printf("O maior valor digitado foi: %i",maior_valor);

	return 0;
}