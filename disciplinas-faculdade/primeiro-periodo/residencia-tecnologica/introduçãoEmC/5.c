#include <stdio.h>
#include <stdlib.h>

float num;

int main () {
	printf("Digite um numero em centimetros: ");
	scanf("%f",&num);
	
	printf("%.2f e igual a %.2f polegadas",num, num / 2.54);
	
	return 0;
};
