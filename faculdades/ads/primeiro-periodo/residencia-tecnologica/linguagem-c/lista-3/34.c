#include <stdio.h>

int lerNumeros(int n, int intervalo1, int intervalo2){
    int input_num = 0;
    int count_satis = 0;
    int count_insatis = 0;

    for (int count = 0 ; count <= n; count ++){
        printf("Digite o %i numero ", count);
        scanf("%i", &input_num);

        input_num >= intervalo1 && input_num <= intervalo2
        ? count_satis++ 
        : count_insatis++;
    }

    printf("satisfazem %i \n", count_satis);
    printf("nao satisfazem %i", count_insatis);
    
    return 0;
}  


int main()
{
    lerNumeros(4, 10, 50);
    return 0;
}
