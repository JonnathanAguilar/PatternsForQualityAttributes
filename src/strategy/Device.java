package strategy;

import java.util.Scanner;

public class Device {
    public static void main(String[] args) {
        DeviceConnection connection = new DeviceConnection();

        // Determinamos el protocolo usado por el dispositivo
        // (en este ejemplo, el usuario lo determina) 

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Protocolo del dispositivo: ");
        String protocol = sc.nextLine().toLowerCase();

        // Una vez determinado el protocolo, usar la estrategia adecuada

        switch (protocol) {
            case "https":
                connection.setStrategy(new HttpsStrategy());
                connection.setAddress("https://192.168.164.1");
                connection.connect();
                break;

            case "bluetooth":
                connection.setStrategy(new BluetoothStrategy());
                connection.setAddress("38:02:68:e8:ba:eb");
                connection.connect();
                break;

            case "websockets":
                connection.setStrategy(new WebSocketsStrategy());
                connection.setAddress("ws://158.204.251.250");
                connection.connect();
                break;
        
            default:
                System.out.println("Protocolo desconocido");
                break;
        }

        sc.close();
    }
}
