package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
            double valorBase = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            double interest = onlinePaymentService.interest(valorBase, i);
            double paymentFee = onlinePaymentService.paymentFee(valorBase + interest);
            double installmentValue = valorBase + paymentFee + interest;
            LocalDate dueDate = contract.getDate().plusMonths(i);
            contract.getInstallments().add(new Installment(dueDate, installmentValue));
        }
    }
}
