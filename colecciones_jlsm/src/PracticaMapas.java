import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticaMapas {

    public static void main(String[] args) {
        //Map es una interface
        // Hasmap es una de las clases que implementan esta interface

//        Map<String, String> registro = new HashMap<String,String>();
//
//        //agregar registros al mapa
//        registro.put("02937400932","Fernando Lopez ferlog@gmail.com");
//        registro.put("23984699283","Gabriela Martinez gamar@gmail.com");
//        registro.put("43985939393","Carlos Torres carto@hotmail.com");
//        registro.put("94880963884","Kelly Luna Kelug@yahoo.com.mx");
//        registro.put("27634948738","Ana Ramos anara@outlook.com");
//        registro.put("944880963884","Casandra Flores casflo@yahoo.com.mx");
//
//
//        //Obtener el tamaño del mapa:
//        System.out.println("Registros en el mapa: "+registro.size());
//
//        //Obtener un elemento en particular del mapa
//        System.out.println(registro.get("23984699283"));
//
//        //Existe la llave
//        System.out.println("Existe la llave?:"+registro.containsKey("27634948738"));
//
//        //Existe el valor
//        System.out.println("Existe este valor?:"+registro.containsValue("Gabriela Martinez gamar@gmail.com"));
//
//        //Eliminar elementos del mapa
//        registro.remove("43985939393"); //por la llave
//        System.out.println(registro.size());
//
//        //Solo si la llave esta asociada a dicho valor
//        registro.remove("23984699283","Gabriela Martinez gamar@gmail.com");
//        System.out.println(registro.size());
//
//        //Devuelve solo el conjunto de las llaves
//        System.out.println(registro.keySet());
//        for(String key : registro.keySet()){ //Itera sobre las llaves
//            System.out.println(key);
//
//            for (String value : registro.values()) { //Itera sobre los valores
//                System.out.println(value);
//          }
        Map<String, List<Dispositivo>> catalogo = new HashMap<String, List<Dispositivo>>();
        catalogo = cargarDispositivos("C:\\Users\\tenan\\Desktop\\telefonos.txt");
        //ver el contenido del mapa (llave,valor)
        for (String key : catalogo.keySet()) {
            System.out.println("MARCA ACTUAL: " + key);
            for (Dispositivo d : catalogo.get(key)) {
                System.out.println(d);
            }
            System.out.println("Elemetoos en la lista de: "+key+" -> "+catalogo.get(key).size());
            //Imprimir el tamaño de cada lista pendiente
        }
    }
    public static Map<String, List<Dispositivo>> cargarDispositivos(String ruta) {
        Map<String, List<Dispositivo>> mapa = new HashMap<String, List<Dispositivo>>();

        Dispositivo dispo = null;
        String linea;
        File archivo = new File(ruta);
        String[] datos;
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                datos = linea.split("#");
                dispo = new Dispositivo(datos[0], datos[1], datos[2],
                        Double.parseDouble(datos[3]),
                        datos[4], datos[5],
                        datos[6], datos[7],
                        Integer.parseInt(datos[8]));
                //agregar el registro al mapa (llave, valor)
                //mapa.put(datos[0], dispo);

                //Escenario 1: la marca(llave) ya existe, debo agregarla
                if(mapa.containsKey(datos[0])){
                    mapa.get(datos[0]).add(dispo);
                }else { //Escenario2, la llave(marca) aun no existe, agregala y despues
                    //creas la lista y añades el objeto
                    mapa.put(datos[0],new ArrayList<Dispositivo>());
                    mapa.get(datos[0]).add(dispo);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return mapa;
    }
}