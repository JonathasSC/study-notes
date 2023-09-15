package ficha03;

import java.util.Scanner;

public class Ex44 {
    public Ex44() {
        Scanner input = new Scanner(System.in);

        while (true) {

            Float celsius;
            Float fahrenheit;

            String sexo;
            double altura;
            double peso_ideal;

            String response = "S";

            System.out.println("===========================");
            System.out.println(" 1 - celsius em fahrenheit ");
            System.out.println(" 2 - fahrenheit em celsius ");
            System.out.println(" 3 - Peso ideal            ");

            System.out.println("===========================");
            System.out.printf(">>>: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("=======================");
                    System.out.println(" celsius em fahrenheit ");
                    System.out.println("=======================");

                    System.out.println(" Temperatura em celsius");
                    System.out.print(">>>: ");
                    celsius = input.nextFloat();

                    fahrenheit = (9 * celsius + 160) / 5;
                    System.out.printf("%.2f C = %.2f F \n", celsius, fahrenheit);
                    break;

                case 2:
                    System.out.println("==========================");
                    System.out.println("   fahrenheit em celsius  ");
                    System.out.println("==========================");

                    System.out.println(" Temperatura em fahrenheit");
                    System.out.print(">>>: ");
                    fahrenheit = input.nextFloat();

                    celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.printf("%.2f F = %.2f C \n", fahrenheit, celsius);
                    break;

                case 3:
                    System.out.println("================");
                    System.out.println(" Ver peso ideal ");
                    System.out.println("================");

                    System.out.println(" Digite seu sexo [M ou F]: ");
                    System.out.print(">>>: ");
                    sexo = input.next();

                    System.out.println(" Digite sua altura: ");
                    System.out.print(">>>: ");
                    altura = input.nextFloat();

                    if (sexo.equalsIgnoreCase("F")) {
                        peso_ideal = (62.1 * altura) - 44.7;
                        System.out.printf(" Seu peso ideal é: %fkg ", peso_ideal);
                    }

                    if (sexo.equalsIgnoreCase("M")) {
                        peso_ideal = (72.7 * altura) - 58;
                        System.out.printf(" Seu peso ideal é: %.2fkg \n", peso_ideal);
                    }

                    break;

                default:
                    System.out.println("=================");
                    System.out.println(" Opção inválida! ");
                    System.out.println("=================");
                    break;
            }

            System.out.println("===========================");
            System.out.println(" Digite 'S' para continuar ");
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
