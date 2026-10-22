public abstract class Reservacion {

    //número de reservación, nombre del cliente y estado.
    int numReservacion;
    String cliente;
    boolean confirmada;

    public Reservacion(){}

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

    //1. Calcular el precio de cualquier reservación.
    //2. Mostrar sus datos.
    //3. Confirmar una reservación.

    // este metodo si requiere ser abstract porque cada tipo de reservacion
    // calcula diferente su costo total a pagar, es decir, se va a modificar
    // segun el tipo de reservacion mas adelante
    public abstract double calculaPrecio();


    // tanto muestraDatos como confirmaReservacion, no va a realizar una operacion
    // diferente en clases hijas, entonces se puede dejar aqui implementado porque no
    // tendran modificacion mas adelante
    public void muestraDatos(){
        System.out.println("Reservacion numero : " + this.numReservacion);
        System.out.println("Cliente : " + this.cliente);
        System.out.println(this.confirmada ? "Confirmado : Si" : "Confirmado : NO");
        System.out.println("Precio : $" + String.format("%.2f", calculaPrecio()));
    }

    public void confirmaReservacion(){
        confirmada = true;
        System.out.println("Reservacion confirmada para : " + this.cliente);
    };
    //FIN

}
