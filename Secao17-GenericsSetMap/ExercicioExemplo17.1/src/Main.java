import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //path: C:\Users\clebe\OneDrive\Documentos\Cursos\Curso Java\exercicios\ExerciciosSecao17-GenericsSetMap\ExercicioExemplo17.1\src\files\in.txt

        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HHmmss'Z'");

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] lineRead = line.split(" ");
                String userName = lineRead[0];
                LocalDateTime instant = LocalDateTime.parse(lineRead[1], fmt);
                set.add(new LogEntry(userName,instant));
                line = br.readLine();
            }

            System.out.println("Total users: " + set.size());
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}