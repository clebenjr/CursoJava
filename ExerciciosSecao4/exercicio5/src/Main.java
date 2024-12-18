import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa para ler código, número de peças e o valor unitário de duas peças, e ao final mostrar o valor total a ser pago.");

        int cod1, num1, cod2, num2;
        double val1, val2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código, número de peças e valor de cada peça da peça 1");

        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        val1 = sc.nextDouble();

        System.out.println("Insira o código, número de peças e valor de cada peça da peça 2");
        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        val2 = sc.nextDouble();

        double valor = num1 * val1 + num2 * val2;

        System.out.printf("VALOR A PAGAR: R$: %.2f", valor);
        sc.close();
    }
}