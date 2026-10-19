import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        String rura = "C:\\Users\\Juan\\Desktop\\personas.txt";
        String ruta2 = "C:\\Users\\Juan\\Desktop\\escritura.txt";
        String linea = "";
        File lectura = new File(rura);
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
            FileReader fr = new FileReader(lectura);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(escritura);
            String[] datos;
            String curp;
            int indice = 0;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                
                curp= generarCurp(linea,estados,claves);
                fw.write(curp+ "\n");//escribe el curp dentro del archivo
            }
            fw.close(); //cierra y guarda los cambios dentro del archivo
        } catch (Exception ex) {
            ex.printStackTrace();

        }


    }

    public static String generarCurp(String info, String[] estados, String[] claves) {
        int indice = 0;
        String curp;
        String datos[] = info.split(" ");
        
        for (int i = 0; i < estados.length; i++) {
            if (datos[5].toUpperCase().equals(estados[i])) {
                indice = i;
                break;
            }
        }

        curp = datos[1].substring(0, 2) +
                datos[2].substring(0, 1) +
                datos[0].substring(0, 1) +
                datos[3].substring(8, 10) +
                datos[3].substring(3, 5) +
                datos[0].substring(0, 2) +
                datos[4] + claves[indice] +
                datos[6];

        System.out.println("CURP>>>>>" + curp);

        return curp;
    }
}