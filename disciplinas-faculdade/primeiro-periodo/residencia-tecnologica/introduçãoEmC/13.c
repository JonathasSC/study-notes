#include <stdio.h>
#include <stdlib.h>

int main() {
	float factoryValue,tax,dealer;

	printf("Qual o valor de fabrica do veiculo? R$");
	scanf("%f",&factoryValue);

	tax = factoryValue * 0.45;
	dealer = factoryValue * 0.28;

	printf("O valor total do veiculo: R$%.2f",factoryValue + tax + dealer);

	return 0;
}
