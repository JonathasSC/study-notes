#include <stdio.h>

int main(){
	int num;

	printf("Digite um numero: ");
	scanf("%i",&num);

	if (num % 2 == 0){
		printf("Numero Par!");
	} else {
		printf("Numero Impar!");
	}
}