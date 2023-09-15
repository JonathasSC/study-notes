package ficha02;

import java.util.Scanner;

public class Ex22 {
    public Ex22() {
        Scanner input = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        if (num < 0) {
            A = num;
            System.out.printf("A(positivo) = %d", A);
        }
        if (num > 0) {
            B = num;
            System.out.printf("B(negativo) = %d", B);
        }
        if (num == 0) {
            C = num;
            System.out.printf("C(zero) = %d", C);
        }

        input.close();
    }
}
