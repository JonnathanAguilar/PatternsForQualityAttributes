package strategy;

public class BluetoothStrategy implements ConnectionStrategy {

    @Override
    public void connect(String address) {
        System.out.println("Dispositivo conectado vía Bluetooth");
        System.out.println("Dirección MAC: " + address);
    }

    @Override
    public void disconnect() {
        System.out.println("Dispositivo Bluetooth desconectado");
    }

    @Override
    public void sendMessage(String data) {
        System.out.println("Mensaje eviado vía Bluetooth: " + data);
    }
    
}
