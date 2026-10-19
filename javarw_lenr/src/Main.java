import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String ruta = "C:\\Users\\carba\\OneDrive\\Desktop\\personas.txt";
        String linea = ""; //llenar con el contenido de la linea que actualmente se esta leyendo

        File lectura = new File(ruta);//Representacion de un archivo en memoria

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

        try{
            FileReader fr = new FileReader(lectura); //Cache temporal
            BufferedReader br = new BufferedReader(fr); //Lector del cache

            String[] datos;
            String curp;
            int indice= 0;

            while( (linea = br.readLine())!=null){
                System.out.println(linea);

                //CARLOS HERNANDEZ LOPEZ 12/03/1994 M puebla A7K

                //HELC940312MPBA7K
                //System.out.println(linea.substring(7)); //Corta una cadena a partir del indice
                //System.out.println(linea.substring(7,16));

                //split : devuelve un array de String cortando la cadena de elementos individuales buscando
                //el caracter indicado

                datos = linea.split(" ");//[ANA,SANCHEZ,RUIZ,14/02/2000,F,veracruz
                System.out.println(datos[3]);

                //Primeras 2 letras del apellido paterno
                System.out.println("Apellido paterno  >>"+datos[1].substring(0,2));

                //Primer letra del apellido materno
                System.out.println("Apellido materno  >>"+datos[2].substring(0,1));

                //Primer letra del nombre
                System.out.println("Nombre   >>"+datos[0].substring(0,1));

                //Ultimos dos numeros del año
                System.out.println("Año   >>"+datos[3].substring(8,10));

                //2 digitos del mes
                System.out.println("Mes  >>"+datos[3].substring(3,5));

                //2 digitos del dia
                System.out.println("Dia  >>"+datos[3].substring(0,2));

                //Caracter del sexo
                System.out.println("Sexo  >>"+datos[4]);

                //Caracteres del estado

                //Determinar que indice tiene el estado dentro del array
                for(int i = 0; i< estados.length; i++ ){

                    if(datos[5].toUpperCase().equals(estados[i])){
                        indice =i;
                        System.out.println("CLAVE  : "+claves[i]);
                        break; //romper manualmente el ciclo
                    }
                }

                //Ultimos 3 caracteres de la cadena original
                System.out.println("Ultimos caracteres  >>"+datos[6]);

                curp = datos[1].substring(0,2)+datos[2].substring(0,1)+datos[0].substring(0,1)+
                        datos[3].substring(8,10)+datos[3].substring(3,5)+datos[3].substring(0,2)+
                        datos[3].substring(0,2)+datos[4]+claves[indice]+datos[6];

                System.out.println(">>>>>>>>>>>>>>:"+curp);

            }
        }catch(Exception ex){
            ex.printStackTrace();

        }

    }
}