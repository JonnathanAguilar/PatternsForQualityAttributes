public class HistorialMedico implements Historial {
    private final String paciente;

    public HistorialMedico(String paciente) {
        this.paciente = paciente;
    }

    @Override
    public void verHistorial() {
        System.out.println("Mostrando historial médico del paciente: " + paciente);
    }
}
