package proxy;

public class ProxyDispositivo implements IDispositivo {
    private final String usuario;
    private final boolean esTecnico;
    private final DispositivoReal real;

    public ProxyDispositivo(String usuario, boolean esTecnico) {
        this.usuario = usuario;
        this.esTecnico = esTecnico;
        this.real = new DispositivoReal("Activo", "VideoSeguridad.mp4");
    }

    @Override
    public void verEstado() {
        if (esTecnico) {
            System.out.println("[Acceso concedido] Técnico: " + usuario);
            real.verEstado();
        } else {
            System.out.println("[Acceso denegado] " + usuario + " no tiene permisos para ver el estado del dispositivo.");
        }
    }

    @Override
    public void replicarDatos() {
        if (esTecnico) {
            System.out.println("[Acceso concedido] Técnico: " + usuario);
            real.replicarDatos();
        } else {
            System.out.println("[Acceso denegado] " + usuario + " no tiene permisos para replicar los datos de videovigilancia.");
        }
    }
}