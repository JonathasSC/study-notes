#include <stdio.h>

int main(){

	char inputTarifa;
	float inputConsumo, VP;

	printf("Digite seu consumo em K/Wh: ");
	scanf("%f", &inputConsumo);

	printf("Digite sua tarifa: ");
	scanf("%s", &inputTarifa);

	if ( inputTarifa == 'A'){
		VP = 0.3 * (inputConsumo * 0.5);
		printf("Valor a pagar: r$ %.2f",VP);
	}

	if ( inputTarifa == 'B'){
		VP = 0.3 * (inputConsumo * 0.8);
		printf("Valor a pagar: r$ %.2f",VP);
	}

	if ( inputTarifa == 'C'){
		VP = 0.3 * (inputConsumo * 1);
		printf("Valor a pagar: r$ %.2f",VP);
	}

	return 0;
}