package analizadorlex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
/**
 * @author yulianup
 *
Instituto Tecnológico de Costa Rica
Escuela de Computación
Curso: 		Compiladores e Intérpretes.
Proyecto: 	Scanner.
Profesora:	Ing. Erika Marin Schumann.
Estudiante:	Yulian Gerardo Ulloa Porras

II Semestre, 2016
 */
public class Main {

    /**
     * Muestra un menu para elegir la opcion
     * mas conveniente
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion;
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Instituto Tecnológico de Costa Rica");
        System.out.println("Escuela de Computación");
        System.out.println("Curso:\t\tCompiladores e Intérpretes.");
        System.out.println("Proyecto:\tScanner.");
        System.out.println("Profesora:\tIng. Erika Marin Schumann.");
        System.out.println("Estudiante:\tYulian Gerardo Ulloa Porras");
        System.out.println("II Semestre, 2016\n");

        boolean bandera=true;
        while(bandera){
            System.out.println("Seleccione una opción:");
            System.out.println("1) Ejecutar");
            System.out.println("2) Salir");
            System.out.print("Opcion: ");
            opcion = in.next();
            switch (opcion) {
                case "1": {
                    String entrada = "";
                    System.out.println("\n*** Ejecutando ***\n");
                    System.out.println("\tSeleccione una opción para entrada del archivo a analizar:");
                    System.out.println("\t1) entrada por argumento");
                    System.out.println("\t2) ingresar ubicación ");
                    System.out.println("\t-) ingrese cualquier otro valor para entrada por defecto: \"entrada.pcl\"");
                    System.out.print("\tOpcion: ");
                    ListadoToken listado = new ListadoToken();
                    String opcion2 = in.next();
                    switch (opcion2) {
                        case "1": {
                            if(args.length > 0){
                                System.out.println("\n*** Procesando archivo custom ***\n");
                                entrada = args[0];
                            }
                            break;
                        }
                        case "2": {
                            System.out.print("\tDireccion:");
                            entrada = in.next();
                            break;
                        }
                        default: {
                            System.out.println("\n*** Procesando archivo default ***\n");
                            entrada = "entrada.pcl";
                        }
                    }
                    BufferedReader bf = null;
                    try {
                        bf = new BufferedReader(new FileReader(entrada));
                        AnalizadorLexico a = new AnalizadorLexico(bf);
                        Yytoken token = null;
                        token = a.nextToken();
                        while (token != null){ 
                            listado.agregarToken(token.token,token.tipo,(token.linea+1));
                            token = a.nextToken();
                        }
                        System.out.println("Listado de Tokens encontrado");
                        String strListadoTokens = listado.toString();
                        System.out.println(strListadoTokens);
                        escribirArchivoSalida(strListadoTokens);
                        escribirArchivoSalidaHtml(listado);
                        bf.close();
                    } catch (Exception ex) {
                        //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("ERROR, el archivo no existe o no se analizar");
                    }
                    System.out.println("\n*** Ejecucion finalizada ***\n");
                    break;
                }
                case "2": {
                    System.out.println("Programa finalizado!\nVuelva pronto.");
                    bandera=false;
                    break;
                }
                default: {
                    System.out.println("\nOpcion no valida.\n");
                }
            }
        }
    }
    //writeOutputFile
    private static void escribirArchivoSalida(String pInfo) throws IOException{
        String filename = "listadoTokensEncontrados.out";
        try (BufferedWriter out = new BufferedWriter(new FileWriter(filename))) {
            System.out.println("\n*** Tokens guardados en archivo ***\n");
            out.write(pInfo);
        }
    }
    private static void generarCSS() throws IOException{
        String filename = "estiloTabla.css";
        String contenidoArchivo="";
        try (BufferedWriter out = new BufferedWriter(new FileWriter(filename))) {
            contenidoArchivo="h1 {font-size: 28px; font-family: 'Lucida Console', Monaco, monospace;}\n" +
            "table {\n" +
            "    font-family: 'Lucida Console', Monaco, monospace;\n" +
            "    border: 1px solid rgb(200,200,200);\n" +
            "    width: 100%;\n" +
            "    overflow-x:auto;\n" +
            "    border-collapse: collapse;\n" +
            "\n" +
            "}\n" +
            "th{font-family: sans-serif, Helvetica;}\n" +
            "td{font-family: 'Lucida Console', Monaco, monospace;}\n" +
            "td, th {\n" +
            "    border: 1px solid rgb(210,210,210);\n" +
            "    text-align: left;\n" +
            "    min-height: 60px;\n" +
            "    width: 30%;\n" +
            "    padding: 10px;\n" +
            "}\n" +
            "\n" +
            "tr:nth-child(even) {\n" +
            "    background-color: rgb(210,210,210);\n" +
            "}";
            out.write(contenidoArchivo);
        }
    }
    private static void escribirArchivoSalidaHtml(ListadoToken pListado) throws IOException{
        String filename = "listadoTokensEncontrados.html";
        String contenidoArchivo=
            "<!DOCTYPE html>\n" +
            "<html>\n" +
            "\t<head>\n" +
            "\t\t<title>Listado Tokens Encontrados</title>\n" +
            "\t\t<meta charset=\"UTF-8\">\n" +
            "\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"estiloTabla.css\">\n" +
            "\t</head>\n" +
            "\t<body>\n" +
            "\t\t<h1>Listado Tokens Encontrados</h1>\n" +
            "\t\t<table>\n" +
            "\t\t\t<tr>\n" +
            "\t\t\t\t<th>Token</th>\n" +
            "\t\t\t\t<th>Tipo de Token</th>\n" +
            "\t\t\t\t<th>#Linea (ocurrencias en linea) </th>\n" +
            "\t\t\t</tr>\n";
        try (BufferedWriter out = new BufferedWriter(new FileWriter(filename))) {
            ArrayList<Fila> tabla = pListado.getTabla();
            int numFilas = tabla.size();
            for (int i=0;i<numFilas; i++ ){
                contenidoArchivo+=
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td>" + tabla.get(i).getToken() + "</td>\n" +
                "\t\t\t\t<td>" + tabla.get(i).getTipoToken() + "</td>\n" +
                "\t\t\t\t<td>";
                int numLineas = tabla.get(i).getLineas().size();
                String lineas="";
                for (int j=0;j<numLineas; j++ ){
                    lineas += String.valueOf(tabla.get(i).getLineas().get(j));
                    lineas += "("+String.valueOf(tabla.get(i).getApariciones().get(j))+"), ";
                }
                contenidoArchivo += lineas.substring(0,lineas.length()-2) + "</td>\n" +
                "\t\t\t</tr>\n";
            }
            contenidoArchivo+=
            "\t\t</table>\n" +
            "\t</body>\n" +
            "</html>";
            out.write(contenidoArchivo);
            System.out.println("\n*** Tokens guardados en archivo html ***\n");
        }
        generarCSS();
    }
}
