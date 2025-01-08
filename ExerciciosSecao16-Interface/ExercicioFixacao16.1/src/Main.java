import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero: ");
        int numero = scanner.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        scanner.nextLine();
        LocalDate data = LocalDate.parse(scanner.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double valor = scanner.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        Contract contract = new Contract(numero, data, valor);
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, numeroParcelas);

        System.out.println("Parcelas:");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        scanner.close();
    }
}