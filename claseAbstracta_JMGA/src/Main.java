//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Cocinero cocinero = new Cocinero();
//        cocinero.trabajar();

        ReservaVuelo rv = new ReservaVuelo(234,"Mario",false,
                2000,14,150);

        rv.confirmar();
        System.out.println("Vuelo con precio de: $"+ rv.calcularPrecio());
        rv.calcularPrecio();
        rv.mostrarDetalles();

        ReservaAuto ra = new ReservaAuto(2,"Luis",false,
                15,900,500);
        ra.confirmar();
        System.out.println("Renta de auto con precio de :$" + ra.calcularPrecio());
        ra.mostrarDetalles();

        ReservaHotel rh = new ReservaHotel(123,"",true,67,1000,"Doble");


    }
}