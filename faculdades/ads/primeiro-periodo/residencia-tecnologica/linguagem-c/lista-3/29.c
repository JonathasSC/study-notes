#include <stdio.h>

int main()
{
	for (int count = 1; count != 5; count++){
	    int num;
	    
	    printf("digite um numero: ");
	    scanf("%i",&num);
	    
	    if (num >= 100 && num <= 200){
	        printf("Voce digitou um numero entre 100 e 200 \n");
	    } else {
	        printf("Voce digitou um numero fora da faixa entre 100 e 200 \n");
	    }
	}
}