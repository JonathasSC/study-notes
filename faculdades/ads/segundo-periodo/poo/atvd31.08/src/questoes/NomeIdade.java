package questoes;

import java.util.Scanner;

public class NomeIdade {
    public NomeIdade(){
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = input.next();

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        System.out.printf("Olá, %s! você tem %d anos!", nome, idade  );
    }
}
