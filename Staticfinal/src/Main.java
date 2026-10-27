import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        CajaCobro c1 = new CajaCobro (0,0,"Manuel");
        CajaCobro c2 = new CajaCobro (0,0,"Alejandra");
        CajaCobro c3 = new CajaCobro (0,0,"Silvia");
        CajaCobro c4 = new CajaCobro (0,0,"Andres");

        //Llamando a un miembro estatico desde una instancia
        System.out.println("Total Global $$$:"+c3.getTotalGlobal ());

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

        //Imprime los valores estaticos (compartidos por todas las instancias)
        //Siempre obtienes el mismo valor no importa desde que instancia
        //invoques el metodo
        System.out.println("Total Global $$$:"+c2.getTotalGlobal ());
        System.out.println("Ventas procesadas: "+c3.getVentasRealizadas ());

        System.out.println("Facturado por la caja 2 : "+c2.getTotalIndividual());
        System.out.println("Ventas procesadas por la caja 2: "+c2.getCobrosIndividual ());


        System.out.println("Facturado por la caja 4 : "+c4.getTotalIndividual());
        System.out.println("Ventas procesadas por la caja 4: "+c4.getCobrosIndividual ());

        //Los miembros estaticos de una claseeee, puedes ser invocados
        //DIRECTAMENTE DESDE LA CLASE
        System.out.println(CajaCobro.totalGlobal);
        System.out.println(CajaCobro.getTotalGlobal());



        Iphone ip1 = new Iphone("X","10","Blanco",15000);
        Iphone ip2 = new Iphone("13","15","Negro",17000);
        Iphone ip3 = new Iphone("12 Pro","14","Morado",11000);
        Iphone ip4 = new Iphone("7","9","Gris",10000);
        Iphone ip5 = new Iphone("5","7","Dorado",9000);

        //Desde un objeto, modificado el valor de un atributo de clase ...
        ip2.setFabricante("BYD");

        System.out.println(ip1.getFabricante());
        System.out.println(ip2.getFabricante());
        System.out.println(ip3.getFabricante());
        System.out.println(ip4.getFabricante());
        System.out.println(ip5.getFabricante());

        System.out.println(ip1.getVersionSistemas());
        System.out.println(ip2.getVersionSistemas());
        System.out.println(ip3.getVersionSistemas());
        System.out.println(ip4.getVersionSistemas());
        System.out.println(ip5.getVersionSistemas());

    }

}