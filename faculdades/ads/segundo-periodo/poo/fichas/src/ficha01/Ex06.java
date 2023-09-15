package ficha01;

import java.util.Scanner;

public class Ex06 {
    public Ex06() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");

        float temperatureInCelsius = input.nextFloat();

        System.out.printf("%.2f C = %.2f F", temperatureInCelsius, (9 * temperatureInCelsius + 160) / 5);
        input.close();
    }
}
