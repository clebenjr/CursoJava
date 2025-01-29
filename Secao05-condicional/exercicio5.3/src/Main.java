import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa que lê dois valores inteiros e diz se são múltiplos ou não.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os valores.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % b == 0 || b % a == 0){
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos.");
        }
        sc.close();
    }
}