#include <stdio.h>

int main()
{	
    for(int celsius = 50; celsius <= 65; celsius++ ){
        float fahrenheit = celsius * 1.8 + 32;
        printf("%i C = %.1f F \n", celsius, fahrenheit);
    }
	return 0;
}