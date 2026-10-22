public class ReservaAuto extends Reservacion {

    int dias;
    double precioBaseSeguro;
    double precioPorDia;

    public ReservaAuto(int numReservacion, String cliente, boolean confirmada, int dias, double precioBaseSeguro, double precioPorDia) {
        super(numReservacion, cliente, confirmada);
        this.dias = dias;
        this.precioBaseSeguro = precioBaseSeguro;
        this.precioPorDia = precioPorDia;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPrecioBaseSeguro() {
        return precioBaseSeguro;
    }

    public void setPrecioBaseSeguro(double precioBaseSeguro) {
        this.precioBaseSeguro = precioBaseSeguro;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    @Override
    public double calcularPrecio() {
        return precioBaseSeguro + (dias * precioPorDia);
    }

}
