package strategy;

public interface ConnectionStrategy {
    void connect(String address);
    void disconnect();

    void sendMessage(String data);
}
