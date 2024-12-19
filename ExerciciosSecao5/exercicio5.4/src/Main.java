import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa que lê a hora inicial e a final de um jogo e calcula a duração total.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os horários no formato HH:MM");
        String h1 = sc.nextLine();
        String h2 = sc.nextLine();

        LocalTime t1 = LocalTime.parse(h1);
        LocalTime t2 = LocalTime.parse(h2);
        Duration duracao;

        if (t2.isBefore(t1)) {
            long totalMinutos = 24 * 60;
            totalMinutos -= (t1.getHour() * 60 + t1.getMinute());
            totalMinutos += (t2.getHour() * 60 + t2.getMinute());
            duracao = Duration.ofMinutes(totalMinutos);
        } else {
            duracao = Duration.between(t1, t2);
        }

        long h = duracao.toHours();
        long m = duracao.toMinutes() % 60;

        if (h1.equals(h2)) {
            System.out.println("O jogo durou 24 horas.");
        } else {
            System.out.printf("O jogo durou %d hora(s) e %d minuto(s).%n", h, m);
        }

        sc.close();
    }
}
