package entities;

public class ContaBancaria {

    private int numeroConta;
    private String nome;
    private double saldo;

    public ContaBancaria(int numeroConta, String nome, double saldo){
        this.numeroConta = numeroConta;
        this.nome = nome;
        deposito(saldo);
    }

    public ContaBancaria(int numeroConta, String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        saldo -= (valor + 5);
    }

    public String toString(){
        return "Account "
                + this.numeroConta
                + ", Holder: "
                + this.nome
                + ", Balance: $ "
                + String.format("%.2f", getSaldo());
    }

}
