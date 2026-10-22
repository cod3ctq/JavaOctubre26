//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*
    // Empleado e1 = new Empleado(); // No se puede

        Cocinero co1 = new Cocinero();
        co1.setNombre("German");
        co1.setRfc("FEEGG32434FFFD");
        co1.trabajar();
        co1.presentarse();

        System.out.println("---------------");

        EjecutivoVentas eje1 = new EjecutivoVentas();
        eje1.trabajar();
*/

        // El problema
        //Una plataforma permite reservar tres tipos de servicios:
        //- Hotel: se cobra por noche.
        //- Vuelo: se cobra una tarifa base más el equipaje.
        //- Renta de automóvil: se cobra por día más un seguro.
        //Todas las reservaciones comparten información: número de reservación, nombre del cliente y estado.
        //Sin embargo, cada servicio calcula su precio de manera diferente.
        //Además, el sistema necesita realizar las siguientes operaciones:
        //1. Calcular el precio de cualquier reservación.
        //2. Mostrar sus datos.
        //3. Confirmar una reservación.

        // para Vuelo
        System.out.println("\n*********************** VUELO ****************************");
        ReservaVuelo rv = new ReservaVuelo(1, "MARIO", false, 2000, 14, 150);
        System.out.print("1. ");
        rv.confirmaReservacion();
        System.out.print("2. ");
        System.out.println("Vuelo con precio de: $" + rv.calculaPrecio());
        System.out.print("3. ");
        rv.muestraDatos();

        // para Auto
        System.out.println("\n*********************** AUTO ****************************");
        ReservaAuto ra = new ReservaAuto(2, "LUIS", false, 15, 900, 500);
        System.out.print("1. ");
        ra.confirmaReservacion();
        System.out.print("2. ");
        System.out.println("Renta de Auto con precio de: $" + ra.calculaPrecio());
        System.out.print("3. ");
        ra.muestraDatos();


        // para Hotel
        System.out.println("\n*********************** HOTEL ****************************");
        ReservaHotel rh = new ReservaHotel(3, "FERNANDO", false, 4,1200.45, "doble");
        System.out.print("1. ");
        rh.confirmaReservacion();
        System.out.print("2. ");
        System.out.println("Renta de habitacion " + rh.getTipo() + " con precio de: $" + String.format("%.2f", rh.calculaPrecio()));
        System.out.print("3. ");
        rh.muestraDatos();
    }
}