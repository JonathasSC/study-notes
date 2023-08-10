#include <stdio.h>
#include <stdlib.h>

float num1, num2 , result = 0;

int main () {
	printf("Digite um valor: ");
	scanf("%f",&num1);

	printf("Digite outro valor: ");
	scanf("%f",&num2);
	
	result = num1 * num2;
	printf("A multiplição de %.2f x %.2f = %.2f",num1,num2,result);
	
	return 0;
}


