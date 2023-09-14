import java.util.Scanner;

import ficha01.CalculaCombustivel05;
import ficha01.CalculoDistribuitivo04;
import ficha01.ComissaoVendedor03;
import ficha01.ConverterEmDias09;
import ficha01.ConverterMoedas02;
import ficha01.EstoqueMedio01;
import ficha01.FahrenheitEmCelsius07;
import ficha01.VolumeLata08;
import ficha01.CelsiusEmFahrenheit06;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("\n------------------------");
        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Estoque médio ");
        System.out.println("2 - Converter moedas ");
        System.out.println("3 - Comissão de vendas ");
        System.out.println("4 - Calculo Distributivo ");
        System.out.println("5 - Calculo Combustivel ");
        System.out.println("6 - Celsius em Fahrenheit ");
        System.out.println("7 - Fahrenheit em Celsius ");
        System.out.println("0 - SAIR ");

        System.out.print(">>> ");

        int choice = input.nextInt();

        if (choice == 1) {
            new EstoqueMedio01();
        }

        if (choice == 2) {
            new ConverterMoedas02();
        }

        if (choice == 3) {
            new ComissaoVendedor03();
        }

        if (choice == 4) {
            new CalculoDistribuitivo04();
        }

        if (choice == 5) {
            new CalculaCombustivel05();
        }

        if (choice == 6) {
            new CelsiusEmFahrenheit06();
        }

        if (choice == 7) {
            new FahrenheitEmCelsius07();
        }

        if (choice == 8) {
            new VolumeLata08();
        }

        if (choice == 9) {
            new ConverterEmDias09();
        }

        input.close();
    }
}