import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //escrever um programa que leia o código de um item e a quantidade dele, e depois calcula o valor da conta a pagar
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código do produto e a quantidade deste produto.");

        int codigo = sc.nextInt();
        int qnt = sc.nextInt();
        double valor;

        switch (codigo) {
            case 1:
                valor = 4;
                break;
            case 2:
                valor = 4.5;
                break;
            case 3:
                valor = 5;
                break;
            case 4:
                valor = 2;
                break;
            case 5:
                valor = 1.5;
                break;
            default:
                valor = 0;
                System.out.println("Código incorreto.");
                break;
        }

        double conta = valor * qnt;

        System.out.printf("Total: R$ %.2f", conta);

        sc.close();
    }
}