import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //path: C:\Users\clebe\OneDrive\Documentos\Cursos\Curso Java\exercicios\ExerciciosSecao17-GenericsSetMap\ExercicioFixacao17.2\src\files\in.txt

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String filePath = scanner.nextLine();
        Map<String, Integer> votes = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){

            String line = br.readLine();
            while (line != null) {

                String[] lineRead = line.split(",");
                String nameRead = lineRead[0];
                int votesRead = Integer.parseInt(lineRead[1]);

                if (votes.containsKey(nameRead)) {
                    int currentVotes = votes.get(nameRead);
                    votes.put(nameRead, currentVotes + votesRead);
                }
                else {
                    votes.put(nameRead, votesRead);
                }

                line = br.readLine();
            }
            for (String key : votes.keySet()){
                System.out.println(key + ": " + votes.get(key));
            }

        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}