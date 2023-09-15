package ficha03;

public class Ex35 {
    public Ex35() {
        for (int count = 1; count <= 100; count++) {
            if (count % 10 == 0) {
                System.out.printf("Multiplo de 10!\n", count);
            } else {
                System.out.printf("%d\n", count);
            }
        }
    }
}
