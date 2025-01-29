import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a dimensao da matriz NxN: ");

        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        System.out.print("Insira os elementos da matriz: ");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        int contadorNegativos = 0;

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j)
                    System.out.printf("%d ", matriz[i][j]);
                if(matriz[i][j] < 0)
                    contadorNegativos++;
            }
        }

        System.out.println();
        System.out.printf("Numeros negativos = %d", contadorNegativos);

        scanner.close();
    }
}