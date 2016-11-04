/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import parser.Parser;
import scanner.Lexer;



/**
 *
 * @author jonaranjo
 */
public class Parser_Main {
    
     private static final String pPath = "C:\\Users\\Jose Mario\\Documents\\GitHub\\Compilador-PCL\\EJEMPLOS\\Compilers\\src\\compilers\\test.p";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BufferedReader br;
         try
         {
             br = new BufferedReader(new FileReader(pPath));
             Lexer scanner = new Lexer(br);
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
