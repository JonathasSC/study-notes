package ficha03;

import java.util.Scanner;

public class Ex36 {
    public Ex36() {
        Scanner input = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int soma = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.printf("Digite o %d numero: ", count);
            int num = input.nextInt();

            if (count == 1) {
                maior = num;
                menor = num;

            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }

            soma += num;
        }

        System.out.printf("maior = %d / menor = %d\n", maior, menor);
        System.out.printf("A soma dos numeros digitados foi: %d", soma / 10);

        input.close();
    }
}
