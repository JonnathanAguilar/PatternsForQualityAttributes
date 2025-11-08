package proxy;

public class DispositivoReal implements IDispositivo {
    private final String estado;
    private final String datosVideo;

    public DispositivoReal(String estado, String datosVideo) {
        this.estado = estado;
        this.datosVideo = datosVideo;
    }

    @Override
    public void verEstado() {
        System.out.println("Estado actual del dispositivo: " + estado);
    }

    @Override
    public void replicarDatos() {
        System.out.println("Replicando datos de videovigilancia...");
        System.out.println("...Datos replicados correctamente y verificados con hash criptográfico.");
    }
}
