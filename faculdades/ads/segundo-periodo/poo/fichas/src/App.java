import java.util.Scanner;

import ficha01.Ex05;
import ficha01.Ex04;
import ficha01.Ex03;
import ficha01.Ex09;
import ficha01.Ex02;
import ficha01.Ex01;
import ficha01.Ex07;
import ficha01.Ex08;
import ficha02.Ex14;
import ficha02.Ex15;
import ficha02.Ex16;
import ficha02.Ex17;
import ficha02.Ex18;
import ficha02.Ex19;
import ficha02.Ex20;
import ficha02.Ex21;
import ficha02.Ex22;
import ficha02.Ex23;
import ficha02.Ex24;
import ficha02.Ex25;
import ficha03.Ex26;
import ficha03.Ex27;
import ficha03.Ex28;
import ficha03.Ex29;
import ficha03.Ex30;
import ficha03.Ex31;
import ficha03.Ex32;
import ficha03.Ex33;
import ficha03.Ex34;
import ficha03.Ex35;
import ficha03.Ex36;
import ficha03.Ex37;
import ficha03.Ex38;
import ficha03.Ex39;
import ficha03.Ex41;
import ficha03.Ex42;
import ficha03.Ex43;
import ficha03.Ex44;
import ficha02.Ex12;
import ficha02.Ex13;
import ficha02.Ex11;
import ficha01.Ex06;

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
        System.out.println("8 - Volume da lata ");
        System.out.println("9 - Converter em dias ");
        System.out.println("11 - Troca variaveis ");
        System.out.println("12 - Modulo do numero ");
        System.out.println("13 - Modulo do numero ");
        System.out.println("14 - Modulo do numero ");
        System.out.println("15 - Media de notas ");
        System.out.println("16 - Diga se forem iguais ");
        System.out.println("17 - Entre 0 e 9 ");
        System.out.println("18 - Digite o código ");
        System.out.println("19 - Lados do triângulo ");
        System.out.println("20 - Menor x Maior ");
        System.out.println("21 - Positivo ou negativo");
        System.out.println("22 - Negativo, positivo e zero");
        System.out.println("23 - Escolha o calculo");
        System.out.println("24 - Verifique o numero");
        System.out.println("25 - Peso ideal");

        System.out.print(">>> ");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                new Ex01();
                break;

            case 2:
                new Ex02();
                break;

            case 3:
                new Ex03();
                break;

            case 4:
                new Ex04();
                break;

            case 5:
                new Ex05();
                break;

            case 6:
                new Ex06();
                break;

            case 7:
                new Ex07();
                break;

            case 8:
                new Ex08();
                break;

            case 9:
                new Ex09();
                break;

            case 11:
                new Ex11();
                break;

            case 12:
                new Ex12();
                break;

            case 13:
                new Ex13();
                break;

            case 14:
                new Ex14();
                break;

            case 15:
                new Ex15();
                break;

            case 16:
                new Ex16();
                break;

            case 17:
                new Ex17();
                break;

            case 18:
                new Ex18();
                break;

            case 19:
                new Ex19();
                break;

            case 20:
                new Ex20();
                break;

            case 21:
                new Ex21();
                break;

            case 22:
                new Ex22();
                break;

            case 23:
                new Ex23();
                break;

            case 24:
                new Ex24();
                break;

            case 25:
                new Ex25();
                break;

            case 26:
                new Ex26();
                break;

            case 27:
                new Ex27();
                break;

            case 28:
                new Ex28();
                break;

            case 29:
                new Ex29();
                break;

            case 30:
                new Ex30();
                break;

            case 31:
                new Ex31();
                break;

            case 32:
                new Ex32();
                break;

            case 33:
                new Ex33();
                break;

            case 34:
                new Ex34();
                break;

            case 35:
                new Ex35();
                break;

            case 36:
                new Ex36();
                break;

            case 37:
                new Ex37();
                break;

            case 38:
                new Ex38();
                break;

            case 39:
                new Ex39();
                break;

            case 40:
                new Ex41();
                break;

            case 41:
                new Ex42();
                break;

            case 42:
                new Ex42();
                break;

            case 43:
                new Ex43();
                break;

            case 44:
                new Ex44();
                break;

            default:
                System.out.println("Questão inexistente!");
                break;
        }

        input.close();
    }
}