package entities;

public class Empregado {

    private Integer id;
    private String nome;
    private Double salario;

    public Empregado(Integer id, Double salario, String nome) {
        this.id = id;
        this.salario = salario;
        this.nome = nome;
    }

    public void aumentoSalarial(double porcentagem){
        this.salario *= (porcentagem + 100) / 100;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String toString(){
        return getId()
                + ", "
                + getNome()
                + ", "
                + String.format("%.2f", getSalario());
    }

}
