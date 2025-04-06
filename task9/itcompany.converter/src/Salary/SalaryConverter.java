package Salary;
import Exchange.ExchangeRateProvide;
public class SalaryConverter {
    private final ExchangeRateProvide exchangeRateProvider;

    public SalaryConverter(ExchangeRateProvide exchangeRateProvider) {
        this.exchangeRateProvider = exchangeRateProvider;
    }

    public double convertSalary(String from, String to, double salary) {
        return salary * exchangeRateProvider.GetExchangeRate(from, to);
    }
}
