import entities.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos empregados serao registrados? ");

        int n = scanner.nextInt();

        List<Empregado> lista = new ArrayList<>();


        for (int i = 0; i < n; i++){
            System.out.printf("Empregado #%d: \n", i + 1);
            System.out.print("Id: ");
            int id = scanner.nextInt();
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            lista.add(new Empregado(id, salario, nome));
        }

        System.out.println();
        System.out.print("Insira o id do funcionario que tera seu salario aumentado: ");
        int id = scanner.nextInt();

        Empregado emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(emp == null)
            System.out.println("Esse id nao esta registrado.");
        else {
            System.out.print("qual sera a porcentagem de aumento? ");
            double porcentagem = scanner.nextDouble();
            emp.aumentoSalarial(porcentagem);
        }
        System.out.println();
        System.out.println("Lista de empregados: ");
        for(Empregado obj : lista){
            System.out.println(obj);
        }

        scanner.close();
    }
}