package Salary;
import Exchange.ExchangeRateProvider;

public class SalaryConverter {
    private final ExchangeRateProvider exchangeRateProvider;

    public SalaryConverter(ExchangeRateProvider exchangeRateProvider) {
        this.exchangeRateProvider = exchangeRateProvider;
    }
}
