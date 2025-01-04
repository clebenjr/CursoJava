import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter birthDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String birth;

        Client client = new Client();

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        client.setName(scanner.nextLine());

        System.out.print("Email: ");
        client.setEmail(scanner.nextLine());

        System.out.print("Birth Date (DD/MM/YYYY): ");
        birth = scanner.nextLine();
        LocalDate d01 = LocalDate.parse(birth, birthDate);
        client.setBirthDate(d01);

        Order order = new Order();
        order.setClient(client);

        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        String status = scanner.nextLine();
        order.setStatus(OrderStatus.valueOf(status));

        order.setMoment(LocalDateTime.now());

        System.out.print("How many items to this order? ");
        int nItems = scanner.nextInt();
        for (int i = 1; i <= nItems; i++){
            System.out.printf("Enter #%d item data: \n", i);
            OrderItem item = new OrderItem();
            Product product = new Product();

            scanner.nextLine();
            System.out.print("Product name: ");
            product.setName(scanner.nextLine());

            System.out.print("Product price: ");
            product.setPrice(scanner.nextDouble());

            System.out.print("Quantity: ");
            item.setQuantity(scanner.nextInt());

            item.setProduct(product);
            order.addItem(item);
        }

        System.out.println(order);

        scanner.close();
    }
}