public class CajaCobro {
    //Static: permite crear miembros de una clase
    //

    //mienbros de clase
    public static double totalGlobal = 0.0;
    public static int ventasRealizadas = 0;


    //Miembros de instancia
    private double totalIndividual;
    private int cobrosIndividual;
    private String cajero;

    public CajaCobro(double totalIndividual, int cobrosIndividual, String cajero) {
        this.totalIndividual = totalIndividual;
        this.cobrosIndividual = cobrosIndividual;
        this.cajero = cajero;
    }

    public static double getTotalGlobal() {
        return totalGlobal;
    }

    public static void setTotalGlobal(double totalGlobal) {
        CajaCobro.totalGlobal = totalGlobal;
    }

    public static int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public static void setVentasRealizadas(int ventasRealizadas) {
        CajaCobro.ventasRealizadas = ventasRealizadas;
    }

    public double getTotalIndividual() {
        return totalIndividual;
    }

    public void setTotalIndividual(double totalIndividual) {
        this.totalIndividual = totalIndividual;
    }

    public int getCobrosIndividual() {
        return cobrosIndividual;
    }

    public void setCobrosIndividual(int cobrosIndividual) {
        this.cobrosIndividual = cobrosIndividual;
    }

    public String getCajero() {
        return cajero;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }

    @Override
    public String toString() {
        return "CajaCobro{" +
                "totalIndividual=" + totalIndividual +
                ", cobrosIndividual=" + cobrosIndividual +
                ", cajero='" + cajero + '\'' +
                '}';
    }

    public void procesarVenta(double monto){
        //Acumula el monto que se cobra al final de cada venta
        //e incrementa el contador de ventas
        totalGlobal = totalGlobal + monto;
        ventasRealizadas++;

    }
}
