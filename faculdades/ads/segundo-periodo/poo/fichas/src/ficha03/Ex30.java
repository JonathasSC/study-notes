package ficha03;

import java.util.Scanner;

public class Ex30 {
    public Ex30() {
        Scanner input = new Scanner(System.in);

        System.out.print("Veja a tabuada de: ");
        int num = input.nextInt();

        for (int count = 1; count <= 10; count++) {
            System.out.printf("%d * %d = %d\n", num, count, num * count);
        }

        input.close();
    }
}
