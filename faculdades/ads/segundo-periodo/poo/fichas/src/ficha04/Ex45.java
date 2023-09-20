package ficha04;

import java.util.Scanner;

public class Ex45 {
    public Ex45() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String myString = input.nextLine();
        int contadorDigitos = 0;

        System.out.println("=====================================");
        System.out.printf("Sua palavra tem %d letras\n", myString.length());
        System.out.println("=====================================");
        System.out.printf("Sua palavra em maiuscula é: %s\n", myString.toUpperCase());
        System.out.println("=====================================");

        if (myString.endsWith("RIO")) {
            System.out.println("Sua palavra termina com RIO");
        }

        if (myString.startsWith("UNI")) {
            System.out.println("Sua palavra começa com UNI");
        }

        for (int i = 0; i < myString.length(); i++) {
            char caractere = myString.charAt(i);
            if (Character.isDigit(caractere)) {
                contadorDigitos++;
            }
        }

        System.out.println("=====================================");
        System.out.println("A quantidade de dígitos na String é: " + contadorDigitos);

        myString.toLowerCase();
        boolean palindromo = isPalindromo(myString);
        if (palindromo) {
            System.out.println("=====================================");
            System.out.println("É um palíndromo.");
            System.out.println("=====================================");
        } else {
            System.out.println("=====================================");
            System.out.println("Não é um palíndromo.");
            System.out.println("=====================================");
        }

        input.close();
    }

    public static boolean isPalindromo(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
