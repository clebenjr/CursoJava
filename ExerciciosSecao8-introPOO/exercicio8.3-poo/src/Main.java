import entities.Studant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Studant estudante = new Studant();

        Scanner sc = new Scanner(System.in);

        estudante.name = sc.nextLine();
        estudante.notaPrimeiroTrimestre = sc.nextDouble();
        estudante.notaSegundoTrimestre = sc.nextDouble();
        estudante.notaTerceiroTrimestre = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n", estudante.notaFinal());
        estudante.situacao();

        sc.close();

    }
}