import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fazer um programa para ler um número inteiro e dizer se é negativo ou não.");
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número.");
        num = sc.nextInt();
        if(num < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}