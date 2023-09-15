package ficha03;

import java.util.Scanner;

public class Ex40 {
    public Ex40() {
        Scanner input = new Scanner(System.in);
        char desejaEncerrar = 'N';

        do {
            System.out.print("Digite o índice de poluição medido: ");
            double indicePoluicao = input.nextDouble();

            if (indicePoluicao >= 0.05 && indicePoluicao <= 0.25) {
                System.out.println("Índice de poluição aceitável.");
            } else if (indicePoluicao <= 0.3) {
                System.out.println("Indústrias do 1º grupo devem continuar monitorando.");
            } else if (indicePoluicao <= 0.4) {
                System.out.println("Indústrias do 1º e 2º grupo devem suspender suas atividades.");
            } else if (indicePoluicao <= 0.5) {
                System.out.println("Todos os grupos devem paralisar suas atividades.");
            } else {
                System.out.println("Índice de poluição fora de controle. Evacue a área imediatamente.");
            }

            System.out.print("Deseja encerrar o programa? (S/N): ");
            desejaEncerrar = input.next().charAt(0);
        } while (desejaEncerrar != 'S' && desejaEncerrar != 's');

        System.out.println("Programa encerrado.");
        input.close();
    }
}
