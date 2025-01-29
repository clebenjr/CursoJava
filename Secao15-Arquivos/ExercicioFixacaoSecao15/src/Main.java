import entities.Produto;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //caminho: "C:\\Users\\clebe\\OneDrive\\Documentos\\Cursos\\Curso Java\\exercicios\\ExerciciosSecao15-Arquivos\\ExercicioFixacaoSecao15\\src\\files\\arquivoExercicioSecao15.csv";

        List<Produto> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        File entrada = new File(path);
        String pasta = entrada.getParent();
        boolean sucesso = new File(pasta + "\\out").mkdir();

        String saida = pasta + "\\out\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] produto = line.split(";");
                lista.add(new Produto(produto[0], Double.parseDouble(produto[1]), Integer.parseInt(produto[2])));
                line = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(saida))){

                for(Produto p : lista){
                    bw.write(p.toSring());
                    bw.newLine();
                }

            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Erro inesperado");
            }

        }
        catch (IOException | NumberFormatException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }
        finally {
                scanner.close();
        }
    }
}