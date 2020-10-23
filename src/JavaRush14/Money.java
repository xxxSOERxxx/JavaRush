package JavaRush14;

public abstract class Money {
    private double amount = 0;

        public Money(double amount) {
            this.amount = amount;
        }

        public double getAmount(){
            return amount;
        };

        public abstract String getCurrencyName();
    }

