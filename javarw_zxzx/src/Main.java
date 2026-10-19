import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Leer y escribir archivos con Java
        String ruta = "C:\\Users\\César\\Destop\\personas.txt";
        String ruta2 = "C:\\Users\\César\\Desktop\\escritura.txt";
        String linea=""; //llenar con el contenido de la linea que actualmente se este leyendo

        File lectura = new File(ruta); //Representacion de un archivo en memoria
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

        try{
            FileReader fr = new FileReader(lectura); //Cache temporal
            BufferedReader br = new BufferedReader(fr);//Lector del cache
            FileWriter fw = new FileWriter(escritura);
            String[] datos;
            String curp;
            int indice=0;
            while( (linea = br.readLine())!=null){
                System.out.println(linea);

                curp = generarCurp(linea, estados, claves);

                fw.write(curp+"\n"); //Escribe el curp dentro del archivo
            }
            fw.close(); //Cierra y guarda los cambios dentro del archivo
        }catch(Exception ex){
//            ex.printStackTrace();
//            System.out.println("Hubo un error:"+ex.getMessage());
        }
    }
    public static String generarCurp(String informacion,String[] estados, String[] claves){

        String[] datos = informacion.split(" ");//[ANA,SANCHEZ,RUIZ,14/02/2000,F,veracruz,L8M]
        int indice=0;
        String curp="";
//                //System.out.println(datos[3]);
//                //Primeras 2 letras del apellido paterno
//                System.out.println("Apellido Paterno >>"+datos[1].substring(0,2));
//                //Primer letra del apellido materno
//                System.out.println("Apellido Materno >>"+datos[2].substring(0,1));
//                //Primer letra del nombre
//                System.out.println("Nombre >>"+datos[0].substring(0,1));
//                //Ultimos 2 numeros del año
//                System.out.println("Año "+datos[3].substring(8,10));
//                //2 digitos del mes
//                System.out.println("Mes: "+datos[3].substring(3,5));
//                //2 digitos del dia
//                System.out.println("Dia: "+datos[3].substring(0,2));
//                //Caracter del sexo
//                System.out.println("Sexo : "+datos[4]);
        //Caracteres del estado

        //Determinar que indice tiene el estado dentro del array
        for (int i=0; i< estados.length; i++){

            if(datos[5].toUpperCase().equals(estados[i])){
                indice = i;
                System.out.println("CLAVE : "+claves[i]);
                break; //romper manualmente el ciclo
            }
        }
        //Ultimos 3 caracteres de la cadena original
        System.out.println(datos[6]);
        curp = datos[1].substring(0,2)+
                datos[2].substring(0,1)+
                datos[0].substring(0,1)+
                datos[3].substring(8,10)+
                datos[3].substring(3,5)+
                datos[3].substring(0,2)+
                datos[4] + claves[indice]+
                datos[6];
        System.out.println(">>>>>>>>>>>:"+curp);

        return curp;
    }

}