import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //leia um inteiro que indicara quantos inteiros serao inseridos. apos isso, mostre quantos dos inteiros inseridos estao dentro e fora de [10,20]

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos inteiros serão inseridos?");

        int x, in = 0, out = 0, n = sc.nextInt();

        System.out.println("Insira os valores.");

        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            if(x >= 10 && x <= 20)
                in++;
            else
                out++;
        }

        System.out.printf(in + " in\n");
        System.out.printf(out + " out");

        sc.close();
    }
}