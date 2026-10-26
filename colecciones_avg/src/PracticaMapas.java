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
//        //Map es una interface
//        //HashMap es una de las interface que implementa esta interface
//        Map<String, String> registro = new HashMap<String, String>();
//
//        //Agregar registros al mapa
//        registro.put("02937400931","Fernando Lopez ferlo@gmail.com");
//        registro.put("23984699283","Gabriela Martinez gamar@gmail.com");
//        registro.put("43985939393","Carlos Torres carto@hotmail.com");
//        registro.put("94880963884","Kelly Luna Kelu@yahoo.com");
//        registro.put("27634948738","Ana Ramos anara@outlook.com");
//        registro.put("94880963884","Casandra Flores casflo@yahoo.com");
//
//        //Obtener el tamaño del mapa:
//        System.out.println("Registros en el mapa: " + registro.size());
//
//        //Obtener un elemento en particular del mapa:
//        System.out.println(registro.get("94880963884"));
//
//        //Existe la llave?
//        System.out.println("Existe la llave?: " + registro.containsKey("02937400931"));
//
//        //Existe el valor?
//        System.out.println("Existe este valor?: " + registro.containsValue("Fernando Lopez ferlo@gmail.com"));
//
//        //Eliminar elemntos del mapa
//        registro.remove("43985939393");
//        System.out.println("Registros en el mapa: " + registro.size());
//
//        //Solo si la llave esta asociada a dicho valor
//        registro.remove("27634948737","Ana Ramos anara@outlook.com");
//        System.out.println("Registros en el mapa: " + registro.size());
//
//        //Devuelve solo el conjunto de las llaves
//        //System.out.println(registro.keySet());
//        for (String key : registro.keySet()) {  //Itera sobre llaves
//            System.out.println(key);
//        }
//
//        for (String value : registro.values()) {  //Itera sobre los valores
//            System.out.println(value);
//        }

        //-----------------------------------------------------------------------------------------------------------
        Map<String, List<Dispositivo>> catalogo = new HashMap<String, List<Dispositivo>>();
        catalogo = cargarDispositivos("C:\\Users\\ally0\\Desktop\\telefonos.txt");

        //Ver el contenido del mapa (llave,valor)
        for(String key : catalogo.keySet()){
            System.out.println();
            System.out.println("MARCA ACTUAL: " + key);
            System.out.println();
            for(Dispositivo d : catalogo.get(key)){
                System.out.println(d);
            }
            //Imprimir el tamaño de la lista
            System.out.println("Dispositivos de la marca: ");
        }
    }

    public static Map<String, List<Dispositivo>> cargarDispositivos (String ruta){
        Map<String, List<Dispositivo>> mapa = new HashMap<String, List<Dispositivo>>();
        Dispositivo dispo = null;
        String linea;
        File archivo = new File(ruta);
        String[] datos;

        try{
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while((linea = br.readLine()) != null){
                datos = linea.split("#");

                dispo = new Dispositivo(datos[0],datos[1],datos[2],
                        Double.parseDouble(datos[3]),datos[4],datos[5],
                        datos[6], datos[7],Integer.parseInt(datos[8]));
                //Agregar el registro al mapa

                //Escenario 1: la marca(llave) ya exste existe, agregarla el objeto directo a la lista

                if(mapa.containsKey(datos[0])){
                    mapa.get(datos[0]).add(dispo);
                } else {    //Escenario 2: la llave(marca) aun no exite, agregala y despues creas la lista y añades el objeto
                    mapa.put(datos[0], new ArrayList<Dispositivo>());
                    mapa.get(datos[0]).add(dispo);
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return mapa;
    }
}
