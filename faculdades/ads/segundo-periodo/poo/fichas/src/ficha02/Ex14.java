package ficha02;

import java.util.Scanner;

public class Ex14 {
    public Ex14() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1 numero: ");
        int num1 = input.nextInt();

        System.out.print("Digite o 2 numero: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
        } else {
            System.out.printf("%d - %d = %d", num2, num1, num2 - num1);
        }

        input.close();
    }
}