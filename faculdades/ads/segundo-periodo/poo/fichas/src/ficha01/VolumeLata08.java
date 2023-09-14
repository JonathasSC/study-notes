package ficha01;

import java.util.Scanner;

public class VolumeLata08 {
    public VolumeLata08() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio da lata: ");
        float radius = input.nextFloat();

        System.out.println("Digite a altura da lata: ");
        float height = input.nextFloat();

        System.out.printf("Volume da lata: %2.f ", 3.14159 * (radius * radius) * height);

        input.close();
    }
}
