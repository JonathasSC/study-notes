package ficha03;

import java.util.Scanner;

public class Ex31 {
    public Ex31() {
        Scanner input = new Scanner(System.in);

        int num = 1;
        int soma_par = 0;
        int soma_impar = 0;

        while (num > 0) {
            System.out.print("Digite um numero (negativo para parar): ");
            num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("Par! ");
                soma_par += num;
            } else {
                System.out.println("Impar! ");
                soma_impar += num;
            }
        }

        System.out.printf("A soma dos pares = %d\n", soma_par);
        System.out.printf("A soma dos impares = %d", soma_impar);

        input.close();
    }
}
