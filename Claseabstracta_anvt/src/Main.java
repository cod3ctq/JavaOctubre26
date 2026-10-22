//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Empleado e1 = new Empleado(); No puedes crear un objeto de una clase abtracta

        //Cocinero co1 = new Cocinero();
        //co1.setNombre("Ailed");
        //co1.setRfc("VATA020404265");
        //co1.trabajar();
        //co1.presentarse();

        //System.out.println("- - - - - - - - - - - - - - - -");

        //EjecutivoVentas ej1 = new EjecutivoVentas();
        //ej1.trabajar();
//--------------------------------------------------------------------------------------

        System.out.println(">>>>RESERVA DE VUELO");
        ReservaVuelo rv = new ReservaVuelo(1,
                "Mario",false,2000,
                14,150);

        rv.confirmar();
        System.out.println("Vuelo con precio de:$"+rv.calcularPrecio());
        rv.mostrarDetalles();
        System.out.println(">>>>RESERVA DE AUTO");
        ReservaAuto ra = new ReservaAuto(2,"luis",
                false,15,900,500);
        ra.confirmar();
        System.out.println("Renta de auto con precio de:$"+ra.calcularPrecio());
        ra.mostrarDetalles();
        System.out.println(">>>>RESERVA DE HABITACION");
        ReservaHotel rh = new ReservaHotel(3,"Fernando",false,
                4,1200.45,"triple");
        rh.confirmar();
        System.out.println("Reserva de habitacion con precio de:$"+rh.calcularPrecio());
        rh.mostrarDetalles();

    }
}