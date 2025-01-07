import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //programa que repita a leitura de uma senha até que seja valida. senha correta = 2002.

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a senha (numerica)");

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida.");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido.");

        sc.close();
    }
}