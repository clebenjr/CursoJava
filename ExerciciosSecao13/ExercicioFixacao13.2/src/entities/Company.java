package entities;

public class Company extends TaxPayer{

    private Integer numeroFuncionarios;

    public Company(){
        super();
    }

    public Company(String name, Double rendaAnual, Integer numeroFuncionarios) {
        super(name, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double valorImposto(){
        double imposto;

        if (getNumeroFuncionarios() > 10){
            imposto = getRendaAnual() * 0.14;
        } else {
            imposto = getRendaAnual() * 0.16;
        }

        return imposto;
    }
}
