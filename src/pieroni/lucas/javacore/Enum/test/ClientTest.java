package pieroni.lucas.javacore.Enum.test;

import pieroni.lucas.javacore.Enum.domain.Client;
import pieroni.lucas.javacore.Enum.domain.ClientType;
import pieroni.lucas.javacore.Enum.domain.PaymentType;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Luffy", ClientType.JURIDICAL_CLIENT, PaymentType.DEBIT);
        Client client2 = new Client("Zoro", ClientType.NATURAL_CLIENT, PaymentType.CREDIT);

        System.out.println(client);
        System.out.println(client2);
        System.out.println(PaymentType.CREDIT.discount(500));
        ClientType clientType = ClientType.clientTypeReportName("Natural Person Client");
        System.out.println(clientType);
    }
}
