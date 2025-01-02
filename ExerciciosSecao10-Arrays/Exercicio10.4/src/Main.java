import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");

        int n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();
        }
        int contadorPares = 0;

        System.out.print("NUMEROS PARES: \n");
        for (int i = 0; i < n; i++){
            if(vetor[i] % 2 == 0){
                contadorPares++;
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();

        System.out.print("QUANTIDADE DE PARES = " + contadorPares);

        scanner.close();
    }
}