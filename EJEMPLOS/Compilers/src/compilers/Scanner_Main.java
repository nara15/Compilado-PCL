
package compilers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java_cup.runtime.Symbol;
import scanner.Lexer;





/**
 *
 * @author jonaranjo
 */
public class Scanner_Main {

    private static final String pPath = "M:\\Github\\Compilador-PCL\\EJEMPLOS\\Compilers\\src\\compilers\\test.p";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Symbol symbol;

        BufferedReader br;

        try 
        {
            br = new BufferedReader(new FileReader(pPath));
            Lexer scanner = new Lexer(br);
            
           
            
             

            for (symbol = scanner.next_token(); symbol.sym != 0; symbol = scanner.next_token())
            {
                  
                System.out.println(symbol.value);


            }

        } catch (FileNotFoundException ex) 
        {



        } catch (IOException ex) 
        {



        }    
    }
    
}
