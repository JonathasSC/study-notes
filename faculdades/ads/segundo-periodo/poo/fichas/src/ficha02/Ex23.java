package ficha02;

import java.util.Scanner;

public class Ex23 {

    public Ex23() {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Escolha uma opção: ");

        System.out.println("1 - Adição: ");
        System.out.println("2 - Substração: ");
        System.out.println("3 - Multiplicação: ");
        System.out.println("4 - Divisão: ");

        System.out.print(">>> ");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Digite o primeiro numero: ");
                num1 = input.nextInt();

                System.out.print("Digite o segundo numero: ");
                num2 = input.nextInt();

                System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
                break;

            case 2:
                System.out.print("Digite o primeiro numero: ");
                num1 = input.nextInt();

                System.out.print("Digite o segundo numero: ");
                num2 = input.nextInt();

                System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
                break;

            case 3:
                System.out.print("Digite o primeiro numero: ");
                num1 = input.nextInt();

                System.out.print("Digite o segundo numero: ");
                num2 = input.nextInt();

                System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
                break;

            case 4:
                System.out.print("Digite o primeiro numero: ");
                num1 = input.nextInt();

                System.out.print("Digite o segundo numero: ");
                num2 = input.nextInt();

                System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
                break;

            default:
                System.out.print("Opção Invalida");
        }

        input.close();
    }
}
