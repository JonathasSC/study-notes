#include <stdio.h>
#include <stdlib.h>


int main (){
	
	float height, ray, area, volumn = 0.00;

	printf("Digite a altura do cilindro: ");
	scanf("%f", &height);
	
	printf("Digite o raio do cilindro ");
	scanf("%f", &ray);
	
	area = 2 * 3.1415926535898 * ray;
	volumn = 3.1415926535898 * ( ray * ray ) * height;
	
	printf("A area do cilindro e %.2fm2 e seu volume e %.2fm3", area, volumn );
	
	return 0;
};
