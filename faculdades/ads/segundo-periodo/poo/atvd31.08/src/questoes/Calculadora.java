package questoes;

import java.util.Scanner;
public class Calculadora {
    public Calculadora(){
        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.println("Digite um número: ");
        number1 = input.nextInt();

        System.out.println("Digite outro número: ");
        number2 = input.nextInt();

        System.out.printf("%d + %d = %d \n", number1, number1, number1 + number2);
        System.out.printf("%d - %d = %d \n", number1, number1, number1 - number2);
        System.out.printf("%d * %d = %d \n", number1, number1, number1 * number2);
        System.out.printf("%d / %d = %d \n", number1, number1, number1 / number2);
        System.out.printf("%d %% %d = %d \n", number1, number1, number1 % number2);
    }
}
