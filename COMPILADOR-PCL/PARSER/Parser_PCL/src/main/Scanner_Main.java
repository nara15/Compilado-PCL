
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java_cup.runtime.Symbol;
import logica.scanner.Scanner;






/**
 *
 * @author jonaranjo
 */
public class Scanner_Main {

    private static final String pPath = "G:\\git\\Compilador-PCL\\COMPILADOR-PCL\\PARSER\\Parser_PCL\\src\\main\\test2.p";
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
            Scanner scanner = new Scanner(br);

            for (symbol = scanner.next_token(); symbol.sym != 0; symbol = scanner.next_token())
            {
                  
                System.out.println(symbol.value + " " + symbol.sym);


            }

        } catch (FileNotFoundException ex) 
        {



        } catch (IOException ex) 
        {



        }    
    }
    
}
