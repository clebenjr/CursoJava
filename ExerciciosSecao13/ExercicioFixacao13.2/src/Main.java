import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Anual income: ");
            double renda = scanner.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double gastosSaude = scanner.nextDouble();
                list.add(new Individual(name, renda, gastosSaude));
            } else {
                System.out.print("Number of employees: ");
                int nFuncionarios = scanner.nextInt();
                list.add(new Company(name, renda, nFuncionarios));
            }
        }

        double totalImpotos = 0;

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer taxPayer : list){
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.valorImposto()));
            totalImpotos += taxPayer.valorImposto();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalImpotos));

        scanner.close();
    }
}