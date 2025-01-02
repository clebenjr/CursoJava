import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Quantos números voce vai digitar? ");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] vetor = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            vetor[i] = num;
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < n; i++){
            if(vetor[i] < 0){
                System.out.print(vetor[i] + "\n");
            }
        }

        scanner.close();
    }
}