public class MedioTransporte {

    String placas;
    String ubicacion;

    public MedioTransporte(){}


    public MedioTransporte(String placas, String ubicacion) {
        this.placas = placas;
        this.ubicacion = ubicacion;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "MedioTransporte{" +
                "placas='" + placas + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
