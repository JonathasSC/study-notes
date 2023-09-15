package ficha02;

import java.util.Scanner;

public class Ex12 {
    public Ex12() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.printf("O modulo de %d = %d", num, num);
        } else {
            System.out.printf("O modulo de %d = %d", num, num * -1);
        }

        input.close();
    }
}
