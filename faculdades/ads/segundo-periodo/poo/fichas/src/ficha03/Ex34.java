package ficha03;

import java.util.Scanner;

public class Ex34 {
    public Ex34() {
        Scanner input = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int count = 1;

        while (true) {
            System.out.printf("Digite o %d numero: ", count);
            int num = input.nextInt();

            if (num < 0) {
                break;
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

        System.out.printf("maior = %d / menor = %d", maior, menor);

        input.close();
    }
}
