import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2024-10-03");
        LocalDateTime d02 = LocalDateTime.parse("2025-01-03T12:12:12");
        Instant d03 = Instant.parse("2025-01-03T01:12:12Z");

        LocalDate semanaAnteriorLocalDate = d01.minusDays(7);
        LocalDate semanaSeguinteLocalDate = d01.plusDays(7);

        LocalDateTime semanaAnteriorLocalDateTime = d02.minusDays(7);
        LocalDateTime semanaSeguinteLocalDateTime = d02.plusDays(7);

        Instant semanaAnteriorInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant semanaSeguinteInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("semanaAnteriorLocalDate = " + semanaAnteriorLocalDate);
        System.out.println("semanaSeguinteLocalDate = " + semanaSeguinteLocalDate);

        System.out.println("semanaAnteriorLocalDateTime = " + semanaAnteriorLocalDateTime);
        System.out.println("semanaSeguinteLocalDateTime = " + semanaSeguinteLocalDateTime);

        System.out.println("semanaAnteriorInstant = " + semanaAnteriorInstant);
        System.out.println("semanaSeguinteInstant = " + semanaSeguinteInstant);

        //nao tem como fazer só com local date, precisa converter
        Duration t1 = Duration.between(semanaAnteriorLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t2 = Duration.between(semanaAnteriorLocalDateTime, d02);
        Duration t3 = Duration.between(semanaAnteriorInstant, d03);
        Duration t4 = Duration.between(d03, semanaAnteriorInstant);


        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());


    }
}