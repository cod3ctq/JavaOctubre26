//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CajaCobro c1 = new CajaCobro(0, 0, "Luis");
        CajaCobro c2 = new CajaCobro(0, 0, "Daniel");
        CajaCobro c3 = new CajaCobro(0, 0, "Diana");
        CajaCobro c4 = new CajaCobro(0, 0, "Paola");


        //Llamando a un miembro estatico desde una instancia especifica
        System.out.println("Total Global $$$" +c3.getTotalGlobal());

        c1.procesarVenta(200);
        c2.procesarVenta(100);
        c1.procesarVenta(133);
        c2.procesarVenta(2833);
        c1.procesarVenta(4963);
        c3.procesarVenta(200);
        c2.procesarVenta(9832);
        c1.procesarVenta(200);
        c2.procesarVenta(8272);
        c2.procesarVenta(200);
        c1.procesarVenta(2334);
        c4.procesarVenta(200);
        c3.procesarVenta(4829);
        c1.procesarVenta(2392);
        c2.procesarVenta(200);
        c4.procesarVenta(4876);
        c1.procesarVenta(2681);


        //imprime los valores estaticos
        //Siempre optienes el mismo valor, no importa desde que instancia
        //invoques al metodo
        System.out.println("Total Global $$$ " +c2.getTotalGlobal());
        System.out.println("Ventas procesadas " +c3.getVentasRealizadas());

        //imprime los valores propios de cada instancia
        //Siempre obtienes los valores diferentes dependiendo de la instancia
        //invoques los metodos
        System.out.println("Facturado por la caja 1: "+c1.getTotalIndividual());
        System.out.println("ventas procesadas por la caja 1: "+c1.getCobrosIndividual());


        //Los miembros estaticos de una clase pueden ser invocados
        //directamente desde la clase
        System.out.println(CajaCobro.totalGlobal);
        System.out.println(CajaCobro.getTotalGlobal());


        //-------------------------------
        iphone ip1 = new iphone("x","10","Blanco",15000);
        iphone ip2 = new iphone("8","9","Negro",15000);
        iphone ip3 = new iphone("12","8","Azul",15000);
        iphone ip4 = new iphone("11","11","Morado",15000);
        iphone ip5 = new iphone("12","14","Plata",15000);


        System.out.println(ip1.SISTEMA_OPERATIVO);
        System.out.println(ip1.SISTEMA_OPERATIVO);
        System.out.println(ip1.SISTEMA_OPERATIVO);
        System.out.println(ip1.SISTEMA_OPERATIVO);
        System.out.println(ip1.SISTEMA_OPERATIVO);


        //Desde un objeto modifica el valor de un atributo de clase...
        //ip2.SISTEMA_OPERATIVO = "BYD"; YA NO SE PUEDE MODIFICAR PORQUE ES UNA CONSTANTE

        //Llamada a una constante DIRECTAMENTE DESDE LA CLASE
        //As[i se debe hacer
        System.out.println(iphone.SISTEMA_OPERATIVO);
        System.out.println(iphone.FABRICANTE);

        //Modificador FINAL tiene 3 niveles de acci[on...
        /*
        1.-Nivel de atributo: crea constantes
         */



    }
}