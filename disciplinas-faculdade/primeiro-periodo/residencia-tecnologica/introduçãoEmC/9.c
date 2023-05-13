#include <stdio.h>
#include <stdlib.h>

int main () {
	int var1, var2, troca = 0;
	
	printf("Primeira variavel: ");
	scanf("%i",&var1);

	printf("Segunda variavel: ");
	scanf("%i",&var2);

	troca = var1;
	var1 = var2;
	var2 = troca;

	printf("A primeira variavel vale agora %i\n",var1);
	printf("A segunda variavel vale agora %i",var2);

	return 0;
}
