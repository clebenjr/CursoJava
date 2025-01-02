import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores vao ter cada vetor? ");

        int n = scanner.nextInt();

        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];
        int[] vetorSoma = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++){
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++){
            vetor2[i] = scanner.nextInt();
        }

        System.out.println("Vetor resultante: ");
        for (int i = 0; i < n; i++){
            vetorSoma[i] = vetor1[i] + vetor2[i];
            System.out.print(vetorSoma[i] + "\n");
        }

        scanner.close();
    }
}