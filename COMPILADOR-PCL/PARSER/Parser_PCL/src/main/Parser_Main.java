/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.parser.Parser;
import logica.scanner.Scanner;


/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Parser_Main
{
    
    private static final String pFileName = "PruebaEstControl.pas";
    
    private static final String pPath = Paths.get("").toAbsolutePath().toString() 
            + "\\src\\main\\archivos_prueba\\" + pFileName;
    
    public static void main(String[] args) 
    {
        BufferedReader br;
         try
         {
             br = new BufferedReader(new FileReader(pPath));
             Scanner scanner = new Scanner(br);
             Parser p = new Parser(scanner);
             
             Object result = p.parse().value; 
             
             
         } 
         catch (FileNotFoundException ex)
         {
             Logger.getLogger(Parser_Main.class.getName()).log(Level.SEVERE, null, ex);
         } catch (Exception ex) {
             Logger.getLogger(Parser_Main.class.getName()).log(Level.SEVERE, null, ex);
         } 
        
    }
    
}
