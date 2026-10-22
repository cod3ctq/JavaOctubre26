//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//
//        //Empleado e1 = new Empleado(): //No puedes crear un objeto
//
//        Cocinero c1= new Cocinero();
//        c1.trabajar();
//
//
//
//        EjecutivoVentas ev1= new EjecutivoVentas();
//        ev1.trabajar();
//
//
//
//        //-------------------------------------------------------------------------------------------------
//
//        //Una plataforma permite reservar tres tipos de servicios:
//        //Hotel: se cobra por noche
//        //Vuelo: se cobra una tarifa base mas un segura
//        //Renta de automovil: se cobra por dia mas un seguro.
//
//        //Todas las reservaciones comparten informacion: Numero de reservacion, nombre del cliente y reservacion confirmada.
//
//        //


            System.out.println( "                   Reserva del Vuelo");
        ReservaVuelo rv = new ReservaVuelo(1,"Luis", false, 2000,14,150);

        rv.confirmar();
        System.out.println("Vuelo con precio de: $" + rv.calcularPrecio());
        rv.calcularPrecio();
        rv.mostrarDetalles();

            System.out.println("                    Reserva del auto");
        ReservaAuto ra = new ReservaAuto(2,"Luis", true, 15, 900, 500);

        ra.confirmar();
        System.out.println("Renta de auto con precio de: $" + ra.calcularPrecio());
        ra.calcularPrecio();
        ra.mostrarDetalles();

            System.out.println("                   Reserva del Hotel");
        ReservaHotel rh = new ReservaHotel(3, "Luis", true, 5, 1300, "doble");

        rh.confirmar();
        System.out.println("Costo de las 5 noches: $" + rh.calcularPrecio());
        rh.calcularPrecio();
        rh.mostrarDetalles();










    }




}