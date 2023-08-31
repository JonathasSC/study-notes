#include <iostream>
#include <locale>

using namespace std;

int notasADar(int valor, int valor_da_moeda)
{
    int qtn_de_notas = 0;

    while (valor >= valor_da_moeda)
    {
        valor -= valor_da_moeda; /*85*/
        qtn_de_notas++;
    };

    if (qtn_de_notas >= 1)
    {
        printf("%d notas de R$ %d \n", qtn_de_notas, valor_da_moeda);
    }

    return valor;
}

int main()
{
    setlocale(LC_ALL, "");
    int valor;
    cout << "Quanto dar de troco? ";
    cin >> valor;

    int nota_100 = 100;
    int nota_50 = 50;
    int nota_20 = 20;
    int nota_10 = 10;
    int nota_5 = 5;
    int nota_2 = 2;

    int moeda_1 = 1;
    int moeda_50 = .50;
    int moeda_25 = .25;
    int moeda_10 = .10;
    int moeda_5 = .5;

    // exemplo 185

    printf("Você precisa dar \n");

    valor = notasADar(valor, nota_100);
    valor = notasADar(valor, nota_50);
    valor = notasADar(valor, nota_20);
    valor = notasADar(valor, nota_10);
    valor = notasADar(valor, nota_5);
    valor = notasADar(valor, nota_2);

    valor = notasADar(valor, moeda_1);
    valor = notasADar(valor, moeda_50);
    valor = notasADar(valor, moeda_25);
    valor = notasADar(valor, moeda_10);
    valor = notasADar(valor, moeda_5);

    return 0;
}
