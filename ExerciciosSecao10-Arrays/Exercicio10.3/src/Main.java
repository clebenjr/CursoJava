import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double soma = 0;
        int contador = 0;
        for (int i = 0; i < n; i++){
            soma += pessoas[i].getAltura();
            if (pessoas[i].getIdade() < 16)
                contador++;
        }
        double media = soma / n;

        double porcentagem =  ((double) contador / n) * 100;

        System.out.printf("Altura média: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.2f\n", porcentagem);

        for (int i = 0; i < n; i++){
            if(pessoas[i].getIdade() < 16)
                System.out.print(pessoas[i].getNome() + "\n");
        }

        scanner.close();
    }
}