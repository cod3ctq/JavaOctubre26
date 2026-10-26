public abstract class Reservacion {

    int numReservacion;
    String cliente;
    boolean confirmada;

    public Reservacion(){}

    public Reservacion(int numReservacion, String cliente, boolean corfirmada) {
        this.numReservacion = numReservacion;
        this.cliente = cliente;
        this.confirmada = corfirmada;
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

    public boolean isCorfirmada() {
        return confirmada;
    }

    public void setCorfirmada(boolean corfirmada) {
        this.confirmada = corfirmada;
    }

    @Override
    public String toString() {
        return "Reservacion{" +
                "numReservacion=" + numReservacion +
                ", cliente='" + cliente + '\'' +
                ", corfirmada=" + confirmada +
                '}';
    }
    //metodo abstracto
    public abstract double calcularPrecio();

    //Confirmar la reservacion : metodo no abstracta
    public void confirmar(){
        confirmada = true;
        System.out.println("Reservacion confirmada");
    }


    public void mostrarDetalles(){
        System.out.println("Reservacion numero: ["+numReservacion+"]");
        System.out.println("Cliente: ["+cliente+"]");
        System.out.println("Corfirmado: ["+confirmada+"]");
        System.out.println("Precio:["+calcularPrecio()+"]");
    }
}
