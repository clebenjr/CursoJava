import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //path: C:\Users\clebe\OneDrive\Documentos\Cursos\Curso Java\exercicios\ExerciciosSecao18-ProgramacaoFuncionalExpressoesLambda\ExercicioFixacao18.1\src\files\in.txt

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null){
                String[] employee = line.split(",");
                String name = employee[0];
                String email = employee[1];
                double salary = Double.parseDouble(employee[2]);
                list.add(new Employee(name, email, salary));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salarioComparacao = scanner.nextDouble();

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> emails = list.stream()
                    .filter(x -> x.getSalary() > salarioComparacao)
                    .map(p -> p.getEmail()).sorted(comp)
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            double somaSalarios = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x,y) -> x + y);

            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", somaSalarios));
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}