package services;

import entities.CarRental;
import entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(){

    }

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double durationMinutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double durationHours = durationMinutes / 60.0;
        double durationDays = durationHours / 24;
        double valorBase;

        if (durationHours <= 12.0){
            valorBase = getPricePerHour() * Math.ceil(durationHours);
        } else {
            valorBase = getPricePerDay() * Math.ceil(durationDays);
        }

        double tax = taxService.tax(valorBase);

        carRental.setInvoice(new Invoice(valorBase, tax));

    }
}
