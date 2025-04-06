package Exchange;

public class ExchangeRateProvide {
    public double GetExchangeRate(String from, String to) {
        if (from.equals("USD") && to.equals("EUR")) return 0.92;
        if (from.equals("EUR") && to.equals("USD")) return 1.90;
        if (from.equals("USD") && to.equals("UGX")) return 0.79;
        if (from.equals("UGX") && to.equals("USD")) return 1.26;
        return 1.0;
    }
}
