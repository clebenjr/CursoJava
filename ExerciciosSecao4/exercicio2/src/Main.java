import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("Programa para ler o valor do raio de um círculo e mostrar o valor da área desse círculo.");
       System.out.println("Insira o raio do círculo.");
       double PI = 3.14159;
       Scanner sc = new Scanner(System.in);
       double raio = sc.nextInt();
       double area = raio * raio * PI;
       System.out.printf("A área do círculo é: %.4f", area);
       sc.close();
    }
}