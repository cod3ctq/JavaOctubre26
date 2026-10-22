public class ReservaVuelo extends Reservacion{

    double tarifaBase;
    double kilos;
    double cprecioPorKiloExcedente;

    public ReservaVuelo(int numReservacion, String cliente, boolean confirmada, double tarifaBase, double kilos, double cprecioPorKiloExcedente) {
        super(numReservacion, cliente, confirmada);
        this.tarifaBase = tarifaBase;
        this.kilos = kilos;
        this.cprecioPorKiloExcedente = cprecioPorKiloExcedente;
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

    public double getCprecioPorKiloExcedente() {
        return cprecioPorKiloExcedente;
    }

    public void setCprecioPorKiloExcedente(double cprecioPorKiloExcedente) {
        this.cprecioPorKiloExcedente = cprecioPorKiloExcedente;
    }

    @Override
    public String toString() {
        return "ReservaVuelo{" +
                "tarifaBase=" + tarifaBase +
                ", kilos=" + kilos +
                ", cprecioPorKiloExcedente=" + cprecioPorKiloExcedente +
                ", numReservacion=" + numReservacion +
                ", cliente='" + cliente + '\'' +
                ", confirmada=" + confirmada +
                '}';
    }

    @Override
    public double calcularPrecio() {
        double porpagar;
        if (kilos>=10) {
            double kilosExcd = kilos -10;
            porpagar = tarifaBase+ (cprecioPorKiloExcedente*kilosExcd);
        }else {
            porpagar= tarifaBase;
        }
        return porpagar;
    }
}
