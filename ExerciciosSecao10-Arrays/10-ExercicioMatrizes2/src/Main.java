import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira as dimensoes m e n da matriz MxN: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Insira o valor presente na matriz que deseja verificar o redor: ");
        int valor = scanner.nextInt();

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (matriz[i][j] == valor){
                    System.out.printf("Posicao %d, %d: \n", i, j);
                    if ((j - 1) >= 0){
                        System.out.printf("Esquerda: %d\n", matriz[i][j - 1]);
                    }
                    if ((j + 1) <= m){
                        System.out.printf("Direita: %d\n", matriz[i][j + 1]);
                    }
                    if ((i - 1) >= 0){
                        System.out.printf("Cima: %d\n", matriz[i - 1][j]);
                    }
                    if ((i + 1) <= n){
                        System.out.printf("Baixo: %d\n", matriz[i + 1][j]);
                    }
                }

            }
        }

        scanner.close();
    }
}