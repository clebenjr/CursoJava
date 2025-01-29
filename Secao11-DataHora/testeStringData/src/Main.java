import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);

        String date = scanner.nextLine();

        System.out.println("data inserida como string = " + date);

        LocalDate d01 = LocalDate.parse(date, fmt1);

        System.out.println("LocalDate d01 = " + d01);

        System.out.println("testando com data e hora agora");

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        String datahora = scanner.nextLine();

        System.out.println("data e hora inseridas como string = " + datahora);

        LocalDateTime d02 = LocalDateTime.parse(datahora, fmt2);

        System.out.println("LocalDateTime d02 = " + d02);

        scanner.close();
    }
}