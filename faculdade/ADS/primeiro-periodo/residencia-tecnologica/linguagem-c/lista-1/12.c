#include <stdio.h>
#include <stdlib.h>

int main()
{
	printf("A media entre 7, 8, 9 = %i \n", (7 + 8 + 9) / 3);
	printf("A media entre 4, 5, 6 = %i \n", (4 + 5 + 6) / 3);
	printf("A soma das duas medias = %i \n",((7 + 8 + 9) / 3) + ((4 + 5 + 6) / 3));
	printf("A media das medias = %i \n",(((7 + 8 + 9) / 3) + ((4 + 5 + 6) / 3))/2);

	return 0;
}
