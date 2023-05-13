#include <stdio.h>

int main(){
	int num1, num2, option;

	printf("Digite um numero ");
	scanf("%i",&num1);
	printf("Digite outro numero ");
	scanf("%i",&num2);

	printf("Qual operacao deseja realizar?\n"
	       "1- Soma\n"
	       "2- Subtracao\n"
	       "3- Divisao\n"
	       "4- multiplicacao\n: ");
	scanf("%i",&option);
	
	switch(option){
	    case 1:
	        printf("A soma dos dois valores = %d", num1 + num2);
	        break;
	        
	    case 2:
	         printf("A subtração dos dois valores = %d", num1 - num2);
	         break;
	         
	    case 3:
	         printf("A Divisão dos dois valores = %d", num1 / num2);
	         break;
	         
	    case 4:
	         printf("A Multiplicacao dos dois valores = %d", num1 * num2);
	         break;
	}
}
