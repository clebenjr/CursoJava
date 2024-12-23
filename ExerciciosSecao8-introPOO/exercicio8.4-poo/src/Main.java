import entities.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");

        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollar will be bought? ");

        double dollarQuantity = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amountInReais(dollarPrice, dollarQuantity));

        sc.close();
    }
}