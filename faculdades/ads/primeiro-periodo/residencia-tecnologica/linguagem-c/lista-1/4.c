#include <stdio.h>
#include <stdlib.h>

int num1, num2;

int main () {
	printf("Digite um numero: ");
	scanf("%i",&num1);
	
	printf("Digite outro numero: ");
	scanf("%i",&num2);
	
	printf("A soma de %i + %i = %i \n",num1, num2, num1 + num2);
	printf("A multiplicação de %i * %i = %i \n",num1, num2 ,num1 * num2);
	printf("A divisao de %i * %i = %i \n",num1, num2 ,num1 / num2);
	
	return 0;
};
