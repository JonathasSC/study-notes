package ficha03;

import java.util.Scanner;

public class Ex27 {
    public Ex27() {
        System.out.print("Fatorial do numero: ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int multi = 1;

        while (num != 1) {
            multi *= num;
            num--;
        }

        System.out.printf("Resultado: %d", multi);

        input.close();
    }
}
