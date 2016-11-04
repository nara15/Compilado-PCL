
package scanner_pcl;

import java.io.BufferedReader;
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
 * @author curso
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String rootPath = Paths.get("").toAbsolutePath().toString();
        
        String file = rootPath + "/src/scanner_pcl/test.pcl";
        
        Scanner s;
       
        Symbol symbol;
        
        BufferedReader br;
        
        try 
        {
            br = new BufferedReader(new FileReader(file));
            s = new Scanner(br);
            
            for (symbol = s.next_token(); symbol.sym != 0; symbol = s.next_token())
            {
               
                if (symbol.sym == symbols.sym.ERROR_LEXICO)
                {
                    System.out.println(symbol.value + " " + (symbol.left + 1));
                }
                else
                {
                    //System.out.println(symbol.value + " ---------------- " + symbol.sym);
//                    if (symbol.sym == symbols.sym.COMMENT)
//                    {
//                        System.out.println(symbol.value + " ---------------- " + symbol.sym);
//                    }
                     
                }

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
