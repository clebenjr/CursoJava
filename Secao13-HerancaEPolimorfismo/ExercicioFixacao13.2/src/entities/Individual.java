package entities;

public class Individual extends TaxPayer{

   private Double gastosSaude;

   public Individual(){
       super();
   }

    public Individual(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double valorImposto(){

       double imposto;

       if (getRendaAnual() < 20000.0){
           imposto = getRendaAnual() * 0.15;
       } else {
           imposto = getRendaAnual() * 0.25;
       }

       if (getGastosSaude() > 0) {
           imposto -= (getGastosSaude() / 2);
       }

       return imposto;
   }
}


