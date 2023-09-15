package ficha02;

import java.util.Scanner;

public class Ex11 {
    public Ex11() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = input.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = input.nextInt();

        int troca = A;
        A = B;
        B = troca;

        System.out.printf("Valor de A = %d e B = %d", A, B);

        input.close();
    }
}