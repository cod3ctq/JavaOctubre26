//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Celular c1 = new Celular();
        Celular c2 = new Celular("Nokia", "Blanco", " 1100", 500.00);

        c1.hacerLlamada("96995894");
        c2.hacerLlamada("7442435262");

        c1.enviarMensaje("7442435262", " Hola como estas?");
        c2.enviarMensaje("7456637934", "compren pizza");

        Smartphone s1 = new Smartphone();
        s1.hacerLlamada("756646734");
        s1.enviarMensaje("847793756", "Llamame cuando te desocupes");


        //Instanciar un objeto de la clase hija, a traves del contructor con todos sus argumentos
        //(Doy por hecho que la clase hija recibe primero los datos de la clase padre)

        String[] apps = {"Opera","Music Player","Camara","Calendario","Whatsapp"};

        //Objeto camaras individuales
        Camara cam1 = new Camara(0.3, 2, false);
        Camara cam2 = new Camara(5, 10, false);

        Camara cam3 = new Camara(7, 15, false);
        Camara cam4 = new Camara(10, 20, false);


        //Array de camaras
        Camara[] cams = {cam1,cam2};
        Camara[] cams2 = {cam1,cam2,cam3,cam4};

        Smartphone sm1 = new Smartphone("Nokia", "Negro", "N95", 950, "Symbian S60",
                apps, new Pantalla("4K", "16M",500, 2.8, 150, false," "), cams);

        Smartphone sm2 = new Smartphone("Nokia", "Negro", "N95", 950, "Symbian S60",
                apps, new Pantalla("4K", "16M",500, 2.8, 150, false," "), cams2 );


        System.out.println(sm1);
        System.out.println(sm2);



        //Una clase NO PUEDE HEREDAR DE 2 O MAS CLASES AL MISMO TIEMPO
        //Una clase puede ser HEREDADA por multiples clases







    }
}