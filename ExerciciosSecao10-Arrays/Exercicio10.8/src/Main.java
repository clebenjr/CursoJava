import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");

        int n = scanner.nextInt();

        int[] vetor = new int[n];
        int contadorPares = 0, somaPares = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (vetor[i] % 2 == 0){
                contadorPares++;
                somaPares += vetor[i];
            }
        }

        double mediaPares = (double) somaPares / contadorPares;

        if (contadorPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
        }

        scanner.close();
    }
}