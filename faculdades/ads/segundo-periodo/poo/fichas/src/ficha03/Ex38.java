package ficha03;

import java.util.Scanner;

public class Ex38 {
    public Ex38() {
        Scanner input = new Scanner(System.in);
        char desejaEncerrar = 'N';

        do {

            System.out.println("==============================");
            System.out.println(" Número de horas trabalhadas: ");
            System.out.println("==============================");
            System.out.print(">>>: ");
            int horasTrabalhadas = input.nextInt();

            double salarioTotal;
            double salarioExcedente = 0;

            if (horasTrabalhadas <= 50) {
                salarioTotal = horasTrabalhadas * 10.0;
            } else {
                salarioTotal = 50 * 10.0;
                salarioExcedente = (horasTrabalhadas - 50) * 20.0;
            }

            System.out.println("==============================");
            System.out.printf(" Salário total: R$ %.2f", salarioTotal);
            System.out.printf(" Salário excedente: R$ %.2f", salarioExcedente);
            System.out.println("===================================");
            System.out.print("  Deseja encerrar o programa? (S/N): ");
            System.out.println("===================================");
            desejaEncerrar = input.next().charAt(0);

        } while (desejaEncerrar != 'S' && desejaEncerrar != 's');

        System.out.println("====================");
        System.out.println(" Programa encerrado ");
        System.out.println("====================");
        input.close();
    }
}
