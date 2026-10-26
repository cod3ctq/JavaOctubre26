//import org.w3c.dom.ls.LSOutput;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.List;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main{
//    public static void main(String[] args) {
//
//        //Colecciones en Java: Listas, Mapas y Conjuntos
//
//        //Crear una lista
//
//        List<String> lista1 = new ArrayList<String>();
//
//        //Esta vacia?
//
//        System.out.println(lista1.isEmpty());
//
//        //Agregar elementos a la lista
//        lista1.add("Puebla");
//        lista1.add("36647758");
//        lista1.add("texto");
//        lista1.add("java");
//        lista1.add("doce");
//        lista1.add("7584993");
//        lista1.add("Puebla");
//        lista1.add("-------");
//        lista1.add("moefiwne");
//
//        System.out.println("Vacia : " + lista1.isEmpty());
//
//        //Tamaño de la lista
//        System.out.println("Tamaño : " + lista1.size());
//
//        //Imprimir toda la lista
//        System.out.println("Toda la lista: " + lista1);
//
//        //Obtener una copia de un elemento en una posicion de la lista
//        System.out.println("Obtener elemento : " + lista1.get(5));
//
//        //Eliminar elemento de una lista
//        lista1.remove(2); //Elimina por indice
//        System.out.println(lista1);
//
//        lista1.remove("doce"); //Eliminar por objeto
//        System.out.println(lista1);
//
//        //Existe tal elemento en la lista?
//        System.out.println(lista1.contains("java"));
//
//        //Indice donde se encuentra por primera vez cierto valor
//        System.out.println("Primer indice : " + lista1.indexOf("Puebla"));
//
//        //Indice donde esta por ultima vez cierto valor
//        System.out.println("Ultimo indice : " + lista1.lastIndexOf("Puebla"));
//
//    List<Cuenta> cuentasCargadas = cargarCuentas("C:\\Users\\carba\\OneDrive\\Desktop\\cuentas.txt");
//
//    //Imprimir la lista
//            String[] datosI;
//
//        for(Cuenta item : cuentasCargadas){
//
//            //Imprimir solo las cuentas con un saldo mayor a 5k pesos y de esas cuentas solo imprimir el numero de tarjeta y nombre del cliente
//
//
//            //if(item.getSaldo()>30000){
//                //System.out.println(item.getNumTarjeta() + ":" + item.getNombre()+ ":" + item.getSaldo());
//
//
//
//
//
//            }
//
//        }
//
//
//
//    static List<Cuenta> cargarCuentas(String ruta){
//
//        List<Cuenta> cuentas = new ArrayList<Cuenta>();
//
//        File file = new File(ruta);
//        String linea = "";
//        String[] arrayDatos;
//        Cuenta c = null; //
//
//        try {
//
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//
//            while ( (linea = br.readLine())!= null){
//                //System.out.println(linea);
//                arrayDatos = linea.split(",");
//                c = new Cuenta(arrayDatos[0],arrayDatos[1],arrayDatos[2], arrayDatos[3],
//                        Double.parseDouble(arrayDatos[4]),arrayDatos[5]);
//
//                cuentas.add(c);
//
//            }
//
//        }catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return cuentas;
//
//
//    }







//}