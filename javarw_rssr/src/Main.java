import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.SQLOutput;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String ruta ="C:\\Users\\Hp\\Desktop\\personas.txt";
        //String linea="";
        String ruta2 = "C:\\Users\\Hp\\Desktop\\escritura.txt";
        String linea = ""; //llenar con el contenido de la linea que actualmente se este leyendo

        File lectura = new File(ruta); //Representacion de un archivo en memoria
        File escritura = new File(ruta2);


        File lectura = new File(ruta);

        try {
            FileReader fr = new FileReader(lectura);
            BufferedReader br = new BufferedReader(fr);

            String[] estados = {
                    "AGUASCALIENTES", "MORELOS",
                    "BAJA CALIFORNIA", "NAYARIT",
                    "BAJA CALIFORNIA SUR", "NUEVO LEON",
                    "CAMPECHE", "OAXACA",
                    "CHIAPAS", "PUEBLA",
                    "CHIHUAHUA", "QUERÉTARO",
                    "COAHUILA", "QUINTANA ROO",
                    "COLIMA", "SAN LUIS POTOSI",
                    "DISTRITO FEDERAL", "SINALOA",
                    "DURANGO", "SONORA",
                    "GUANAJUATO", "TABASCO",
                    "GUERRERO", "TAMAULIPAS",
                    "HIDALGO", "TLAXCALA",
                    "JALISCO", "VERACRUZ",
                    "MEXICO", "YUCATÁN",
                    "MICHOACÁN", "ZACATECAS"
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

                    curp = generarCurp(linea, estados, claves);

                    fw.write(curp + "\n"); //Escribe el curp dentro del archivo
                }

                fw.close(); //Cierra y guarda los cambios dentro del archivo

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public static String generarCurp(
                String informacion, String[] estados, String[] claves) {

            String[] datos = informacion.split(" ");
            // [ANA,SANCHEZ,RUIZ,14/02/2000,F,veracruz,L8M]

            int indice = 0;
            String curp = "";

            // Código de las líneas 81 a 98 no visible en las imágenes

            for (int i = 0; i < estados.length; i++) {
                if (datos[5].toUpperCase().equals(estados[i])) {
                    indice = i;
                    System.out.println("CLAVE : " + claves[i]);
                    break; //romper manualmente el ciclo
                }
            }

            //Ultimos 3 caracteres de la cadena original
            System.out.println(datos[6]);

            curp = datos[1].substring(0, 2) +
                    datos[2].substring(0, 1) +
                    datos[0].substring(0, 1) +
                    datos[3].substring(8, 10) +
                    datos[3].substring(3, 5) +
                    datos[3].substring(0, 2) +
                    datos[4] +
                    claves[indice] +
                    datos[6];

            System.out.println(">>>>>>>>>>:" + curp);

            return curp;
    }
}