import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String ruta = "C:\\Users\\AsusMan\\Desktop\\personas.txt";
        String linea = "";  // se llena con el contenido de la linea que actualmente se esté leyendo
        String[] estados = {"AGUASCALIENTES,AS", "MORELOS,MS",
                "BAJA CALIFORNIA,BC", "NAYARIT,NT",
                "BAJA CALIFORNIA SUR,BS", "NUEVO LEON,NL",
                "CAMPECHE,CC", "OAXACA,OC",
                "CHIAPAS,CS", "PUEBLA,PL",
                "CHIHUAHUA,CH", "QUERETARO,QT",
                "COAHUILA,CL", "QUINTANA ROO,QT",
                "COLIMA,CM", "SAN LUIS POTOSI,SP",
                "DISTRITO FEDERAL,DF", "SINALOA,SL",
                "DURANGO,DG", "SONORA,SR",
                "GUANAJUATO,GT", "TABASCO,TC",
                "GUERRERO,GR", "TAMAULIPAS,TS",
                "HIDALGO,HG", "TLAXCALA,TL",
                "JALISCO,JC", "VERACRUZ,VZ",
                "MEXICO,MC", "YUCATÁN,YN",
                "MICHOACAN,MN", "ZACATECAS,ZS"
    };


        File lectura = new File(ruta);  // representacion de un archivo en memoria

        try {
            FileReader fr = new FileReader(lectura);   // cache temporal
            BufferedReader br = new BufferedReader(fr);   // lector del cache

            String[] datos;
            String curp;
            int indice = 0;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                // CARLOS HERNANDEZ LOPEZ 12/03/1994 M puebla A7K

//                System.out.println(linea.substring(7));  // corta una cadena a partir del indice proporcionado
//                System.out.println(linea.substring(1,3));  // devuelcve la subcadena de los indices señalados de inicio a fin

                // split :  devuelve un array de String cortando la cadena en elementos
                // individuales buscnando el caracter indicado
                datos = linea.split(" ");  // {CARLOS, HERNANDEZ, LOPEZ, 12/03/1994, M, puebla, A7K}
//                System.out.println(datos[3]);
//
//                // Primeras 2 letras del apellido paterno
//                System.out.println("Apellido paterno >> " + datos[1].substring(0, 2));
//
//                // Primer letra del apellido materno
//                System.out.println("Apellido materno >> " + datos[2].substring(0, 1));
//
//                // Primer letra del nombre
//                System.out.println("Nombre >> " + datos[0].substring(0, 1));
//
//                // Ultimos 2 numeros del año
//                System.out.println("Ultimos 2 numeros del año >> " + datos[3].substring(8, 10));
//
//                // 2 digitos del mes
//                System.out.println("2 numeros del mes >> " + datos[3].substring(3, 5));
//
//                // 2 digitos del dia
//                System.out.println("2 numeros del dia >> " + datos[3].substring(0, 2));
//
//                // Caracter del sexo
//                System.out.println("caracter sexo >> " + datos[4]);
//
                // Caractereres del estado
                for (int i = 0; i < estados.length; i++) {
                    if (estados[i].contains(datos[5])) {
                        System.out.println("2 caracter estado >> " + estados[i].substring(estados[i].length() - 2, estados[i].length()));
                        indice = i;
                        break;
                    }
                }
//
////                for (int i = 0; i < estados.length; i++) {
////                    if (datos[5].toUpperCase().equals(estados[i])) {
////                        System.out.println("CLAVE: " + claves[i]);
////                        break;
////                    }
////                }
//
//                // Ultimos 3 caractereres de la cadena original
//                System.out.println("caracter sexo >> " + datos[6]);
//

                curp =datos[1].substring(0, 2)+
                        datos[2].substring(0, 1)+
                        datos[0].substring(0, 1)+
                        datos[3].substring(8, 10)+
                        datos[3].substring(3, 5)+
                        datos[3].substring(0, 2)+
                        datos[4]+
                        estados[indice].substring(estados[indice].length() - 2, estados[indice].length())+
                        datos[6];

                System.out.println("<<<<" + curp + ">>>>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}