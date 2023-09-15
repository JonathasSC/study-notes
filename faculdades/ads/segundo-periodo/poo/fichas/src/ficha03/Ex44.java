package ficha03;

import java.util.Scanner;

public class Ex44 {
    public Ex44() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Celsius em Fahrenheit");
            System.out.println("2 - Fahrenheit em Celsius");
            System.out.println("3 - Peso ideal ");
            System.out.printf(">>>: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Digite uma temperatura em Celsius: ");
                    float temperatureInCelsius = input.nextFloat();
                    System.out.printf("%.2f C = %.2f F \n", temperatureInCelsius, (9 * temperatureInCelsius + 160) / 5);
                    break;

                case 2:
                    System.out.println("Digite uma temperatura em Fahrenheit: ");
                    float temperatureInFahrenheit = input.nextFloat();
                    System.out.printf("%.2f F = %.2f C \n", temperatureInFahrenheit,
                            (temperatureInFahrenheit - 32) * 5 / 9);
                    break;

                case 3:
                    String sexo = input.toString();
                    float altura = input.nextInt();

                    sexo.toUpperCase();

                    if (sexo == "HOMEM") {
                        System.out.printf("Peso ideal: %f \n", (72.7 * altura) - 58);
                    } else if (sexo == "MULHER") {
                        System.out.printf("Peso ideal: %f \n", (62.1 * altura) - 44.7);
                    } else {
                        System.out.print("Sexo invalido!");
                    }
                    break;
            }

            System.out.print("Deseja continuar?: ");
            String continuar = input.next();
            continuar = continuar.toUpperCase();
            String positive = "S";
            if (continuar == positive) {
                continue;
            } else {
                break;
            }
        }

        input.close();
    }
}
