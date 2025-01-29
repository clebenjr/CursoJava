import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");

        int n = scanner.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
        }

        double maior = vetor[0];
        int posicao = 0;

        for (int i = 0; i < n; i++){
            if (maior < vetor[i]){
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", posicao);

        scanner.close();
    }
}