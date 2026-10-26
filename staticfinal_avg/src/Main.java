//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CajaCobro c1 = new CajaCobro(0,0,"Manuel");
        CajaCobro c2 = new CajaCobro(0,0,"Alejandra");
        CajaCobro c3 = new CajaCobro(0,0,"Silcia");
        CajaCobro c4 = new CajaCobro(0,0,"Andres");

        System.out.println("Total global $$$: " + c3.getTotalGlobal ());

        c1.procesarVenta(200.0);
        c2.procesarVenta(100.0);
        c1.procesarVenta(133.0);
        c2.procesarVenta(2833.0);
        c1.procesarVenta(4963.0);
        c3.procesarVenta(200.0);
        c2.procesarVenta(9832.0);
        c1.procesarVenta(200.0);
        c2.procesarVenta(8272.0);
        c2.procesarVenta(200.0);
        c1.procesarVenta(2334.0);
        c4.procesarVenta(200.0);
        c3.procesarVenta(4829.0);
        c1.procesarVenta(2392.0);
        c2.procesarVenta(200.0);
        c4.procesarVenta(4876.0);
        c1.procesarVenta(2681.0);

        //Imprime los valores estaticos (compartidos por todas las instancias)
        //Siempre obtienes el mismo valor no importa desde que instancia
        // invoques al metodo
        System.out.println("Total global $$$: " + c2.getTotalGlobal());
        System.out.println("Ventas procesadas: " + c3.getVentasRealizadas());

        //Imprime los valores propios de cada instancia
        //Siempre obtienes valores diferentes dependiendo de que instancia
        //invoques los metodos
        System.out.println("Facturadopor la caja 1: " + c1.getTotalIndividual());
        System.out.println("ventas procesadas por la caja 1: " + c1.getCobrosIndividual());

        System.out.println("Facturadopor la caja 4: " + c4.getTotalIndividual());
        System.out.println("ventas procesadas por la caja 4: " + c4.getCobrosIndividual());

        //Los miembros estaticos de una clase pueden ser invicados
        // DIRECTAMENTE DESDE LA CLASE
        System.out.println(CajaCobro.totalGlobal);
        System.out.println(CajaCobro.getTotalGlobal());

        //-----------------------------------------------------------------------

        Iphone ip1 = new Iphone("X","10", "Blanco", 15000);
        Iphone ip2 = new Iphone("13","15", "Negro", 17000);
        Iphone ip3 = new Iphone("12 Pro","14", "Morado", 16000);
        Iphone ip4 = new Iphone("7","9", "Gris", 10000);
        Iphone ip5 = new Iphone("5","7", "Dorado", 9000);

        System.out.println(ip1.SISTEMAOPERATIVO);
        System.out.println(ip2.SISTEMAOPERATIVO);
        System.out.println(ip3.SISTEMAOPERATIVO);
        System.out.println(ip4.SISTEMAOPERATIVO);
        System.out.println(ip5.SISTEMAOPERATIVO);

        System.out.println(ip1.getVersionSistema());
        System.out.println(ip2.getVersionSistema());
        System.out.println(ip3.getVersionSistema());
        System.out.println(ip4.getVersionSistema());
        System.out.println(ip5.getVersionSistema());

        //Desde un objeto modifico el valor de un atributo de clase
        //ip2.setFabricante("BYD");

        //Llamada a una constante DIRECTAMENTE DESDE LA CLASE
        //Asi es como debe hacerse
        System.out.println(Iphone.SISTEMAOPERATIVO);
        System.out.println(Iphone.FABRICANTE);

        //Modificador FINAL tiene 3 niveles de accion ...
        /*
        1 - Nivel de Atributo : CREA CONSTANTES
        2 - Nivel de Metodo : Bloquea la sobreescritura
        3 - Nivel de Clase : Bloqueas la herencia
         */


    }
}