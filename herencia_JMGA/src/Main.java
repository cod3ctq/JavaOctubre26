//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Celular c1 = new Celular();
        Celular c2 = new Celular("Nokia","Rojo","12234",500.00);

//        c1.llamr("123345");
//        c2.mandarMensaje("1234345435","ola que hace ");


        //Propositop de la herencia es la especializacion - extends

        SmartPhone s1= new SmartPhone( );

        s1.mandarMensaje("1234234", "hoila");

        //Instanciar un opbjeto de la clase hija, a traves del constructor con todod sus argumentos
        //doy por hecho que la clase jhija recibe primero los datos de la clase padre

        String [] apps= {"qwe","QWe","QWE","QWE"};
       Pantalla pantalla =new Pantalla("4k","16m",500,2.8,150,false,"wqe");
       Camara cam1 = new Camara(0.4, 2,false);
        Camara cam2 = new Camara(0.4, 2,false);
        Camara [] cams = {cam1,cam2};

        SmartPhone sm1= new SmartPhone("Nokia", "Negro","nm95",950,"Symbian",
                apps,pantalla, cams);

        System.out.println(sm1);





    }
}