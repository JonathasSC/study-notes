package ficha03;

import java.util.Scanner;

public class Ex37 {
    public Ex37() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int choice, num1, num2;
            String response;

            System.out.println("===================");
            System.out.println(" 1 - Adição ");
            System.out.println(" 2 - Subtração ");
            System.out.println(" 3 - Multiplicação ");
            System.out.println(" 4 - Divisão ");

            System.out.println("===================");
            System.out.print(">>>: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("========");
                    System.out.println(" Adição ");
                    System.out.println("========");
                    System.out.println(" Digite o primeiro numero: ");
                    System.out.print(">>>: ");
                    num1 = input.nextInt();

                    System.out.println(" Digite o segundo numero: ");
                    System.out.print(">>>: ");
                    num2 = input.nextInt();

                    System.out.printf(" %d + %d = %d \n", num1, num2, num1 + num2);
                    break;

                case 2:
                    System.out.println("===========");
                    System.out.println(" Subtração ");
                    System.out.println("===========");
                    System.out.println(" Digite o primeiro numero: ");
                    System.out.print(">>>: ");
                    num1 = input.nextInt();

                    System.out.println(" Digite o segundo numero: ");
                    System.out.print(">>>: ");
                    num2 = input.nextInt();

                    System.out.printf(" %d - %d = %d \n", num1, num2, num1 - num2);
                    break;

                case 3:
                    System.out.println("===============");
                    System.out.println(" Multiplicação ");
                    System.out.println("===============");
                    System.out.println(" Digite o primeiro numero: ");
                    System.out.print(">>>: ");
                    num1 = input.nextInt();

                    System.out.println(" Digite o segundo numero: ");
                    System.out.print(">>>: ");
                    num2 = input.nextInt();

                    System.out.printf(" %d * %d = %d \n", num1, num2, num1 * num2);
                    break;

                case 4:
                    System.out.println("=========");
                    System.out.println(" Divisão ");
                    System.out.println("=========");
                    System.out.println(" Digite o primeiro numero: ");
                    System.out.print(">>>: ");
                    num1 = input.nextInt();

                    System.out.println(" Digite o segundo numero: ");
                    System.out.print(">>>: ");
                    num2 = input.nextInt();

                    System.out.printf(" %d * %d = %d \n", num1, num2, num1 * num2);
                    break;

                default:
                    System.out.println("=================");
                    System.out.println(" Opção invalida! ");
                    System.out.println("=================");
            }

            System.out.println("===========================");
            System.out.println(" Digite 'S' voltar ao menu ");
            System.out.println("===========================");
            System.out.printf(">>>: ");

            response = input.next();
            response.toUpperCase();

            if (response.equalsIgnoreCase("S")) {
                continue;
            } else {
                break;
            }

        }
        input.close();
    }
}