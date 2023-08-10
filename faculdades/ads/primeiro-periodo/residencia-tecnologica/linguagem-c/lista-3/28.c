#include <stdio.h>

int main(){

    int soma = 0;
    
	for (int count = 1; count <= 100; count++){
	    soma += count;
        printf("%d\n", soma);
	}
	
	return 0;
}