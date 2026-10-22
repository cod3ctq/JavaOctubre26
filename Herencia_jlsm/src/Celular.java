public class Celular {

    String marca;
    String color;
    String modelo;

    //pantalla, teclas
    double mAh;

    public Celular(String marca, String color, String modelo, double mAh) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.mAh = mAh;
    }

    public Celular() {

    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getmAh() {
        return mAh;
    }

    public void setmAh(double mAh) {
        this.mAh = mAh;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", mAh=" + mAh +
                '}';
    }
    //COMO-acciones que se le atribuyen al modelo
    //una clase puede adquirir comportamiento de tres maneras:
    //1- Metodos nativos
    //2.- Metodos heredados (comunmente se sobreescriben)
    //3.- Metodos implementados (interfaces)

    //anatomia de un metodo:
    //modificador de acceso, tipo de retorno, nombre del metodo, (tipodedato argumento){
        //Logica...
    //}
    public void hacerLlamada(String numero){
        System.out.println("Marcando al numero: " +numero);
    }
    public void mandarMensaje(String numero, String mensaje) {
        System.out.println("Mandando mensaje: " + mensaje + " al numero: " + numero);
    }
}
