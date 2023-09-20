package ficha04;

import java.util.Scanner;

public class Ex46 {
    public Ex46() {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        String numString = Integer.toString(num);

        for (int count = 0; count < numString.length(); count++) {
            int digito = Character.getNumericValue(numString.charAt(count));
            System.out.printf("%s, ", digitoPorExtenso(digito));
        }

        input.close();
    }

    public static String digitoPorExtenso(int digito) {
        String[] numeros = { "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove" };
        return numeros[digito];
    }
}
