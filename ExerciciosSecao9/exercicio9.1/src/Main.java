import entities.ContaBancaria;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta;

        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String nome = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char depositoInicial = sc.next().charAt(0);
        double valor;

        if(depositoInicial == 'n')
            conta = new ContaBancaria(numeroConta, nome);
        else {
            System.out.print("Enter initial deposit value: ");
            valor = sc.nextDouble();
            conta = new ContaBancaria(numeroConta, nome, valor);

        }


        System.out.print("Account data: \n" + conta + "\n");

        System.out.print("Enter a deposit value: ");
        valor = sc.nextDouble();
        conta.deposito(valor);
        System.out.print("Updated account data:\n" + conta + "\n");

        System.out.print("Enter a withdraw value: ");
        valor = sc.nextDouble();
        conta.saque(valor);
        System.out.print("Updated account data:\n" + conta + "\n");

        sc.close();
    }
}