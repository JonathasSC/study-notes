#include <stdio.h>
#include <stdlib.h>


int main () {
	int note200, note100, note50, note20, note10, note5, note2, note1 = 0;
	int rest200, rest100, rest50, rest20, rest10, rest5, rest2, rest1 = 0;
	int withdraw = 0;

	printf("Digite quanto quer sacar: ");
	scanf("%d",&withdraw);

	note200 = withdraw / 200;
	rest200 = withdraw % 200;

	note100 = rest200 / 100;
	rest100 = rest200 % 100;

	note50 = rest100 / 50;
	rest50 = rest100 % 50;
	
	note20 = rest50 / 20;
	rest20 = rest50 % 20;

	note10 = rest20 / 10;
	rest10 = rest20 % 10;

	note5 = rest10 / 5;
	rest5 = rest10 % 5;

	note2 = rest5/ 2;
	rest2 = rest5 % 2;

	note1 = rest2 / 1;
	rest1 = rest2 % 1;

	printf("Sacando...\n");

	if (note200 >= 1)
	{
		printf("%d notas R$200\n",note200);
	}
	if (note100 >= 1)
	{
		printf("%d notas R$100\n",note100);
	}
	if (note50 >= 1)
	{
		printf("%d notas R$50\n",note50);
	}
	if (note20 >= 1)
	{
		printf("%d notas R$20\n",note20);
	}
	if (note10 >= 1)
	{
		printf("%d notas R$10\n",note10);
	}
	if (note5 >= 1)
	{
		printf("%d notas R$5\n",note5);
	}
	if (note2 >= 1)
	{
		printf("%d notas R$2\n",note2);
	}
	if (note1 >= 1)
	{
		printf("%d notas R$1\n",note1);
	}

	return 0;
}