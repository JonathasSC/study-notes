package ficha01;

import java.util.Scanner;

public class Ex05 {
    public Ex05() {
        Scanner input = new Scanner(System.in);

        System.out.print("Rendimento em KM/L: \n");
        float km_per_liter = input.nextFloat();

        System.out.print("Tempo médio da viagem: \n");
        float travel_time = input.nextFloat();

        System.out.print("Velocidade média em KM/H: \n");
        float travel_speed = input.nextFloat();

        float travel_distance = travel_time * travel_speed;

        System.out.printf("%.2f litros usados aproximadamente.", travel_distance / km_per_liter);

        input.close();
    }
}
