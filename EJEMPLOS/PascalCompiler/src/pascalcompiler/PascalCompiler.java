/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascalcompiler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import scanner.PascalLexer;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class PascalCompiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Symbol sym;
        
        try 
        {
            PascalLexer lexer = new PascalLexer(new FileReader("F:\\git\\Compilador-PCL\\EJEMPLOS\\PascalCompiler\\src\\pascalcompiler\\test2.p"));
            
            for (sym = lexer.next_token(); sym.sym != 0;
                    sym = lexer.next_token()) {

                System.out.println("Token " + sym +
                    ", with value = " + sym.value + 
                    " -- at line " + sym.left + ", column " + sym.right);

            }
            
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(PascalCompiler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(PascalCompiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
