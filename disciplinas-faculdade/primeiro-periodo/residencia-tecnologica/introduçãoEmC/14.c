#include <stdio.h>

int main(){
	int num;

	printf("Digite um numero: ");
	scanf("%i",&num);

	if (num < 0){
		printf("O numero e negativo.");
	} else {
		if (num > 0){
			printf("O numero e positivo.");
		} else {
			printf("O numero e zero.");
		}
	}
}