import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Colecciones en Java : Listas, Mapas y Conjuntos

        //Crear una lista

        //Cual es la diferencia entre List y ArrayList
        //List es una interface, ArrayList es una clse que implementa esa interface

        //
//        List<String> lista1 = new ArrayList<String>();
//
//        //Esta vacia?
//
//        System.out.println(lista1.isEmpty());
//
//        //Agregar elementos a la lista
//
//        lista1.add("puebla");
//        lista1.add("238476");
//        lista1.add("texto");
//        lista1.add("java");
//        lista1.add("puebla");
//        lista1.add("doce");
//        lista1.add("&/($%&$%&");
//        lista1.add("--------");
//
//        System.out.println("Vacia? : " + lista1.isEmpty());
//        //Tamaño de la lista
//        System.out.println("Tamaño: " + lista1.size());
//        //Imprimir toda la lista
//        System.out.println("Toda la lista: " + lista1);
//        //Obtener una copia de un elemento en una posicion de la lista
//        System.out.println("Obtener elemento: " + lista1.get(5));
//        //Eliminar elementos de una lista
//        lista1.remove(2);   //por indice/posicion
//        lista1.remove("doce");    //por objeto
//        //Existe tal elemento en la lista
//        System.out.println(lista1.contains("puebla"));
//        //Indice donde se encuentra por primera vez cierto valor
//        System.out.println("Primer indice: " + lista1.indexOf("puebla"));
//        //Indice donde se encuentra por ultima vez cierto valor
//        System.out.println("Ultimo indice: " + lista1.lastIndexOf("puebla"));

        List<Cuenta> cuentasCargadas = cargarCuentas("C:\\Users\\ally0\\Downloads\\Programación\\cuentas.txt");

        //Imprimir la lista
        String[] datosI;
        for (Cuenta item : cuentasCargadas){
//
//            //Si las cuentas tienen un saldo mayor a 5000.00, solo imprimir
//            // numero de tarjeta y nombre de cliente
//
//            if (item.getSaldo() > 30000.00) {
//                System.out.println(item.getNumTarjeta() + ":" + item.getNombre());
//            }
            if (item.getNumCuenta().equals("345935876")) {
                //haz algo con el objeto
                break;
            }
        }

//        System.out.println("Cuenta en el indice 10: " + cuentasCargadas.get(9));
//        System.out.println("Cuantas cuentas hay en la lista?: " + cuentasCargadas.size());

    }

        static List<Cuenta> cargarCuentas (String ruta) {

            List<Cuenta> cuentas = new ArrayList<Cuenta>();

            File file = new File(ruta);
            String linea = "";
            String[] arrayDatos;
            Cuenta c = null;

            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                while ((linea = br.readLine()) != null) {
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
