package entities;

public class Studant {
    public String name;
    public double notaPrimeiroTrimestre;
    public double notaSegundoTrimestre;
    public double notaTerceiroTrimestre;

    public double notaFinal(){
        return notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
    }

    public void situacao(){
        if (notaFinal() > 60)
            System.out.println("PASS");
        else
            System.out.printf("FAILED\nMISSING %.2f POINTS\n", (60 - notaFinal()));
    }
}
