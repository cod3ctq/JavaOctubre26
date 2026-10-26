import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticaMapas {

    public static void main(String[] args) {
//
//        Map<String, String> registro = new HashMap<String, String>();
//
//        //Agregar registros al mapa
//
//        registro.put("7442435262", "luisnr@gmail.com");
//        registro.put("7442435363", "fernandoG2@gmail.com");
//        registro.put("7442435464", "gabim5@yahoo.com.mx");
//        registro.put("546374859", " CarlosL@hotmail.com");
//        registro.put("775758494", "Anara@outlook.com");
//
//        //obtener el tamaño del mapa
//        System.out.println("Regsitros en el mapa :" + registro.size());
//
//        //Obtener un elemento en particular del mapa
//        System.out.println(registro.get("775758494"));
//
//        //Existe la llave?
//        System.out.println("Existe la llave? " + registro.containsKey("546374859"));
//
//        //Existe este valor?
//        System.out.println("Existe este valor? " + registro.containsValue("Anara@outlook.com"));
//
//        //Eliminar elementos del mapa
//        registro.remove("546374859");
//        System.out.println("Regsitros en el mapa :" + registro.size());
//
//        //Solo si la llave esta asociada a dicho valor
//        registro.remove("7442435464", "gabim5@yahoo.com.mx");
//        System.out.println("Registros en el mapa :" + registro.size());
//
//        //Devuelve solo el conjunto de las llaves
//        //System.out.println(registro.keySet());
//        for (String key : registro.keySet()) {//Itera sobre las llaves
//            System.out.println(registro.get(key));
//        }
//
//        for (String value : registro.values()) { //Itera sobre los valores
//
//            System.out.println(value);
//
//        }
        //--------------------------------------------------------------------------------------------------

        Map<String, List<Dispositivo>> catalogo = new HashMap<String, List<Dispositivo>>();
        catalogo = cargarDispositivos("C:\\Users\\carba\\Downloads\\telefonos.txt");

        //Ver el contenido del mapa (llave, valor)
        for(String key: catalogo.keySet()){//-----> [0,0,0,0,0]

            System.out.println("MARCA ACTUAL: " + key);
            for(Dispositivo d : catalogo.get(key)){
                System.out.println(d);

            }

            System.out.println("Elementos en la lista de : " + key + " --> " + catalogo.get(key).size());
        }
        //Imprimir el tamaño de cada lista


    }
    public static Map<String, List<Dispositivo>> cargarDispositivos(String ruta) {
        Map<String, List<Dispositivo>> mapa = new HashMap<String, List<Dispositivo>>();
        Dispositivo dispo = null;
        String linea;
        File archivo = new File(ruta);
        String datos[];

        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                datos = linea.split("#");

                dispo = new Dispositivo(datos[0], datos[1], datos[2], Double.parseDouble(datos[3]), datos[4], datos[5],
                        datos[6], datos[7], Integer.parseInt(datos[8]));

                //Agregar el registro al mapa (llave, valor)

                //Agregar el registro al mapa(llave,valor)

                //Escenario 1: la marca(llave) ya existe, agrega el objeto directo a la lista

                if(mapa.containsKey((datos[0]))){
                    mapa.get(datos[0]).add(dispo);

                }else { //la llave(marca) aun no existe, agregala y despues creas la lista añadiendo el objeto
                    mapa.put(datos[0], new ArrayList<Dispositivo>());
                    mapa.get(datos[0]).add(dispo);
                }

            }
        } catch (Exception ex){
            ex.printStackTrace();

        }
        return mapa;
    }
}









