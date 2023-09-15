package ficha03;

import java.util.Scanner;

public class Ex39 {
    public Ex39() {
        Scanner input = new Scanner(System.in);
        while (true) {
            String response;
            int num;
            System.out.println("==================");
            System.out.println(" Digite um numero ");
            System.out.println("==================");
            System.out.printf(">>>: ");
            num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("=============");
                System.out.println(" Numero Par! ");
                System.out.println("=============");
            } else {
                System.out.println("===============");
                System.out.println(" Numero Impar! ");
                System.out.println("===============");
            }
            if (num > 0) {
                System.out.println("=================");
                System.out.println(" Numero Positivo ");
                System.out.println("=================");
            } else if (num < 0) {
                System.out.println("=================");
                System.out.println(" Numero negativo ");
                System.out.println("=================");
            } else {
                System.out.println("=============");
                System.out.println(" Numero zero ");
                System.out.println("=============");
            }

            System.out.println("===========================");
            System.out.println(" Digite 'S' voltar ao menu ");
            System.out.println("===========================");
            System.out.printf(">>>: ");

            response = input.next();
            response.toUpperCase();

            if (response.equalsIgnoreCase("S")) {
                continue;
            } else {
                break;
            }
        }
        input.close();
    }
}
