#include <stdio.h>

int main(){
    int lado1, lado2, lado3;
    printf("Digite o 1s lado: ");
    scanf("%i",&lado1);
    printf("Digite o 2s lado: ");
    scanf("%i",&lado2);
    printf("Digite o 3s lado: ");
    scanf("%i",&lado3);
    
        
	if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado2 + lado1){
		if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
			printf("triangulo escaleno");
		} else if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
			printf("triangulo equilatero");
		} else {
			printf("triangulo isoceles");
		}
	} else {
		printf("Nao pode formar um triangulo");
	}
}