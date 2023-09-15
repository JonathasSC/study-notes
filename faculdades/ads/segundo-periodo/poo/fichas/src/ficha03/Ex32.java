package ficha03;

import java.util.Scanner;

public class Ex32 {
    public Ex32() {
        Scanner input = new Scanner(System.in);

        int num;
        int impares = 0;
        int soma_quadrados = 0;

        System.out.print("Digite um numero entre 1 e 10!: ");
        num = input.nextInt();

        while (num < 0 || num > 10) {
            System.out.print("Digite um número válido!: ");
            num = input.nextInt();
        }

        while (true) {

            if (num % 2 != 0) {
                soma_quadrados += num * num;

                impares++;
            }

            if (impares == 20) {
                break;
            }

            num++;

        }

        System.out.printf("A soma dos quadrados impares = %d", soma_quadrados);

        input.close();
    }
}
