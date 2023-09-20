package ficha04;

import java.util.Random;
import java.util.Scanner;

public class Ex50 {
    public Ex50() {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro gene: ");
        String firstGene = input.nextLine();

        System.out.println("Digite o segundo gene: ");
        String secondGene = input.nextLine();

        String[] resultingGenes = generateNewGenes(firstGene, secondGene);

        System.out.println("Genes resultantes: ");
        System.out.printf("%s\n", resultingGenes[0]);
        System.out.printf("%s", resultingGenes[1]);
        System.out.println("=====================================");

        input.close();
    }

    public String[] generateNewGenes(String firstGene, String secondGene) {

        Random random = new Random();
        int length = firstGene.length();

        int slicePoint = random.nextInt(length);

        String firstGeneChild = firstGene.substring(0, slicePoint) + secondGene.substring(slicePoint);
        String secondGeneChild = secondGene.substring(0, slicePoint) + firstGene.substring(slicePoint);

        String[] resultingGenes = { firstGeneChild, secondGeneChild };

        return resultingGenes;
    }
}
