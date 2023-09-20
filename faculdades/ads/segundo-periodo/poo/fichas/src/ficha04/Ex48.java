package ficha04;

import java.util.Scanner;

public class Ex48 {
    public Ex48() {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.print("Digite uma frase: ");
        String myString = input.nextLine();

        String[] splitted = myString.split(" ");

        int total = 0;
        for (int i = 0; i <= splitted.length - 1; i++) {
            if (splitted[i] != null) {
                total++;
            }
        }

        System.out.println("=====================================");
        System.out.printf("Sua frase tem %d letras\n", myString.length());
        System.out.printf("Sua frase tem %d palavras\n", total);
        System.out.println("=====================================");

        input.close();
    }
}
