package ficha01;

import java.util.Scanner;

public class EstoqueMedio01 {
    Scanner input = new Scanner(System.in);

    public EstoqueMedio01() {

        System.out.println("Digite a quantidade minima: ");
        int qnt_minima = input.nextInt();

        System.out.println("Digite a quantidade maxima: ");
        int qnt_maxima = input.nextInt();

        float qnt_media = (qnt_minima + qnt_maxima) / 2;

        System.out.printf("A média de peças é %.2f", qnt_media);

        input.close();
    }

}