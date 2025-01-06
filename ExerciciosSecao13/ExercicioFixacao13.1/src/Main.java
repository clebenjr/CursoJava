import entities.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("Product #%d data:\n", i);
            System.out.print("Commom, used or imported (c/u/i)? ");
            char ch = scanner.next().charAt(0);

            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();

            if (ch == 'c'){
                list.add(new Product(name, price));
            } else if (ch == 'u'){
                scanner.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = scanner.nextLine();
                DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                list.add(new UsedProduct(name, price, LocalDate.parse(date, fmt1)));
            } else  {
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");

        for (Product p : list){
            System.out.println(p.priceTag());
        }

        scanner.close();
    }
}