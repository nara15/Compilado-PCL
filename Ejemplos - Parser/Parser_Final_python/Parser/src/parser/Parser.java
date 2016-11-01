/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import java.io.File;
import java.io.IOException;
import java_cup.internal_error;
import logica.Scanner;

/**
 *
 * @author Crisia
 */
public class Parser {

    private final static String path = "C:\\Users\\Crisia\\Documents\\NetBeansProjects\\Parser\\Parser\\src\\logica\\";
    private final static String lexerFile = "Lexer.flex";
    private final static String parserFile = "Parser.cup";
        // TODO code application logic here
    	
    public static void main(String[] args) throws internal_error, IOException, Exception {
        File file = new File(path + lexerFile);
        System.out.println (path + lexerFile);
        jflex.Main.generate(file);
        String cupFilePath = path + parserFile;
       String [] cupArgs = new String[5];
        cupArgs[0] = "-destdir"; cupArgs[1] = path;         // Para guardar los archivos en el paquete correspondiente
       cupArgs[2] = "-parser";  cupArgs[3] = "Parser";     // El nombre del parser
//        //cupArgs[4] = "-nowarn";                             // Quitar los warnings
        cupArgs[4] = cupFilePath;                           // El path del .cup
        java_cup.Main.main(cupArgs);
        
    }}
