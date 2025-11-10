public class Main {
    public static void main(String[] args) {
        Historial historial1 = new ProxyHistorial("medico", "Juan Pérez");
        historial1.verHistorial();

        Historial historial2 = new ProxyHistorial("recepcionista", "Juan Pérez");
        historial2.verHistorial();
    }
}
