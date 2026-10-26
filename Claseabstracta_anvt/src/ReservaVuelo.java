public class ReservaVuelo extends Reservacion{


    double tarifaBase;
    double kilos;
    double preciocostoPorKiloExcendente;

    public ReservaVuelo(int numReservacion, String cliente, boolean corfirmada, double tarifaBase, double kilos, double preciocostoPorKiloExcendente) {
        super(numReservacion, cliente, corfirmada);
        this.tarifaBase = tarifaBase;
        this.kilos = kilos;
        this.preciocostoPorKiloExcendente = preciocostoPorKiloExcendente;
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

    public double getPreciocostoPorKiloExcendente() {
        return preciocostoPorKiloExcendente;
    }

    public void setPreciocostoPorKiloExcendente(double preciocostoPorKiloExcendente) {
        this.preciocostoPorKiloExcendente = preciocostoPorKiloExcendente;
    }
    @Override
    public double calcularPrecio() {

        double porPagar = 0.0;
        double kilosExcedente = kilos - 10;
        if(kilos>10) {
            double kilosExcd = kilos - 10;
            porPagar = tarifaBase + (preciocostoPorKiloExcendente * kilosExcd);
        }else {
            porPagar = tarifaBase;
        }
        return 0;
    }
}
