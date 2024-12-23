import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ler n pares e mostrar a divisao do primeiro pelo segundo, se for 0 aparecer "divisao impossivel"

        Scanner sc = new Scanner(System.in);

        System.out.println("quantas divisoes deseja fazer?");

        double x, y;
        int n = sc.nextInt();

        System.out.println("insira os valores");

        for (int i = 0; i < n; i++){
            x = sc.nextDouble();
            y = sc.nextDouble();
            if (y == 0)
                System.out.println("divisão impossivel");
            else {
                System.out.printf("%.1f\n", x/y);
            }
        }

        sc.close();
    }
}