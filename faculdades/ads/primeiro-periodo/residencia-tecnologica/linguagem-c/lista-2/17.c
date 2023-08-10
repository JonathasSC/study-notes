#include <stdio.h>

int main() {
    int num1, num2;

    printf("digite um numero: ");
    scanf("%i", &num1);
    printf("digite outro numero: ");
    scanf("%i", &num2);

    if (num1 == num2){
        printf("Os numeros são iguais");
    } else {
        if (num1 > num2){
            printf("O maior numero é %i",num1);
        } else {
            printf("O maior numero é %i",num2);
        }
    }
}