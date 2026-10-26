import java.util.HashMap;
import java.util.Map;

public class PracticaMapas {
    public static void main(String[] args) {

        //Map es una I
        //HashMAp es una clase que implementa esta I
        Map<String, String> registro = new HashMap<String, String>();

        //Agregar Registro
        registro.put("123456789","Fernado Lopez ferlo@gma il.com");
        registro.put("123456788","Gabriel Martinez gamar@gmail.com");
        registro.put("123456787","Carlos Toprrez carto@gmail.com");
        registro.put("123456786","Kelly Luna kelu@hotmail.com");
        registro.put("123456785","Ana Ramos anara@outlook.com");


        //Obtener mapa
        System.out.println("Regritro en el mapa: "+registro.size());

        //Obtener un elemento particular del map
        System.out.println(registro.get("123456789"));

        //Existe la llave
        System.out.println("Exisate la llave? :"+registro.containsKey("123456789"));

        //Existe un valor
        System.out.println("Existe el valor: "+ registro.containsValue("Fernado Lopez ferlo@gma il.com"));

        //Eliminar elemento del mapa
        registro.remove("123456787");
        System.out.println("Regritro en el mapa: "+registro.size());
        //Solo si la llav ey valor coinsiden lo eliminara y elimina ambas
        registro.remove("123456785","Ana Ramos anara@outlook.com");
        System.out.println("Regritro en el mapa: "+registro.size());

        //Devuelve solo el conjunto de la llaves
        System.out.println(registro.keySet());
        for (String key: registro.keySet()){ //itera sobre las llaves
            System.out.println(key);
            System.out.println(registro.get(key));

            for (String value: registro.values()){//itera sobre los valores
                System.out.println(value);
            }


        }


    }
}
