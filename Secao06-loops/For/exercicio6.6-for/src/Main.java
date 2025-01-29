import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //leia n e calcule seus divisores

        Scanner sc = new Scanner(System.in);

        System.out.println("insira o valor que deseja descobrir os divisores");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if (n % i == 0)
                System.out.println(i);
        }

        sc.close();
    }
}