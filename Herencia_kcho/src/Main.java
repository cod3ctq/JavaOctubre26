//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Celular cel1 = new Celular();
    Celular cel2 = new Celular("nokia", "rojo", "NK4580", 600);
    System.out.println(cel2);

    cel1.hacerLlamada("554545");

    cel2.mandarMensaje("2224557272", "Hola Javero");

    Smartphone cel3 = new Smartphone();
    cel3.hacerLlamada("34545");
    cel3.mandarMensaje("33444", "Estrenando mi Smartphone");
    cel3.setColor("rojo mermellon");

    //Instanciar un objeto de la clase hija, a traves del constructor con todos
    // sus argumentos
    // doy por hecho que la clase hija recibe primero los datos de la clase padre

        String[] aplicaciones = {"opera", "music player", "camara", "calendario", "whatsapp"};

        // objetos de camaras individuales
        Camara cam1 = new Camara (23.3, 2,false);
        Camara cam2 = new Camara (24, 2,false);
        Camara cam3 = new Camara (50, 10,true);
        Camara cam4 = new Camara (2, 8,false);

        // Array de camaras
        Camara[] camss1 = {cam1,cam2};
        // Array de camaras
        Camara[] camss2 = {cam1,cam2,cam3, cam4};

        Smartphone sm1 = new Smartphone ("nokia", "negro", "AG23 8gb", 950, "Symbian 2340",
                new Pantalla("4k","Verde",233,23.2,1200,false, "ip69") ,
                camss1 ,aplicaciones );

        Smartphone sm2 = new Smartphone ("Samsung", "verde krick", "S20 plus", 5000, "Android 11",
                new Pantalla("8k","blanco",1533,60.2,8000,true, "ip69") ,
                camss2 ,aplicaciones );

        System.out.println(sm1);
        System.out.println(sm2);

        // Una clase NO PUEDE HEREDAR DE 2 O MAS CLASES AL MISMO TIEMPO
        // pero una clase puede ser HEREDADA POR MULTIPLES CLASES

        sm2.hacerLlamada("2115511515");

        // sobre carga de argumentos
        // sobre escritura al interior
        // formas de poliformismo

    }
}