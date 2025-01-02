import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");

        int n = scanner.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            double num = scanner.nextDouble();
            vetor[i] = num;
        }

        double soma = 0;
        System.out.print("VALORES: ");
        for (int i = 0; i < n; i++){
            System.out.printf("%.1f ", vetor[i]);
            soma += vetor[i];
        }
        double media = soma / n;
        System.out.println();
        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f", media);

        scanner.close();
    }
}