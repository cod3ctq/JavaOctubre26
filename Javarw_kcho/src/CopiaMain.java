import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.Arrays;

import java.util.Scanner;
import java.io.IOException;

public class CopiaMain {
    public static void main(String[] args) {

        String ruta = "C:\\Users\\AsusMan\\Desktop\\personas.txt";
        String ruta2 = "C:\\Users\\AsusMan\\Desktop\\escritura.txt";
        String curp;

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
        File escritura = new File(ruta2);

        try {
            FileReader fr = new FileReader(lectura);   // cache temporal
            BufferedReader br = new BufferedReader(fr);   // lector del cache
            FileWriter fw = new FileWriter(escritura);


            while ((linea = br.readLine()) != null) {
                curp = generarCurp(linea, estados);

                System.out.println("<<<<" + curp + ">>>>");
                fw.write(linea + " " + curp + "\n");

            }

            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static String generarCurp(String informacion, String[] estados) {
        String[] datos;
        String letrasEstado = "";
        String curp;

        System.out.println(informacion);
        // split :  devuelve un array de String cortando la cadena en elementos
        // individuales buscnando el caracter indicado
        datos = informacion.split(" ");  // {CARLOS HERNANDEZ LOPEZ 12/03/1994 M puebla A7K}

//        int inicio = 0;
//        int numPalabra = 0;
//        for(int i = 0; i < informacion.length(); i++){
//            if( informacion.charAt(i) == ' ' || i == informacion.length()-1){
//                datos[numPalabra] = informacion.substring(inicio, i+1);
//                inicio = i;
//                numPalabra++;
//
//                if(numPalabra == 4){ // encontre la letra del sexo, voy a cambiar indices para
//                                    // tomar todas las palabras que existan entre sexo y los 3
//                                    // caracteres de homoclave
//
//                }
//            }
//        }
//


        // Caractereres del estado
        for (int i = 0; i < estados.length; i++) {
            if (estados[i].contains(datos[5])) {
                letrasEstado = estados[i].substring(estados[i].length() - 2, estados[i].length());
                break;
            }
        }

        curp = datos[1].substring(0, 2) +
                datos[2].substring(0, 1) +
                datos[0].substring(0, 1) +
                datos[3].substring(8, 10) +
                datos[3].substring(3, 5) +
                datos[3].substring(0, 2) +
                datos[4] +
                letrasEstado +
                datos[6];

        return curp;
    }


}


