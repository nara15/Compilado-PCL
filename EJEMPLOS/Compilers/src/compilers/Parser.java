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
import parser.parser;
import scanner.Lexer;

/**
 *
 * @author jonaranjo
 */
public class Parser {
    
     private static final String pPath = "M:\\Github\\Compilador-PCL\\EJEMPLOS\\Compilers\\src\\compilers\\test.p";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BufferedReader br = null;
         try
         {
             br = new BufferedReader(new FileReader(pPath));
             Lexer scanner = new Lexer(br);
             parser p = new parser(scanner);
             
             Object result = p.parse().value; 
             
             
         } 
         catch (FileNotFoundException ex)
         {
             Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
         } catch (Exception ex) {
             Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
         } 
        
    }
    
}
