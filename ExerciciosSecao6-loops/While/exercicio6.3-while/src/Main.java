import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ver a preferencia pelos tipos de combustiveis

        Scanner sc = new Scanner(System.in);
        int alcool= 0, gasolina = 0, diesel = 0, verificador = 0;

        while (verificador != 4){
            verificador = sc.nextInt();
            if (verificador == 1)
                alcool++;
            else if (verificador == 2)
                gasolina++;
            else if (verificador == 3)
                diesel++;
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}