package ficha04;

import java.util.Scanner;

public class Ex49 {
    public Ex49() {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.print("Digite uma frase: ");
        String myString = input.nextLine();

        System.out.println("=====================================");
        System.out.println("Sua frase remontada:");
        System.out.printf("%s\n", myString.trim());
        System.out.println("=====================================");

        input.close();
    }
}
