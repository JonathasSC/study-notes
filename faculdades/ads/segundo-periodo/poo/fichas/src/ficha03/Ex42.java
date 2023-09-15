package ficha03;

import java.util.Scanner;

public class Ex42 {
    public Ex42() {
        Scanner input = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int menor = Integer.MAX_VALUE; // Inicializa com o maior valor possível

        while (true) {
            System.out.print("Digite um número (0 para parar): ");
            numero = input.nextInt();

            if (numero == 0) {
                break; // Sai do loop quando o usuário digita 0
            }

            if (numero > maior) {
                maior = numero; // Atualiza o maior número
            }

            if (numero < menor) {
                menor = numero; // Atualiza o menor número
            }
        }

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            System.out.println("=======================");
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
            System.out.println("======================");
        }

        input.close();
    }
}
