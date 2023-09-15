package ficha02;

import java.util.Scanner;

public class Ex25 {
    public Ex25() {
        Scanner input = new Scanner(System.in);
        String sexo = input.toString();
        float altura = input.nextInt();

        sexo.toUpperCase();

        if (sexo == "HOMEM") {
            System.out.printf("Peso ideal: %f", (72.7 * altura) - 58);
        } else if (sexo == "MULHER") {
            System.out.printf("Peso ideal: %f", (62.1 * altura) - 44.7);
        } else {
            System.out.print("Sexo invalido!");
        }

        input.close();
    }
}
