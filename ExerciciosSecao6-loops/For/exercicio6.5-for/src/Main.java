import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //leia n e escreva seu respectivo fatorial

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero que deseja ver seu respectivo fatorial");

        int n = sc.nextInt();
        int fatorial = 1;

        for (int i = n; i > 0; i--){
            fatorial *= n;
            n--;
        }

        System.out.println(fatorial);

        sc.close();
    }
}