package ficha02;

import java.util.Scanner;

public class Ex13 {
    public Ex13() {
        Scanner input = new Scanner(System.in);
        int maior = 0;
        int medio = 0;
        int menor = 0;

        for (int count = 1; count <= 3; count++) {
            System.out.printf("Digite o %d numero: ", count);
            int num = input.nextInt();

            if (count == 1) {
                maior = num;
                medio = num;
                menor = num;

            } else {
                if (num > maior) {
                    medio = maior;
                    maior = num;
                }
                if (num < menor) {
                    medio = menor;
                    menor = num;
                }
            }
        }

        System.out.printf("%d %d %d", maior, medio, menor);

        input.close();
    }
}
