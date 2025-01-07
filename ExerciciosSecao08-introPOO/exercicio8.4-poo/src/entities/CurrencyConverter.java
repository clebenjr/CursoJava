package entities;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double amountInReais(double dollarPrice, double dollarQuantity){
        return (dollarPrice * dollarQuantity) * (1 + IOF);
    }
}
