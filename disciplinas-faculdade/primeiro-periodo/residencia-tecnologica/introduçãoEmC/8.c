#include <stdio.h>
#include <stdlib.h>

float wage, commission, sales = 0;

int main () {

	printf("Qual o salario do vendedor? R$: ");
	scanf("%f", &wage);

	printf("Quanto o vendedor vendeu esse mes? R$: ");
	scanf("%f", &sales);

	commission =  ( 15 * sales ) / 100;
	
	printf("O salario fixo do vendedor e R$ %.2f \n", wage);
	printf("O vendedor vendeu esse mes R$ %.2f \n", sales);
	printf("e obteve R$%.2f em comissao \n", commission);

	printf("------------------------------------\n");

	printf("Valor bruto desse mes: R$ %.2f", wage + commission);

	return 0;
};
