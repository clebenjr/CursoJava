import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle " + "width and height:");
        retangulo.height = sc.nextDouble();
        retangulo.width = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", retangulo.area());
        System.out.printf("PERIMETER = %.2f\n", retangulo.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", retangulo.diagonal());

        sc.close();
    }
}