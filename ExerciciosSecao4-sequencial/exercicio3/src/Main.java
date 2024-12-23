import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa que lê quatro inteiros e calcula a diferença do produto dos dois primeiros e dos dois últimos.");
        System.out.println("Insira os valores.");
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int prod1 = a * b;
        int prod2 = c * d;
        int dif = prod1 - prod2;
        System.out.println("A diferença é: " + dif);
        sc.close();
    }
}