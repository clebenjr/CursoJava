import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");

        int n = scanner.nextInt();

        double[] vetor = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }
        double media = soma / n;

        System.out.printf("MEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < n; i++){
            if(vetor[i] < media)
                System.out.printf("%.2f\n", vetor[i]);
        }

        scanner.close();
    }
}