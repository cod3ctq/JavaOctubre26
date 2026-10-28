public class Chofer extends Empleado implements IConduccion {

    // 1. Los constructores obligatorios para recibir los datos del empleado
    public Chofer() {
        super();
    }

    public Chofer(String nombre, String direccion, String rfc, String jefe) {
        super(nombre, direccion, rfc, jefe);
    }

    // 2. El método obligatorio que te exige la clase abstracta Empleado
    @Override
    public void trabajar() {
        System.out.println("El chofer está cumpliendo con su ruta de transporte.");
    }

    // 3. Los métodos obligatorios que te exige la interfaz IConduccion
    @Override
    public void manejar() {
        System.out.println("Conduciendo el vehículo asignado.");
    }

    @Override
    public void cambiarLlanta() {
        System.out.println("Cambiando una llanta ponchada.");
    }
}
