package pieroni.lucas.javacore.Enum.domain;

public class Client {
    private String name;
    public ClientType clientType;

    public Client(String name, ClientType clientType) {
        this.name = name;
        this.clientType = clientType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }
}
