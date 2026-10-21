public class Celular {

    String marca;
    String color;
    String modelo;
    double mAh;

    public Celular(){}

    public Celular(String marca, String color, String modelo, double mAh) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.mAh = mAh;
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

    // COMO - Son las acciones que se le atribuyen al modelo

    // una clase puede adquirir comportamiento de 3 maneras:
    // 1 - metodos nativos
    // 2 - metodos heredados (comunmente se sobreescriben)
    // 3 - metodos implementados (interfaces)





    // 1 - metodos nativos
    // Anatomia de un metodo (accion)
    // modificador de acceso tipoderetorno nombredelmetodo (tipodedato argumentos){
                // LOGICA
    // }
    public void hacerLlamada(String numero){
        System.out.println("Marcando al número : " + numero);
    }

    public void mandarMensaje(String numero, String mensaje){
        System.out.println("Enviando el msj: <" + mensaje + "> al número : [" + numero + "]");
    }









}
