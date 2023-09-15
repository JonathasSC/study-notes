package ficha02;

import java.util.Scanner;

public class Ex21 {
    public Ex21() {
        Scanner input = new Scanner(System.in);

        int count = 1;
        while (true) {
            System.out.printf("Digite o %d numero (0 para PARAR): ", count);
            int num = input.nextInt();

            if (num > 0) {
                System.out.println("Numero positivo!");
            } else if (num < 0) {
                System.out.println("Numero negativo!");
            } else {
                System.out.println("Codigo encerrado!");
                break;
            }

            count++;
        }

        input.close();
    }
}
