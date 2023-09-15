package ficha01;

import java.util.Scanner;

public class Ex02 {
    public Ex02() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dollar rate: ");
        float dollar = input.nextFloat();

        System.out.println("Enter the value to be converted: ");
        float value_in_dollar = input.nextFloat();

        float value_in_real = value_in_dollar * dollar;
        System.out.printf("US$ %.2f = BRL %.2f ", value_in_dollar, value_in_real);
        input.close();
    }
}