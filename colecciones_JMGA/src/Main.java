import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Listas , Mapas y Conjuntos
        //Cual es la diferencia entre List y Arrray List
        //List es una Interface y ArrayList es la clase que la implementa

        List<String> lista1 = new ArrayList<String>();

        //Vacia
        System.out.println(lista1.isEmpty());

        //Agregar elementos
        lista1.add("Puebls");
        lista1.add("28");
        lista1.add("Pue");
        lista1.add("bls");
        lista1.add("texto");
        lista1.add("CETEQ");
        lista1.add("------");
        lista1.add("CETEQ");

        System.out.println(lista1.isEmpty());

        //Tamaño
        System.out.println(lista1.size());

        //imprimir
        System.out.println(lista1);

        //obtener una copia de un elemento de en una posisision de la lista
        System.out.println("Obtener elemento: " + lista1.get(5));

        //Eliminar elementos d euna lista
        lista1.remove(2); //Eliminacion por indice
        System.out.println(lista1);
        lista1.remove("texto");//Eliminas por objeto
        System.out.println(lista1.size());
        //Existe tal elemento en la lista
        System.out.println(lista1.contains("Java"));

        //Cual es el indice donde se encuentra por priemra vez cierto valor
        System.out.println("Primer Indice: " + lista1.indexOf("CETEQ"));

        //Indice dodne está por ultima vez cierto valor
        System.out.println("Primer Indice: " + lista1.lastIndexOf("CETEQ"));


        List<Cuenta> cuentasCargadas = cargarCuentas("C:\\Users\\Juan\\Downloads\\cuentas.txt");

        // Imprimir lista
        //por todos y cada uno vamos a imprimir datos
        String[] datosI;
        for (Cuenta item : cuentasCargadas) {
            System.out.println(item);
            //Imprimir solo las cuentas con un saldo mayor a 5000, solo imprimir numero de tarjetra y nombre de cliente
//            if (item.getSaldo()>30000){
//                System.out.println(item.getNumTarjeta()+ ":" + item.getNombre() +":"+ item.getNombre());
//            }
            System.out.println("->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Cuenta en el indice: " + cuentasCargadas.get(10));

        }
    }


    static List<Cuenta> cargarCuentas(String ruta) {
        List<Cuenta> cuentas = new ArrayList<Cuenta>();

        File file = new File(ruta);
        String linea = "";
        String arrayDatos[]; //["","",""]
        Cuenta c = null;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                arrayDatos = linea.split(",");
                c = new Cuenta(arrayDatos[0], arrayDatos[1], arrayDatos[2],
                        arrayDatos[3], Double.parseDouble(arrayDatos[4]), arrayDatos[5]);
                cuentas.add(c);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cuentas;
    }
}