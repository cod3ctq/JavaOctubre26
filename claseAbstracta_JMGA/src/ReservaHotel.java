public class ReservaHotel extends Reservacion {

    int noches;
    double precioNoche;
   String tipo;


    public ReservaHotel(int numReservacion, String cliente, boolean confirmada, int noches, double precioNoche, String tipo) {
        super(numReservacion, cliente, confirmada);
        this.noches = noches;
        this.precioNoche = precioNoche;
        this.tipo = tipo;
    }

    public int getDias() {
        return noches;
    }

    public void setDias(int dias) {
        this.noches = dias;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ReservaHotel{" +
                "dias=" + noches +
                ", precioNoche=" + precioNoche +
                ", tipo='" + tipo + '\'' +
                ", numReservacion=" + numReservacion +
                ", cliente='" + cliente + '\'' +
                ", confirmada=" + confirmada +
                '}';
    }

    @Override
    public double calcularPrecio() {
        double totalAPagar = noches * precioNoche;

        switch (tipo){
            case "secilla":
                totalAPagar = totalAPagar;
                break;
            case "doble":
                totalAPagar = totalAPagar*1.40;
                break;
            case "triple":
                totalAPagar = totalAPagar *1.80;
                break;
            default:
                System.out.println("Tipo invalido");
                totalAPagar= 0.0;
        }
        return totalAPagar;
    }
}
