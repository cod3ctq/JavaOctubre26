public class ReservaVuelo extends Reservacion {

    //- Vuelo: se cobra una tarifa base más el equipaje.
    double tarifaBase;
    double kilos;
    double precioPorKiloExcedente;

    public ReservaVuelo(int numReservacion, String cliente, boolean confirmada, double tarifaBase, double kilos, double precioPorKiloExcedente) {
        super(numReservacion, cliente, confirmada);
        this.tarifaBase = tarifaBase;
        this.kilos = kilos;
        this.precioPorKiloExcedente = precioPorKiloExcedente;
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

    public double getPrecioPorKiloExcedente() {
        return precioPorKiloExcedente;
    }

    public void setPrecioPorKiloExcedente(double precioPorKiloExcedente) {
        this.precioPorKiloExcedente = precioPorKiloExcedente;
    }

    @Override
    public String toString() {
        return "ReservaVuelo{" +
                "tarifaBase=" + tarifaBase +
                ", kilos=" + kilos +
                ", precioPorKiloExcedente=" + precioPorKiloExcedente +
                ", numReservacion=" + numReservacion +
                ", cliente='" + cliente + '\'' +
                ", confirmada=" + confirmada +
                '}';
    }

    @Override
    public double calculaPrecio() {
//        //- Vuelo: se cobra una tarifa base más el equipaje.
//        double tarifaBase;
//        double kilos;
//        double precioPorKiloExcedente;
        double totalAPagar = 0.0;
        if (kilos >10){
            double kilosExcedente = kilos - 10;
            totalAPagar = tarifaBase + (precioPorKiloExcedente * kilosExcedente);
        }else{
            totalAPagar = totalAPagar;
        }

        return totalAPagar;
    }
}
