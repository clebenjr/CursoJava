import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");

        int n = scanner.nextInt();

        String nome;
        int idade;

        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa\n", i + 1);
            scanner.nextLine();
            System.out.print("Nome: ");
            nome = scanner.nextLine();
            System.out.print("Idade: ");
            idade = scanner.nextInt();
            pessoa[i] = new Pessoa(nome, idade);
        }

        int indiceMaisVelho = 0;

        for (int i = 0; i < n; i++){
            if (pessoa[i].getIdade() > pessoa[indiceMaisVelho].getIdade()){
                indiceMaisVelho = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + pessoa[indiceMaisVelho].getNome());

        scanner.close();
    }
}