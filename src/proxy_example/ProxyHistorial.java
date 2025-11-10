package proxy_example;

public class ProxyHistorial implements Historial{
    private final String usuarioRol;
    private final HistorialMedico historialReal;

    public ProxyHistorial(String usuarioRol, String paciente) {
        this.usuarioRol = usuarioRol;
        this.historialReal = new HistorialMedico(paciente);
    }

    @Override
    public void verHistorial() {
        if (tienePermiso()) {
            historialReal.verHistorial();
        } else {
            System.out.println("Acceso denegado. Solo los médicos pueden ver historiales médicos.");
        }
    }

    private boolean tienePermiso() {
        return usuarioRol.equalsIgnoreCase("medico");
    }
}