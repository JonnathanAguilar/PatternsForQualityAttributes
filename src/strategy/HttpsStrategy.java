package strategy;

public class HttpsStrategy implements ConnectionStrategy {

    @Override
    public void connect(String address) {
        System.out.println("Dispositivo conectado vía HTTPS");
        System.out.println("Dirección IP: " + address);
    }

    @Override
    public void disconnect() {
        System.out.println("Dispositivo HTTPS desconectado");
    }

    @Override
    public void sendMessage(String data) {
        System.out.println("Mensaje enviado vía HTTPS: " + data);
    }
    
}
