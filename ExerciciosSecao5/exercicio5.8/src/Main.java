import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ler um valor com duas casas decimais, equivalente a um salario, e calcule o valor que essa pessoa deve pagar de imposto de renda
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o salário.");

        double salario = sc.nextDouble();
        double imposto = 0;

        if(salario <= 2000) {
            System.out.println("Isento");
            return;
        }
        else if (salario <= 3000)
            imposto = (salario - 2000) * 0.08;
        else if (salario <= 4500)
            imposto = (1000 * 0.08) + ((salario - 3000)  * 0.18);
        else
            imposto = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28);

        System.out.printf("R$ %.2f", imposto);

        sc.close();
    }
}