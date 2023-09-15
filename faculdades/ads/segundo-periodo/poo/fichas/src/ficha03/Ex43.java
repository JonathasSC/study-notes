package ficha03;

public class Ex43 {
    public Ex43() {
        int totalGrãos = 0;
        int quadradoAtual = 1;

        for (int i = 0; i < 64; i++) {
            totalGrãos += quadradoAtual;
            quadradoAtual *= 2;
        }

        System.out.println("O monge esperava receber um total de " + totalGrãos + " grãos.");
    }
}
