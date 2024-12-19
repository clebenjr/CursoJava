import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa para ler um número inteiro e dizer se é par ou ímpar.");
        System.out.println("Insira o número.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
        sc.close();
    }
}