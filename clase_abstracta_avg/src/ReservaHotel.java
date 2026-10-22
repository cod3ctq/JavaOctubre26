public class ReservaHotel extends Reservacion{

    int noches;
    double precioPorNoche;
    String tipo;

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

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
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
        switch (tipo) {
            case "sencilla":
                totalAPagar = totalAPagar;
                break;
            case "doble":
                totalAPagar = totalAPagar * 1.4;
                break;
            case "triple":
                totalAPagar = totalAPagar * 1.8;
                break;
            default:
                System.out.println("Tipo invalido");
                totalAPagar = 0.0;
                break;
        }
        return totalAPagar;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Reservacion numero : [" + numReservacion + "]");
        System.out.println("Cliente : [" + cliente + "]");
        System.out.println("Tipo de habitacion : " + tipo);
        System.out.println("Confirmado por : " + noches + " noches");
        System.out.println("Precio : [" + calcularPrecio() + "]");
    }
}
