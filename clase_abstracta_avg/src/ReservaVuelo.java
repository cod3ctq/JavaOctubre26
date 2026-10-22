public class ReservaVuelo extends Reservacion{

    double tarifaBase;
    double kilos;
    double costoPorKiloExcedente;

    public ReservaVuelo(int numReservacion, String cliente, boolean confirmada, double tarifaBase, double kilos, double costoPorKiloExcedente) {
        super(numReservacion, cliente, confirmada);
        this.tarifaBase = tarifaBase;
        this.kilos = kilos;
        this.costoPorKiloExcedente = costoPorKiloExcedente;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public double getCostoPorKiloExcedente() {
        return costoPorKiloExcedente;
    }

    public void setCostoPorKiloExcedente(double costoPorKiloExcedente) {
        this.costoPorKiloExcedente = costoPorKiloExcedente;
    }

    @Override
    public String toString() {
        return "ReservaVuelo{" +
                "tarifaBase=" + tarifaBase +
                ", kilos=" + kilos +
                ", costoPorKiloExcedente=" + costoPorKiloExcedente +
                ", numReservacion=" + numReservacion +
                ", cliente='" + cliente + '\'' +
                ", confirmada=" + confirmada +
                '}';
    }

    @Override
    public double calcularPrecio() {
        double porPagar = 0.0;
        if(kilos > 10) {
            double kilosExcd = kilos -10;
            porPagar = tarifaBase + (costoPorKiloExcedente * kilosExcd);
        } else {
            porPagar = tarifaBase;
        }
        return porPagar;
    }
}
