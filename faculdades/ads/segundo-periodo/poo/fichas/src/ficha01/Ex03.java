package ficha01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex03 {
    public Ex03() {
        Scanner input = new Scanner(System.in);

        Map<Integer, String> employeesList = new HashMap<>();
        Map<Integer, String> productList = new HashMap<>();

        employeesList.put(0001, "Jonathas");
        employeesList.put(0002, "Paulo");
        employeesList.put(0003, "José");

        productList.put(0001, "Retrovisor");
        productList.put(0003, "Capacete");
        productList.put(0002, "Pneu");

        System.out.print("Enter employee ID: ");
        int id_employee = input.nextInt();

        String employee = employeesList.get(id_employee);

        if (employee == null) {
            System.out.println("Funcionário não encontrado");
        } else {
            System.out.printf("Funcionário: %s\n", employee);

            System.out.println("Enter product ID: ");
            int id_product = input.nextInt();

            String product = productList.get(id_product);

            if (product == null) {
                System.out.println("Produto não encontrado");
            } else {
                System.out.printf("Produto: %s\n", product);

                System.out.print("Digite o valor do produto: ");
                float product_value = input.nextFloat();

                System.out.print("Digite a quantidade vendida: ");
                float qnt_value = input.nextFloat();

                System.out.printf("%s ganhou R$%.2f em comissão", employee, (qnt_value * product_value) * 0.05);
            }
        }

        input.close();
    }
}