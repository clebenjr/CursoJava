import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //leia n (numero de casos). cada caso consiste de 3 valores reais, apresente a media ponderada dos valores, com pesos 2, 3 e 5 para o 1, 2 e 3 respectivamente

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos casos você deseja testar?");

        double n = sc.nextInt();
        double x, y, z, mediaPonderada;

        for(int i = 0; i < n; i++){
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();
            mediaPonderada = (x * 2 + y * 3 + z * 5) / (2 + 3 + 5);
            System.out.printf("%.1f\n", mediaPonderada);
        }

        sc.close();
    }
}