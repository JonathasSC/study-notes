package ficha02;

import java.util.Scanner;

public class Ex15 {
    public Ex15() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float n1 = input.nextFloat();

        System.out.print("Nota 2: ");
        float n2 = input.nextFloat();

        System.out.print("Nota 3: ");
        float n3 = input.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Recuperação!");

            System.out.print("Nota Recuperação: ");
            float recuperacao = input.nextFloat();
            media += recuperacao;

            if (media < 7) {
                System.out.print("Reprovado!");
            }
        }
        input.close();
    }
}
