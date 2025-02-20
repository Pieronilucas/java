package pieroni.lucas.javacore.Enum.test;

import pieroni.lucas.javacore.Enum.domain.Client;
import pieroni.lucas.javacore.Enum.domain.ClientType;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Luffy", ClientType.JURIDICAL_CLIENT);
        Client client2 = new Client("Zoro", ClientType.JURIDICAL_CLIENT);

        System.out.println(client);
        System.out.println(client2);
    }
}
