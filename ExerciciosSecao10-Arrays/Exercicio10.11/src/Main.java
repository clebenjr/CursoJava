import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        Pessoa[] pessoas = new Pessoa[n];
        double altura;
        char genero;

        for (int i = 0; i < n; i++){
            scanner.nextLine();
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura = scanner.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero = scanner.next().charAt(0);
            pessoas[i] = new Pessoa(altura, genero);

        }

        double maiorAltura = pessoas[0].getAltura(), menorAltura = pessoas[0].getAltura(), mediaAlturaMulheres = 0, somaAlturaMulheres = 0;
        int nHomens = 0, nMulheres = 0;

        for (int i = 0; i < n; i++){
            if (pessoas[i].getAltura() > maiorAltura)
                maiorAltura = pessoas[i].getAltura();
            else if (pessoas[i].getAltura() < menorAltura)
                menorAltura = pessoas[i].getAltura();
            if (pessoas[i].getGenero() == 'F'){
                nMulheres++;
                somaAlturaMulheres += pessoas[i].getAltura();
            } else
                nHomens++;
        }

        mediaAlturaMulheres = somaAlturaMulheres / nMulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
        System.out.printf("Numero de homens = %d\n", nHomens);

        scanner.close();
    }
}