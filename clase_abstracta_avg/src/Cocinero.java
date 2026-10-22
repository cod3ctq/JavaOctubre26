public class Cocinero extends Empleado {

    //Metodo forma 2: Heredado y sobreescrito
    @Override
    public void trabajar() {
        System.out.println("Revisar insumos");
        System.out.println("Revisar utensilios");
        System.out.println("Preparar materia prima");
        System.out.println("Preparar comandas");
        System.out.println("Limpiar area de trabajo");
    }

    public void presentarse(){
        System.out.println("Hola, soy :" + this.nombre + " y mi RFC es: " + this.rfc);

    }
}
