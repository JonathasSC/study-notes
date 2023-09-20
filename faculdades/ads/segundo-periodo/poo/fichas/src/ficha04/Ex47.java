package ficha04;

import java.util.Scanner;

public class Ex47 {
    public Ex47() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();
        scanner.close();

        String iniciais = obterIniciais(nome);
        System.out.println("Iniciais: " + iniciais);
    }

    public static String obterIniciais(String nome) {
        String[] conectores = { "e", "do", "da", "dos", "das", "de", "di", "du" };

        String[] palavras = nome.split(" ");

        StringBuilder iniciais = new StringBuilder();

        for (String palavra : palavras) {

            palavra = palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase();

            if (!ehConector(palavra, conectores)) {
                iniciais.append(palavra.charAt(0));
            }
        }

        return iniciais.toString();
    }

    public static boolean ehConector(String palavra, String[] conectores) {
        for (String conector : conectores) {
            if (palavra.equalsIgnoreCase(conector)) {
                return true;
            }
        }
        return false;
    }
}
