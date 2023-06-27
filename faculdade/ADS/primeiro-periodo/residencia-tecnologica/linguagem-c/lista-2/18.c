#include <stdio.h>

int main(){
    int cont_macas;
    float valor;
    
    printf("Digite um valor: ");
    scanf("%i",&cont_macas);
    
    if (cont_macas < 12){
        valor = cont_macas * 0.30;
        printf("Sua compra ficou no valor de R$ %.2f", valor);
    } else {
        valor = cont_macas * 0.25;
        printf("Sua compra ficou no valor de R$ %2.f", valor);
    }
}