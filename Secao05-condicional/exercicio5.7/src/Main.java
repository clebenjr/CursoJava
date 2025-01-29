import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exercicio que le 2 valores com uma casa decimal (x e y) e determina o quadrante ao qual pertence ou se está sobre os eixos ou sobre a origem

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os valores de x e y.");

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x > 0){
            if (y > 0)
                System.out.println("Q1");
            else if (y < 0)
                System.out.println("Q4");
            else
                System.out.println("Eixo X");
        } else if (x < 0){
            if (y > 0)
                System.out.println("Q2");
            else if (y < 0)
                System.out.println("Q3");
            else
                System.out.println("Eixo X");
        } else if (y == 0)
                System.out.println("Origem");
        else
            System.out.println("Eixo Y");

        sc.close();
    }
}