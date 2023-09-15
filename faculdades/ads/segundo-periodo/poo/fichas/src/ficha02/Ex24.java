package ficha02;

import java.util.Scanner;

public class Ex24 {
    public Ex24() {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Escolha uma opção: ");

        System.out.println("1 - Verificar se são multiplos ");
        System.out.println("2 - Verificar se são pares ");
        System.out.println("3 - Media >= 7: ");
        System.out.println("4 - Sair: ");

        System.out.print(">>> ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Digite o primeiro numero: ");
                num1 = input.nextInt();

                System.out.print("Digite o segundo numero: ");
                num2 = input.nextInt();

                if (num1 % num2 == 0 || num2 % 2 == 0) {
                    System.out.println("Os numeros são multiplos.");
                } else {
                    System.out.println("Os numeros NÃO são multiplos.");
                }
                break;

            case 2:
                System.out.print("Digite o primeiro numero: ");
                num1 = input.nextInt();

                System.out.print("Digite o segundo numero: ");
                num2 = input.nextInt();

                if (num1 % 2 == 0) {
                    System.out.printf("%d é par", num1);
                } else {
                    System.out.printf("%d é impar", num1);
                }

                if (num2 % 2 == 0) {
                    System.out.printf("%d é par", num2);
                } else {
                    System.out.printf("%d é impar", num2);
                }

                break;

            case 3:
                System.out.print("Digite o primeiro numero: ");
                num1 = input.nextInt();

                System.out.print("Digite o segundo numero: ");
                num2 = input.nextInt();

                if ((num1 + num2) / 2 >= 7) {
                    System.out.println("media dos numeros maior que 7.");
                } else {
                    System.out.println("media dos numeros menor que 7.");
                }
                break;

            case 4:
                System.out.println("Saindo...");
                break;
        }

        input.close();
    }
}
