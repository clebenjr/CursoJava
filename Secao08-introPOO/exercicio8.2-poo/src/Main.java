import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee empregado = new Employee();

        System.out.print("Name: ");
        empregado.name = sc.nextLine();

        System.out.print("Gross salary: ");
        empregado.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        empregado.tax = sc.nextDouble();

        System.out.println("Employee: " + empregado);

        System.out.print("Which percentage to increase salary? ");

        double porcentagem = sc.nextDouble();

        empregado.increaseSalary(porcentagem);

        System.out.print("Updated data: " + empregado);

        sc.close();
    }
}