package ficha02;

import java.util.Scanner;

public class Ex18 {
    public Ex18() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.print("Código: um");
                break;
            case 2:
                System.out.print("Código: dois");
                break;
            case 3:
                System.out.print("Código: três");
                break;

            default:
                System.out.print("Código inválido.");
        }
        input.close();
    }
}
