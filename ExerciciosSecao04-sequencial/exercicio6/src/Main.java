import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa que leia três valores com ponto flutuante de dupla precisão e calcula áreas de formas geométricas.");
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Insira os valores.");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double triangulo = (a * c) / 2;
        double circulo = c * c * 3.14159;
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;
        System.out.printf("TRINGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETÂNGULO: %.3f%n", retangulo);
        sc.close();
    }
}