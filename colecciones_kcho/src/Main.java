
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {

        // Colecciones en JAVA: Listas, Mapas y Conjuntos

        // Crear una lista
        List<String> lista1 = new ArrayList<String>();

        //Esta vacia?
        System.out.println("vacia ? " + lista1.isEmpty());

        //Agregar elementos a la lista
        lista1.add("hola");
        lista1.add("     ");
        lista1.add("JavERO");
        lista1.add("aqui");
        lista1.add("estamos");
        lista1.add("probando");
        lista1.add("y");
        lista1.add("probando");

        //Esta vacia?
        System.out.println("vacia ? " + lista1.isEmpty());

        System.out.println("tamaño : " + lista1.size());

        System.out.println(lista1);

        //como obtener una copia de un elemento en una posicion de la lista
        System.out.println("elemento en la posicion 5 es : " + lista1.get(5));

        //como elimiar elementos de una lista
        // hay dos maneras, remove y removeall
        //eliminar el elemento 1
        lista1.remove(1);  //elimina por indice
        System.out.println(lista1);

        lista1.remove("JavERO");  //elimina por objeto (cada elemento es tomado como un objeto)
        System.out.println(lista1);

        // existe TAL elemento en la lista?
        System.out.println("existe en la lista 'JAJAJA'¿? " + lista1.contains("JAJAJA"));
        System.out.println("existe en la lista 'EstAmos'¿? " + lista1.contains("EstAmos"));
        System.out.println("existe en la lista 'estamos'¿? " + lista1.contains("estamos"));
        System.out.println("existe en la lista 'probando'¿? " + lista1.contains("probando"));

        //Indice donde se encuentra por primera vez cierto valor
        System.out.println("primer indice donde se encuentra 'probando': " + lista1.indexOf("probando"));
        //Indice donde se encuentra por ultima vez cierto valor
        System.out.println("ultimo indice donde se encuentra 'probando': " + lista1.lastIndexOf("probando"));

        List<Cuenta> cuentasCargadas = cargarCuentas("C:\\Users\\AsusMan\\Desktop\\cuentas.txt");
        String[] datosIndividuales;

        for(Cuenta dato : cuentasCargadas) {
            // IMPRIME toda la lista de cuentas que se encuentra en el FILE
            // System.out.println(dato);

            // Imprimir solo las cuentas con un saldo mayor a 5000,
            // solo imprimir numero de tarjeta y nombre de cliente
            if(dato.getSaldo() > 10000){
                System.out.println("Cte. : " + dato.getNombre() + " - Tja. : " + dato.getNumTarjeta() + " - Sdo. : " + dato.getSaldo());
            }
            if (dato.getNumCuenta().equals("233454545")){
                // haz algo con el objeto
                break;
            }
        }

        System.out.println("\n>>>>" + cargarCuentas("C:\\Users\\AsusMan\\Desktop\\cuentas.txt"));
    }

    static List<Cuenta> cargarCuentas(String ruta){
        List<Cuenta> cuentas = new ArrayList<Cuenta>();
        File file = new File(ruta);
        String linea = "";
        String[] arrayDatos; //tendra la forma ["", "", "", ""]
        Cuenta c = null;
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while( (linea = br.readLine()) != null){
                //System.out.println(linea);
                arrayDatos = linea.split(",");
                c = new Cuenta(arrayDatos[0], arrayDatos[1],arrayDatos[2],arrayDatos[3],Double.parseDouble(arrayDatos[4]),arrayDatos[5]);
                cuentas.add(c);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return cuentas;
    }
}
