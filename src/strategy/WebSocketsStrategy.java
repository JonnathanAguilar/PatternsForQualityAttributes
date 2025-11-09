package strategy;

public class WebSocketsStrategy implements ConnectionStrategy {

    @Override
    public void connect(String address) {
        System.out.println("Dispositivo conectado vía WebSockets");
        System.out.println("Dirección IP: " + address);
    }

    @Override
    public void disconnect() {
        System.out.println("Dispositivo WebSockets desconectado");
    }

    @Override
    public void sendMessage(String data) {
        System.out.println("Mensaje enviado vía WebSockets: " + data);
    }
    
}
