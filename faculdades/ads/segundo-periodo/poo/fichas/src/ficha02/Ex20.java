package ficha02;

import java.util.Scanner;

public class Ex20 {
    public Ex20() {
        Scanner input = new Scanner(System.in);
        int count = 1;

        int maior = 0;
        int menor = 0;

        while (count <= 3) {
            System.out.printf("Digite o %d numero: ", count);
            int num = input.nextInt();

            while (num <= 0) {
                System.out.println("Invalido!");
                System.out.print("Digite outro numero: ");

                num = input.nextInt();
            }

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

            count++;
        }

        System.out.printf("%d * %d = %d", menor, maior, menor * maior);
        System.out.printf("%d / %d = %d", maior, menor, maior / menor);

        input.close();
    }
}
