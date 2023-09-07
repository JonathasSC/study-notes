#include <stdio.h>
#include <locale.h>

float ReceiveInfoInt(char string[])
{
    int response = 0;

    printf("%s", string);
    scanf("%d", &response);

    return response;
}

float ReceiveInfoFloat(char string[])
{
    float response = 0;

    printf("%s", string);
    scanf("%f", &response);

    return response;
}

int main()
{
    int anos;
    int unidade_dia;
    float valor_carteira;

    anos = ReceiveInfoInt("Digite a quantos anos voce fuma: ");
    unidade_dia = ReceiveInfoInt("Digite quantos cigarros voce fuma diariamente: ");
    valor_carteira = ReceiveInfoFloat("Digite qual o valor da carteira de cigarro: ");

    int dias = anos * 365.25;
    int quant_fumado = dias * unidade_dia;

    float valor_unid = valor_carteira / 20;
    float valor_gasto = valor_unid * quant_fumado;

    printf("Voce fuma ha %d dias.\n", dias);
    printf("Voce ja fumou %d cigarros.\n", quant_fumado);
    printf("Voce ja gastou R$ %.2f em cigarros.\n", valor_gasto);

    return 0;
}
