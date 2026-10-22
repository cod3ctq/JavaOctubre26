public class ReservaHotel extends Reservacion{

    int noches;
    double precioPorNoche;
    String tipo; // sencilla, doble, triple

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
    public double calculaPrecio(){
        double totalAPagar = noches * precioPorNoche;
        switch (tipo){
            case "sencilla":
                totalAPagar = totalAPagar;
                break;
            case "doble":
                totalAPagar *=1.40;
                break;
            case "triple":
                totalAPagar *=1.80;
                break;
            default:
                System.out.println("Tipo inválido");
                totalAPagar = 0.0;
                break;
        }
        return totalAPagar;
    }

    @Override
    public void muestraDatos(){
        System.out.println("Reservacion numero : " + this.numReservacion);
        System.out.println("Cliente : " + this.cliente);
        System.out.println(this.confirmada ? "Confirmado : Si" : "Confirmado : NO");
        System.out.println("El tipo de habitacion rentada es: " + tipo);
        System.out.println("Se reservó [" + noches + "] noches");
        System.out.println("Precio : $" + String.format("%.2f", calculaPrecio()));
    };
    //FIN
}
