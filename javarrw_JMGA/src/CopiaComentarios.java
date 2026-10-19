import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CopiaComentarios {
    public static void main(String[] args) {
        String rura = "C:\\Users\\Juan\\Desktop\\personas.txt"; //solo un apuntador
        String linea = ""; // se llena con el contenido
        File lectura = new File(rura); //representacion de u n erchivo ewn memoria
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
            FileReader fr = new FileReader(lectura);//cache temporal
            BufferedReader br = new BufferedReader(fr);//lector del cache
            String[] datos;
            String curp;
            int indice = 0;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                //Carlos Hernandez Lopez 12/03/ 1994 M Puebla A/K

                //HELC9403112MPBA7K
                // System.out.println(linea.substring(7));//corta una cadena a partir del indice
                //System.out.println(linea.substring(7, 8));//Devuelve la sub cadena de los indices señalados , inidio y fin
                datos = linea.split(" "); //Split devuielve un array de String cortando la cadena en elementos individuales buscando el  caracter indiocado
                //System.out.println(datos[3]);
                //Primeras 2 letras del apellido paterno

                System.out.println("Apellido Paterno: " + datos[1].substring(0, 2));
                //Primer letra del apellido materno
                System.out.println("Apellido Materno: " + datos[2].substring(0, 1));
                //primer letra del nombre
                System.out.println("Nombre: " + datos[0].substring(0, 1));
                //Ultimos 2 numeros del año
                System.out.println("Año: " + datos[3].substring(8, 10));
                //2 digitos del mes
                System.out.println("Mes: " + datos[3].substring(3, 5));
                //2 digitos del día
                System.out.println("Día: " + datos[0].substring(0, 2));
                //Caracter Sexo
                System.out.println("Sexo: " + datos[4]);
                //Caracteres del estado
                //DETERMINAR QUE INDICE TIENE EL ESTADO DENTRO DEL ARRRAY
                for (int i = 0; i < estados.length; i++) {
                    if (datos[5].toUpperCase().equals(estados[i])) {
                        indice = i;
                        System.out.println("Clave: " + claves[i]);
                        break;// sirve para roper manualmente el ciclo
                    }
                }
                //Ultimos # caracteres de la cadena original
                System.out.println(datos[6]);

                curp = datos[1].substring(0, 2) +
                        datos[2].substring(0, 1) +
                        datos[0].substring(0, 1) +
                        datos[3].substring(8, 10) +
                        datos[3].substring(3, 5) +
                        datos[0].substring(0, 2) +
                        datos[4] + claves[indice] +
                        datos[6];

                System.out.println("CURP>>>>>"+curp);

            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}
