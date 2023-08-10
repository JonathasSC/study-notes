#include <stdio.h>

int main(){
	int num;

	printf("Digite um numero: ");
	scanf("%i",&num);

	if (num == 0){
		printf("Numero Zero");
	} else {
		if (num > 0){
			printf("Numero Positivo");
		} else {
			printf("Numero Negativo");
		}
	}
}