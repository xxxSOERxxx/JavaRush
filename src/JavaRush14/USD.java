package JavaRush14;

public class USD extends Money{
    public USD(double amount) {
        super(amount);
    }


    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
