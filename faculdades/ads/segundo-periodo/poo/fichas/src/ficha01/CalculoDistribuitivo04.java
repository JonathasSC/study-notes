package ficha01;

import java.util.Scanner;

public class CalculoDistribuitivo04 {

    public CalculoDistribuitivo04() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor para A: ");
        int A = input.nextInt();

        System.out.println("Digite um valor para B: ");
        int B = input.nextInt();

        System.out.println("Digite um valor para C: ");
        int C = input.nextInt();

        System.out.println("Digite um valor para D: ");
        int D = input.nextInt();

        int sumAB = A + B;
        int sumAC = A + C;
        int sumAD = A + D;

        int sumBC = B + C;
        int sumBD = B + D;

        int sumCD = C + D;

        int multAB = A * B;
        int multAC = A * C;
        int multAD = A * D;

        int multBC = B * C;
        int multBD = B * D;

        int multCD = C * D;

        // Sum
        System.out.printf("A + B = %d\n", sumAB);
        System.out.printf("A + C = %d\n", sumAC);
        System.out.printf("A + D = %d\n", sumAD);

        System.out.printf("B + C = %d\n", sumBC);
        System.out.printf("B + D = %d\n", sumBD);

        System.out.printf("C + D = %d\n", sumCD);

        // Multi
        System.out.printf("A * B = %d\n", multAB);
        System.out.printf("A * C = %d\n", multAC);
        System.out.printf("A * D = %d\n", multAD);

        System.out.printf("B * C = %d\n", multBC);
        System.out.printf("B * D = %d\n", multBD);

        System.out.printf("C * D = %d\n", multCD);

        input.close();
    }
}
