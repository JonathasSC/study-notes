package ficha02;

import java.util.Scanner;

public class Ex16 {
    public Ex16() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite numero 1: ");
        int num1 = input.nextInt();

        System.out.print("Digite numero 2: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d > %d", num1, num2);
        }
        if (num2 > num2) {
            System.out.printf("%d > %d", num2, num1);
        }
        if (num1 == num2) {
            System.out.printf("%d = %d", num1, num2);
        }

        input.close();
    }
}
