public class Cocinero extends Empleado{

    // metodo 2 : heredado y sobrescrito
    @Override
    public void trabajar(){
        System.out.println("Revisar insumos");
        System.out.println("Revisar sus utencilios");
        System.out.println("Preparar materia prima");
        System.out.println("Preparar comandas");
        System.out.println("Limpiar area de trabajo");
    }

    // Metodo nativo forma 1
    public void presentarse(){
        System.out.println("Hola, soy : " + this.nombre + " y mi RFC es : " + this.rfc);
    }
}
