package ficha01;

import java.util.Scanner;

public class Ex07 {
    public Ex07() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Fahrenheit: ");

        float temperatureInFahrenheit = input.nextFloat();

        System.out.printf("%.2f F = %.2f C", temperatureInFahrenheit, (temperatureInFahrenheit - 32) * 5 / 9);
        input.close();
    }
}
