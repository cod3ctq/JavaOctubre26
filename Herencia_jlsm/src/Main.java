public class Main {
        public static void main(String[] args) {
                Celular c1 = new Celular();
                Celular c2 = new Celular("Nokia","Blanco","1100", 500.00);

                c1.hacerLlamada("9813478401");
                c2.hacerLlamada("9813478402");

                c1.mandarMensaje("912837121", "Hola");
                c2.mandarMensaje("912837122", "Hola");

                Smartphone s1 = new Smartphone();
                s1.hacerLlamada("9813478401");
                s1.mandarMensaje("912837122", "Hola");

                //Instanciar un objeto de la clase hija, a través del constructor con
                // todos sus argumentos
                //(Doy por hecho que la clasehija recibe primero los datos de la clase padre

                String[] apps = {"Opera","Music Player","Camara","Calendario", "Whatsapp"};
                Pantalla pantalla1 = new Pantalla("TFT","16M", 500, 2.8, 150, false, " ");
                Pantalla pantalla2 = new Pantalla("2K","16M", 1200, 6.8, 600, true, "Gorilla");

                Camara cam1 = new Camara(0.3, 2, false);
                Camara cam2 = new Camara(5,10,false);
                Camara cam3 = new Camara(200, 10, true);
                Camara cam4 = new Camara(50, 10, false);

                Camara[] cams = {cam1, cam2};
                Camara[] cams2 = {cam1, cam2, cam3, cam4};

                Smartphone sm1 = new Smartphone("Nokia","Negro","N95 8GB",1000.0,"Symbian S60",apps,pantalla1,cams);
                Smartphone sm2 = new Smartphone("Samsung","Morado", "S22",7000.0,"Android", apps,pantalla2,cams2);

                System.out.println(sm1);
                System.out.println(sm2);

                //Una clase NO PUEDE HEREDAR DE 2 O MÁS CLASES AL MISMO TIEMPO
                //Una clase puede ser HEREDADA por multiples clases



        }
}