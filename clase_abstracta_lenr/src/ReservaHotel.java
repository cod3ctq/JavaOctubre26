public class ReservaHotel extends Reservacion {


    int noches;
    double precioPorNoche;
    String tipo; //sencilla, doble, triple

    public ReservaHotel(int numReservacion, String cliente, boolean confirmada, int noches, double precioPorNoche, String tipo) {
        super(numReservacion, cliente, confirmada);
        this.noches = noches;
        this.precioPorNoche = precioPorNoche;
        this.tipo = tipo;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;


    }

    @Override
    public String toString() {
        return "ReservaHotel{" +
                "noches=" + noches +
                ", precioPorNoche=" + precioPorNoche +
                ", tipo='" + tipo + '\'' +
                ", numReservacion=" + numReservacion +
                ", cliente='" + cliente + '\'' +
                ", confirmada=" + confirmada +
                '}';
    }

    @Override
    public double calcularPrecio() {

        double totalAPagar = noches * precioPorNoche;

        switch(tipo){

            case "sencilla":
            totalAPagar = totalAPagar;
            break;

            case "doble":
                totalAPagar = totalAPagar * 0.40;
                        break;

            case "triple":
                totalAPagar = totalAPagar * 0.80;
                break;

            default:
                System.out.println("Tipo no disponible");
                totalAPagar = 0.0;

        }
        return totalAPagar;
    }
}
