package questoes;

import java.util.Scanner;

public class MaiorMenor {
    public MaiorMenor(){
        Scanner input = new Scanner(System.in);

        int number, maior = 0, menor = 0;

        for(int count = 1; count <= 5; count++){
            System.out.printf("Digite o %d número \n", count);
            number = input.nextInt();

            if (count == 1){
                maior = number;
                menor = number;
            } else {
                if (number >= maior) {
                    maior = number;
                }
                if (number <= menor){
                    menor = number;
                }
            }
        }

        System.out.printf("O maior número digitado foi: %d\n", maior);
        System.out.printf("O menor número digitado foi: %d\n", menor);
    }
}
