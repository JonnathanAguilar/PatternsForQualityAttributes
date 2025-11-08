package proxy;

public class ClienteSmartHome {
    public static void main(String[] args) {
        IDispositivo proxyTecnico = new ProxyDispositivo("Jonnathan", true);
        IDispositivo proxyMiembro = new ProxyDispositivo("Kevin", false);

        System.out.println("=== ACCESO DEL TÉCNICO ===");
        proxyTecnico.verEstado();
        proxyTecnico.replicarDatos();

        System.out.println("\n=== ACCESO DEL MIEMBRO DEL HOGAR ===");
        proxyMiembro.verEstado();
        proxyMiembro.replicarDatos();
    }
}