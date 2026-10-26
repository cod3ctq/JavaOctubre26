import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Colecciones Java: Listas, Mapas y Conjuntos
        //Crear una lista

        //cual es la diferencia entre list vs ArrayList
        //List es una interface

        List<String> lista1 = new ArrayList<String>();

        //Esta vacia?
        System.out.println(lista1.isEmpty());

        //Agregar elementos a la lista
        lista1.add("Puebla");
        lista1.add("Heroica");
        lista1.add("Nacional");
        lista1.add("De");
        lista1.add("1234568");
        lista1.add("!#$%%&//()=?");
        lista1.add("---------");
        lista1.add("Puebla");

        System.out.println("Vacia? :" + lista1.isEmpty());
        //tamaño de la lista
        System.out.println("Tamaño: " + lista1.size());
        //Imprimir toda la lista
        System.out.println("Toda la lista:" + lista1);
        //Obtener el elemento de una posicion de la list
        System.out.println("Obtener elemento : " + lista1.get(3));

        //Eliminar elementos de la lista
        lista1.remove(4); //por indice/posicion
        System.out.println(lista1);
        lista1.remove("!#$%%&//()=?"); //eliminas por objeto
        System.out.println(lista1);

        //Existe tal elemento en la lista
        System.out.println(lista1.contains("Heroica"));

        //Indice donde se encuentra por primera vez cierto valor
        System.out.println("Primer indice: " + lista1.indexOf("Heroica"));

        //Indice donde esta por ultima vez cierto valor
        System.out.println("Ultimo indice: " + lista1.lastIndexOf("Heroica"));

        List<Cuenta> cuentasCargadas = cargarCuentas("C:\\Users\tenan\\Desktop\\cuentas.txt");

        //Imprimir la lista
        String[] datosI;
        for (Cuenta item : cuentasCargadas) {

            //Imprimir solo las cuentas con un saldo mayor a 30000.00 solo imprimir
            //numero de tarjeta y nombre de cliente
            //if (item.getSaldo()>30000){
            //   System.out.println(item.getNumTarjeta() + ":" + item.getNombre() + "Saldo:" + item.getSaldo());
            //}

            if (item.getNumeroCuenta().equals("458712369013")){
                break;
            }
            System.out.println(item);
        }
        System.out.println("Cuenta en el indice 10: " + cuentasCargadas.get(10));
        System.out.println("Cuantas cuentas hay en la lista ?: " + cuentasCargadas.size());
        //System.out.println(cuentasCargadas.contains());

        //Buscar una cuenta por numero de cuenta
        //cuentasCargadas
    }

    static List<Cuenta> cargarCuentas(String ruta){

        List<Cuenta> cuentas = new ArrayList<Cuenta>();
        File file = new File(ruta);
        String linea = "";
        String[] arrayDatos;
        Cuenta c = null;

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine())!=null) {

                //System.out.println(linea);

                arrayDatos = linea.split(",");

                c = new Cuenta(arrayDatos[0], arrayDatos[1], arrayDatos[2], arrayDatos[3], Double.parseDouble(arrayDatos[4]), arrayDatos[5]);

                cuentas.add(c);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return cuentas;




















    }
}