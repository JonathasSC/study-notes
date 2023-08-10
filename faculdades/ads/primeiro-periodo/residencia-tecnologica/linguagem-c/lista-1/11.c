#include <stdio.h>
#include <math.h>

int main() {
  float purchaseValue,amountPaid,change,reais,centavos;

  printf("Valor da compra: ");
  scanf("%f", &purchaseValue);

  printf("Pagamento do cliente: ");
  scanf("%f", &amountPaid);

  change = purchaseValue - amountPaid;

  reais = floor(change);
  centavos = change - reais;

  if(reais < 0){
    reais = reais * -1;
    printf("o valor do change é de %0.2f reais e %0.2f centavos", reais, centavos);
  
  }else if(amountPaid < purchaseValue){
    printf("ERRO: Essa operação não pode ser concluida, cliente não possui valor suficiente");

  }else{
    printf("Não é necessario change, cliente deu o valor exato da compra");
  }

}