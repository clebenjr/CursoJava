import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números.");
        System.out.println("Insira os valores para serem somados.");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = x + y;
        System.out.println("Soma = " + soma);
        sc.close();
    }
}