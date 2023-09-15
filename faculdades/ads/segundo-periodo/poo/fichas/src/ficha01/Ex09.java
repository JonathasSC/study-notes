package ficha01;

import java.util.Scanner;

public class Ex09 {
    public Ex09() {
        Scanner input = new Scanner(System.in);

        System.out.print("Anos: ");
        int years = input.nextInt();

        System.out.print("Meses: ");
        int months = input.nextInt();

        System.out.print("Dias: ");
        int days = input.nextInt();

        int days_total = (years * 365) + (months * 30) + days;
        System.out.printf("Você viveu %d dias", days_total);

        input.close();
    }
}
