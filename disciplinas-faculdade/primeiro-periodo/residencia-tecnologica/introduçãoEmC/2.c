#include <stdio.h>
#include <stdlib.h>

int num;

int main () {
	printf("Digite um numero: ");
	
	scanf("%i",&num);
	
	printf("O antecessor de %i e igual a %i \n",num, num + 1);
	printf("O sucessor de %i e igual a %i",num,num - 1);
	
	return 0;
};
