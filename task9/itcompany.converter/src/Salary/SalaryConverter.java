package Salary;
import Exchange.ExchangeRateProvider;

public class SalaryConverter {
    private final ExchangeRateProvider exchangeRateProvider;

    public SalaryConverter(ExchangeRateProvider exchangeRateProvider) {
        this.exchangeRateProvider = exchangeRateProvider;
    }
    public double GetSalary(String from, String to, double salary) {
        return salary * exchangeRateProvider.getExchangeRate(from, to);
    }
}
