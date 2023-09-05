import questoes.Calculadora;
import questoes.MaiorMenor;
import questoes.NomeIdade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("------------------------");
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Nome e idade ");
            System.out.println("2 - Calculadora ");
            System.out.print("3 - Maior e Menor\n> ");

            int option = input.nextInt();

            switch (option){
                case 1:
                    new NomeIdade();
                    break;

                case 2:
                    new Calculadora();
                    break;

                case 3:
                    new MaiorMenor();
                    break;

                default:
                    System.out.println("------------------------");
                    System.out.println("Digite uma opção valida.");
                    System.out.println("------------------------");
                    break;
            }
        }

    }
}