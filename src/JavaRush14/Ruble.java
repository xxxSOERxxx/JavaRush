package JavaRush14;

public class Ruble extends Money{
    public Ruble(double amount) {
        super(amount);
    }


    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
