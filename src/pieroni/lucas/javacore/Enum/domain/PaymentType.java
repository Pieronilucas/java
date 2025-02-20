package pieroni.lucas.javacore.Enum.domain;

public enum PaymentType {
    DEBIT {
        @Override
        public double discount(double amount) {
            return amount * 0.1;
        }
    }, CREDIT {
        @Override
        public double discount(double amount) {
            return amount * 0.05;
        }
    };

    public abstract double discount(double amount);
}

