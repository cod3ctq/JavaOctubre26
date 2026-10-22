import java.sql.SQLOutput;

public abstract class Reservacion {
    int numReservacion;
    String cliente;
    boolean confirmada;
    public Reservacion (){
    }

    public Reservacion(int numReservacion, String cliente, boolean confirmada) {
        this.numReservacion = numReservacion;
        this.cliente = cliente;
        this.confirmada = confirmada;
    }

    public int getNumReservacion() {
        return numReservacion;
    }

    public void setNumReservacion(int numReservacion) {
        this.numReservacion = numReservacion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    @Override
    public String toString() {
        return "Reservacion{" +
                "numReservacion=" + numReservacion +
                ", cliente='" + cliente + '\'' +
                ", confirmada=" + confirmada +
                '}';
    }

    public abstract double calcularPrecio();

    //Confirmar la reservacion
    public void confirmar(){
        confirmada = true;
        System.out.println("Reservacion confirmada");
    }
    //mostrar el detalle de la reservacion
    public void   mostrarDetalles (){
        System.out.println("REservacion numero : [" + numReservacion +"]");
        System.out.println("Cliente: ["+ cliente +"]");
        System.out.println("Precio: [" +calcularPrecio()+"]");

    }
}
