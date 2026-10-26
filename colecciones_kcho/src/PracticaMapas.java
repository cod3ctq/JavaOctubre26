import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PracticaMapas {
    public static void main(String[] args) {

/*
// MAp es una interface
// HashMa es una de las clases que implementa esta interface
        Map<String, String> registro = new HashMap<String, String>();

       // agregar registros al mapa
        registro.put("2224557236", "Fernando Lopez ferlo@gmail.com");
        registro.put("4455667788", "Gabriela Anota gaba@mail.com");
        registro.put("3322445577", "Ruben Aquino aquiru@bravemail.com");
        registro.put("7755220011", "Kika Marquez kikam@yahoo.com");
        registro.put("1900225599", "Maria Benitez beni_ma@hotmail.com");
        registro.put("3322445577", "YO MERO MERITO homerito@jaja.com");

        //obtener el tamaño del mapa
        System.out.println("Registros en el mapa: " + registro.size());

        //obtener un elemento en particular del mapa
        System.out.println(registro.get("7755220011"));

        //existe la llave??
        System.out.println("Existe la llave: 4455667788 ?? : " + registro.containsKey("4455667788") );

        //existe el valor??
        System.out.println("Existe el valor: [Fernando Lopez ferlo@gmail.com] ?? : " + registro.containsValue("Fernando Lopez ferlo@gmailcom"));

        //como puedo eliminar elementos del mapa
        registro.remove("1900225599");
        System.out.println("Eliminando el registro 1900225599..");
        System.out.println("Quedan : [" + registro.size() + "] registros");

        //solo si coincide la llave con su valor
        registro.remove("3322445577", "Ruben Aquino aquiru@bravemail.com");
        System.out.println("Se elimino el registro... [3322445577],  [Ruben Aquino aquiru@bravemail.com] \nQuedan : [" + registro.size() + "] registros");

        //devuelve solo el conjunto de las llaves
        System.out.println(registro.keySet());
        for(String key : registro.keySet()){  //itera sobre las llaves
            System.out.println(key + " >> " + registro.get(key));
        }

        for(String value : registro.values()){  //itera sobre los valores
            System.out.println(value);
        }*/

        Map<String, List<Dispositivo>> catalogo = new HashMap<String, List<Dispositivo>>();
        String ruta = "C:\\Users\\AsusMan\\Desktop\\telefonos.txt";

        catalogo = cargarDispositivos(ruta);

        System.out.println(catalogo);
        System.out.println(catalogo.size());

        for( String key : catalogo.keySet()){
            System.out.println("***MARCA ACTUAL*** _[" + key + "]");
            for(Dispositivo disp: catalogo.get(key)){
                System.out.println(disp);
            }
            System.out.println(catalogo.get(key).size());
        }

    }

    public static Map<String, List<Dispositivo>> cargarDispositivos(String ruta){

        Map<String, List<Dispositivo>> mapa = new HashMap<String, List<Dispositivo>>();

        Dispositivo dispo = null;
        String linea;

        File archivo = new File(ruta);
        String[] datos;


        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null){
                datos = linea.split("#");

                dispo = new Dispositivo (datos[0], datos[1], datos[2],
                        Double.parseDouble(datos[3]),
                        datos[4],datos[5],
                        datos[6],datos[7],
                        Integer.parseInt(datos[8]));
                //Agregar el registro al mapa(llave,valor)
                //mapa.put(datos[0], dispo);

                //escenario 1: la marca(llave) ya existe, agrega el objeto directo a la lista
                if (mapa.containsKey(datos[0])){
                    mapa.get(datos[0]).add(dispo);
                }else{ //escenario 2: la llave(marca) aun no existe, agregala y despues
                    // creas la lista y añades el objeto
                    mapa.put(datos[0], new ArrayList<Dispositivo>());
                    mapa.get(datos[0]).add(dispo);
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return mapa;
    }

}
