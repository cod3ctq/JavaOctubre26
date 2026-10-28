public class Secretaria extends Empleado implements ISecretariado{


    @Override
    public void trabajar() {
        System.out.println("La secretaria está gestionando la oficina.");
    }

    @Override
    public void agendarCita() {
        System.out.println("Agendando cita en el calendario.");
    }

    @Override
    public void tomarLlamada() { // Se quitó la 's' para coincidir perfectamente con la interfaz
        System.out.println("Atendiendo llamada telefónica.");
    }

    @Override
    public void gestionarArchivo() {
        System.out.println("Organizando documentos en el archivo.");
    }
}