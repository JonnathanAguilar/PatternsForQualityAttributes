package strategy;

public class DeviceConnection {
    private ConnectionStrategy strategy;
    private String address;

    public void connect() {
        this.strategy.connect(this.address);
    }

    public void disconnect() {
        this.strategy.disconnect();
    }

    public void sendMessage(String data) {
        this.strategy.sendMessage(data);
    }

    public void setStrategy(ConnectionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
