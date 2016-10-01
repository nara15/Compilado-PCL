
package scanner_pcl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import scanner.Scanner;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Scanner_PCL {

    public static void main(String[] args) 
    {
        String rootPath = Paths.get("").toAbsolutePath().toString();
        
        String file = rootPath + "/src/scanner_pcl/test.txt";
        
        Symbol sym;
        
        try 
        {
          
            Scanner lexer = new Scanner(new FileReader(file));
            
            for (sym = lexer.next_token(); sym.sym != 0; sym = lexer.next_token())
            {
                System.out.println(sym.value + " línea:" + (sym.left + 1) + " | Tipo: " + (sym.sym));
            }
            
        } catch (FileNotFoundException ex)
        {
            
            Logger.getLogger(Scanner_PCL.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) 
        {
            Logger.getLogger(Scanner_PCL.class.getName()).log(Level.SEVERE, null, ex);
        }
  

    }
    
}
