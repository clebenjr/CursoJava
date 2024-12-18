import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa que lê o número de um funcionário, seu número de horas trabalhadas, o valor q recebe por hora e calcula o salário desse funcionário.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número do funcionário: ");
        int numFunc = sc.nextInt();
        System.out.println("Insira o número de horas: ");
        int horas = sc.nextInt();
        System.out.println("Insira o valor que o funcionário recebe por hora: ");
        double valorPorHora = sc.nextDouble();
        double salario = valorPorHora * horas;
        System.out.printf("NUMBER = " + numFunc);
        System.out.printf("SALARY = R$ %.2f", salario);
        sc.close();
    }
}