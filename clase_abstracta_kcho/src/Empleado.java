public abstract class Empleado {

    String nombre;
    String direccion;
    String rfc;
    String jefe;

    public Empleado(){    }

    public Empleado(String nombre, String direccion, String rfc, String jefe) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.rfc = rfc;
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", rfc='" + rfc + '\'' +
                ", jefe='" + jefe + '\'' +
                '}';
    }

    public abstract void trabajar();

}
