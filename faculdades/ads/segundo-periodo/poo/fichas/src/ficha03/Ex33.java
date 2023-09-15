package ficha03;

import java.util.Scanner;

public class Ex33 {
    public Ex33() {
        Scanner input = new Scanner(System.in);

        float soma = 0;
        int count = 0;

        while (true) {
            System.out.print("Numero da matricula ( negativo para parar ): ");
            int matricula = input.nextInt();

            if (matricula < 0) {
                if (count > 0) {
                    System.out.printf("A média dos alunos nessa prova é: %.2f%n", soma / count);
                } else {
                    System.out.println("Nenhum aluno foi avaliado.");
                }
                break;
            }

            System.out.print("Nota: ");
            float nota = input.nextFloat();

            soma += nota;
            count++;
        }
        input.close();
    }
}
