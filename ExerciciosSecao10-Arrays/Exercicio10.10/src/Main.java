import entities.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");

        int n = scanner.nextInt();

        Aluno[] alunos = new Aluno[n];

        String nome;
        double n1, n2;

        for (int i = 0; i < n; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
            scanner.nextLine();
            nome = scanner.nextLine();
            n1 = scanner.nextDouble();
            n2 = scanner.nextDouble();
            alunos[i] = new Aluno(nome, n1, n2);
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++){
            if (alunos[i].getMedia() >= 6.0)
                System.out.print(alunos[i].getNome() + "\n");
        }

        scanner.close();
    }
}