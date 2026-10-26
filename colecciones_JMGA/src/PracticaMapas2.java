import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticaMapas2 {
    public static void main(String[] args) {
        Map<String, List<Dispositivo>> catalogo = new HashMap<String, List<Dispositivo>>();
        catalogo = cargarDispositivos("C:\\Users\\Juan\\Downloads\\telefonos.txt");

        //Ver el contenido del mapa (lalve.valor)
        for (String key : catalogo.keySet()) {
            System.out.println("Marca actual: "+ key);
            for (Dispositivo d : catalogo.get(key)) {
                System.out.println(d);
            }
            System.out.println("Elementos en la lista:  "+ key+"--" +catalogo.get(key).size() );
        }
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
                dispo = new Dispositivo(datos[0], datos[1], datos[2], Double.parseDouble(datos[3]),
                        datos[4], datos[5], datos[6],
                        datos[7], Integer.parseInt(datos[8]));
                //Agregar el registro al mapa(lalve, valor)
                //Escenatrio 1: si la marca (lalve) ya existe,agrega el objeto a la lista
                if (mapa.containsKey(datos[0])) {
                    mapa.get(datos[0]).add(dispo);

                } else {//Escenario2; la llave(marca) aun no exisate, agregala y despues creas la lista y añades el obj
                    mapa.put(datos[0], new ArrayList<Dispositivo>());
                    mapa.get(datos[0]).add(dispo);

                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return mapa;
    }
}
