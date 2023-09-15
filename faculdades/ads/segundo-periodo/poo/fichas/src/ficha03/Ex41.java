package ficha03;

import java.util.Scanner;

public class Ex41 {
    public Ex41() {
        Scanner input = new Scanner(System.in);
        char desejaEncerrar = 'N';

        do {
            System.out.println("===========================");
            System.out.println("Digite a idade do nadador: ");
            System.out.println("===========================");
            System.out.printf(">>>: ");
            int idade = input.nextInt();

            String categoria;

            if (idade >= 5 && idade <= 7) {
                categoria = "Infantil A";
            } else if (idade >= 8 && idade <= 11) {
                categoria = "Infantil B";
            } else if (idade >= 12 && idade <= 13) {
                categoria = "Juvenil A";
            } else if (idade >= 14 && idade <= 17) {
                categoria = "Juvenil B";
            } else {
                categoria = "Adultos";
            }

            System.out.println("===================");
            System.out.printf("Categoria: %c", categoria);
            System.out.println("===================");

            System.out.println("====================================");
            System.out.println(" Deseja encerrar o programa? (S/N): ");
            System.out.println("====================================");
            desejaEncerrar = input.next().charAt(0);
        } while (desejaEncerrar != 'S' && desejaEncerrar != 's');

        System.out.println("===================");
        System.out.println("Programa encerrado.");
        System.out.println("===================");
        input.close();
    }
}
