
package example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Test
{


    public static void main(String[] args)
    {
        String rootPath = Paths.get("").toAbsolutePath().toString();
        
        String file = rootPath + "/src/example/test.txt";
        
        Symbol sym;
       
        try 
        {
            
            Lexer lexer = new Lexer(new FileReader(file));
            
            for (sym = lexer.next_token(); sym.sym != 0; sym = lexer.next_token())
            {
                System.out.println(sym.value + " " + (sym.left + 1));
            }
            
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) 
        {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
