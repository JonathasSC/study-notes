package ficha02;

import java.util.Scanner;

public class Ex19 {
    public Ex19() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        float A = input.nextFloat();

        System.out.print("Digite o lado B: ");
        float B = input.nextFloat();

        System.out.print("Digite o lado C: ");
        float C = input.nextFloat();

        if (A + B > C && A + C > B && B + C > A) {
            if (A != B && A != C && B != C) {
                System.out.println("Triangulo Equilatero");
            }
            if (A == B && A == C && B == C) {
                System.out.println("Impossivel formar um triangulo");
            }
        } else {
            System.out.println("Impossivel formar um triangulo");
        }

        input.close();

    }
}
