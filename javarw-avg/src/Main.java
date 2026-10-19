//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Leer y escribir archivos en java

        String ruta = "C:\\Users\\ally0\\Desktop\\personas.txt";
        String ruta2 = "C:\\Users\\ally0\\Desktop\\escritura.txt";
        String linea = ""; //Llenar con el contenido de la linea que actualmente esté leyendo
        File lectura = new File(ruta); //Representación de un archivo en memoria
        File escritura = new File(ruta2);

        String[] estados = {
                "AGUASCALIENTES", "MORELOS",
                "BAJA CALIFORNIA", "NAYARIT",
                "BAJA CALIFORNIA SUR", "NUEVO LEON",
                "CAMPECHE", "OAXACA",
                "CHIAPAS", "PUEBLA",
                "CHIHUAHUA", "QUERETARO",
                "COAHUILA", "QUINTANA ROO",
                "COLIMA", "SAN LUIS POTOSI",
                "DISTRITO FEDERAL", "SINALOA",
                "DURANGO", "SONORA",
                "GUANAJUATO", "TABASCO",
                "GUERRERO", "TAMAULIPAS",
                "HIDALGO", "TLAXCALA",
                "JALISCO", "VERACRUZ",
                "MEXICO", "YUCATÁN",
                "MICHOACAN", "ZACATECAS"
        };

        String[] claves = {
                "AS", "MS",
                "BC", "NT",
                "BS", "NL",
                "CC", "OC",
                "CS", "PL",
                "CH", "QT",
                "CL", "QR",
                "CM", "SP",
                "DF", "SL",
                "DG", "SR",
                "GT", "TC",
                "GR", "TS",
                "HG", "TL",
                "JC", "VZ",
                "MC", "YN",
                "MN", "ZS"
        };
        try {
            FileReader fr = new FileReader(lectura); //Cache temporal
            BufferedReader br = new BufferedReader(fr); //Lector del cache
            FileWriter fw = new FileWriter(escritura);

            String[] datos;
            String curp;
            int indice = 0;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                //CARLOS HERNANDEZ LOPEZ 12/03/1994 M puebla A7K
                //HELC940312MPBA7K
                //System.out.println(linea.substring(7)); //Corta una cadena a partir del indice
                //System.out.println(linea.substring(7,16)); //Devuelve la subcadena de los indices señalados, inicio y fin
                curp = generarCurp(linea, estados, claves);

                fw.write(curp + "\n");
            }
            fw.close();
        }catch ( Exception ex){
            ex.printStackTrace();
        }
    }
    public static String generarCurp(String informacion, String[] estados, String[] claves){

        String[] datos = informacion.split(" ");
        int indice = 0;
        String curp = "";

        for (int i = 0; i < estados.length; i++){
            if (datos[5].toUpperCase().equals(estados[i])){
                indice = i;
                System.out.println("CLAVE : " + claves[i]);
                break;
            }
        }
        System.out.println(datos[6]);

        curp = datos[1].substring(0,2)+
                datos[2].substring(0,1)+
                datos[0].substring(0,1)+
                datos[3].substring(8,10)+
                datos[3].substring(3,5)+
                datos[3].substring(0,2)+
                datos[4] + claves [indice]+
                datos[6];

        System.out.println(">>>>>>>>>>" + curp);

        return curp;
    }
}

