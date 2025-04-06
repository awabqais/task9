package Salary;

import Exchange.ExchangeRateProvide;

import static org.junit.jupiter.api.Assertions.*;

class SalaryConverterTest {
    private SalaryConverter SC;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        ExchangeRateProvide exchangeRateProvider = new ExchangeRateProvide();
        SC = new SalaryConverter(exchangeRateProvider);
    }

    @org.junit.jupiter.api.Test
    void convertSalary() {
       
    }
}