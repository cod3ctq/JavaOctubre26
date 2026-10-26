public class CajaCobro {


    // STATIC permite crear miembros de clase
    // significa que le perteneces a la clase y que su valor
    // esta dado desde la clase, tambien dicho valor es
    // compartido y accesible desde cualquier instancia de la clase
    // miembros de clwr
    public static double totalGlobal = 0.0;
    public static int ventasRealizadas = 0;

    //miembros de instancia
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
        // acumula el monto que se cobra al final de cada venta
        // e incrementa el contador de ventas
        totalGlobal += monto;
        ventasRealizadas++;

        // acumula el monto cobrado al final de cada vuelta
        // incrementa el contador INDIVIDUAL de cada objeto
        totalIndividual += monto;
        cobrosIndividual++;
    }
}
