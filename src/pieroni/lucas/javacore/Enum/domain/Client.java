package pieroni.lucas.javacore.Enum.domain;

public class Client {
    private String name;
    private ClientType clientType;
    public PaymentType paymentType;

    public Client(String name, ClientType clientType, PaymentType paymentType) {
        this.name = name;
        this.clientType = clientType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType.getReportName() +
                ", clientValue=" + clientType.getValue() +
                ", paymentType=" + paymentType +
                '}';
    }
}
