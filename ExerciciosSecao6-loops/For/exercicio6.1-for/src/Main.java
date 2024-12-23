import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //leia um inteiro e mostre os ímpares de 1 até x

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor");

        int x = sc.nextInt();

        for(int i = 1; i <= x; i = i + 2){
            System.out.println(i);
        }

        sc.close();
    }
}