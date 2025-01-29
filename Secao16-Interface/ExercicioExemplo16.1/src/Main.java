import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String car = scanner.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), fmt);

        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), fmt);

        System.out.print("Entre com o preço por hora: ");
        double precoHora = scanner.nextDouble();

        System.out.print("Entre com o preco por dia: ");
        double precoDia = scanner.nextDouble();

        CarRental cr = new CarRental(start, finish, new Vehicle(car));
        RentalService service = new RentalService(precoHora, precoDia, new BrazilTaxService());
        service.processInvoice(cr);

        System.out.println("Fatura: ");
        System.out.printf("Pagamento básico: %.2f\n", cr.getInvoice().getBasicPayment());
        System.out.printf("Imposto: %.2f\n", cr.getInvoice().getTax());
        System.out.printf("Pagamento total: %.2f\n", cr.getInvoice().totalPayment());

        scanner.close();
    }
}