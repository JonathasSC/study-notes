#include <stdio.h>

int main()
{	
    int multiplo = 0;
    
    printf("Digite um número: ");
    scanf("%i", &multiplo);
    
	for (int count = 0; count <= 10; count++){
	    int resultado = multiplo * count;
	    printf("%i × %i = %i\n", multiplo, count, resultado);
	};
	
	return 0;
}