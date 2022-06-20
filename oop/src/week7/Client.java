package week7;

public class Client {

    private String clientId;
    private Type type;

    public Client() {

    }

    public Client(String clientId, Type type) {

        this.clientId = clientId;
        this.type = type;

    }

    public void print() {
        System.out.println("Client[clientId = " + clientId + ", type = " + type + "]");
    }

    public String getClientId() {
        return clientId;
    }

    public Type getType() {
        return type;
    }
}
