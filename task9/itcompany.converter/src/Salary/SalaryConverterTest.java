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
        assertEquals(92.0, SC.convertSalary("USD", "EUR", 100));
        assertEquals(190.0, SC.convertSalary("EUR", "USD", 100));
        assertEquals(79.0, SC.convertSalary("USD", "GBP", 100));
        assertEquals(126.0, SC.convertSalary("GBP", "USD", 100));
        assertEquals(100.0, SC.convertSalary("XYZ", "USD", 100));
    }
}