//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CajaCobro c1 = new CajaCobro(0, 0, "Manuel");
        CajaCobro c2 = new CajaCobro(0, 0, "Alekaffra");
        CajaCobro c3 = new CajaCobro(0, 0, "Silvia");
        CajaCobro c4 = new CajaCobro(0, 0, "Andres");

        System.out.println("Total Global $$ : " + c3.getTotalGlobal());

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

        // imprime los valores estaticos (compartidos por todas las instancias
        // siempre obtienees el mismo valor nno importa desde que instancia
        // invoques al metodo
        System.out.println("Total Global $$ : " + c3.getTotalGlobal());
        System.out.println("Ventas procesadas: " + c1.getVentasRealizadas());

        //Imprime los valores propios de cada instancia
        // simepre obtienes valores diferentes dependiendo de que instancia
        // invoques c
        System.out.println("Facturado por la caja 2 - " + c2.getTotalIndividual());
        System.out.println("ventas procesadas por la caja 1: " + c2.getCobrosIndividual());

        System.out.println("Facturado por la caja 4 - " + c4.getTotalIndividual());
        System.out.println("ventas procesadas por la caja 1: " + c4.getCobrosIndividual());

        // los miembros estaticos de una clase pueden ser invocados diractamente desde la clase
        System.out.println(CajaCobro.totalGlobal);
        System.out.println(CajaCobro.getTotalGlobal());



        // **************************************************
        // si instanciamos

        Iphone op1 = new Iphone("X", "10", "Blanco", 15000);
        Iphone op2 = new Iphone("13", "15", "Negro", 17000);
        Iphone op3 = new Iphone("12", "14", "Morado", 15000);
        Iphone op4 = new Iphone("7", "9", "Gris", 10000);
        Iphone op5 = new Iphone("5", "7", "Dorado", 9000);



        System.out.println(op1.FRABRICANTE);
        System.out.println(op2.SISTEMA_OPERATIVO);
        System.out.println(op3.SISTEMA_OPERATIVO);
        System.out.println(op4.FRABRICANTE);
        System.out.println(op5.FRABRICANTE);




        System.out.println(op1.getVersionSistema());
        System.out.println(op2.getVersionSistema());
        System.out.println(op3.getVersionSistema());
        System.out.println(op4.getVersionSistema());
        System.out.println(op5.getVersionSistema());


        //desde un objeto , modifico el valor de un atributo de clase...
        //op2.setFrabricante("BYD");  // INCORRECTO por ser un atributo FINAL

        // llamada a una constante DIRECTAMENTE DESDE LA CLASE
        // asi es como debe hacerse
        System.out.println(Iphone.SISTEMA_OPERATIVO);
        System.out.println(Iphone.FRABRICANTE);


        // modificador FINAL tiene 3 niveles de accion...
        // 1. Nivel de atributo : CREA CONSTANTE
        // 2. Nivel de metodo : BLOQUEA LA SOBREESCRITURA (ya no se puede modificar su codigo del metodo con FINAL)
        // 3. Nivel de clase : BLOQUEA LA HERENCIA (ya no se puede heredar una clase FINAL)




    }
}