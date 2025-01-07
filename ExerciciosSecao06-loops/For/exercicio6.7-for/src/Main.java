import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ler n e mostrar n linhas com o primeiro valor sendo o numero da linha e os seguintes o quadrado e o cubo do primeiro valor

        Scanner sc = new Scanner(System.in);

        System.out.println("insira o valor");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("%d %d %d\n", i, i * i, i * i * i);
        }

        sc.close();
    }
}