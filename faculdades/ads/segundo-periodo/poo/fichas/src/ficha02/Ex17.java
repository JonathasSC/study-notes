package ficha02;

import java.util.Scanner;

public class Ex17 {
    public Ex17() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        System.out.println((num >= 0 || num <= 9) ? "Valido!" : "Invalido!");

        input.close();

    }
}
