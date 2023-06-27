#include <stdio.h>
#include <stdlib.h>


int main (){
	
	float num, result = 0.00;

	printf("Digite o raio do circulo: ");
	scanf("%f", &num);
	
	result = 3.1415926535898 * (num * num);
	
	printf("A area do circulo de raio  %.2f e igual a %.2f m2",num,result);
	
	return 0;
};
