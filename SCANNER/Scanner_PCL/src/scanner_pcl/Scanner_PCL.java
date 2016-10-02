
package scanner_pcl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import scanner.Scanner;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Scanner_PCL 
{
    
    private final ArrayList<Symbol> _tokens;
    private final Map<Object, ArrayList<Integer>> _tokens_lines;
    private Scanner _scanner;

    public Scanner_PCL()
    {
        _tokens = new ArrayList<>();
        _tokens_lines = new HashMap<>(); 
    }

    public ArrayList<Symbol> getTokens()
    {
        return _tokens;
    }

    public Map<Object, ArrayList<Integer>> getTokens_lines()
    {
        return _tokens_lines;
    }
    
    
     
    /**
     * This methos process the source file and stores every token found to a list for preview use
     * @param pPath: Path to PCL file to process
     */
    public void processFile(String pPath)
    {
  
        Symbol symbol;
        
        BufferedReader br;
        
        try 
        {
            br = new BufferedReader(new FileReader(pPath));
            _scanner = new Scanner(br);
            
            for (symbol = _scanner.next_token(); symbol.sym != 0; symbol = _scanner.next_token())
            {
                _tokens.add(symbol);
            }
            
        } catch (FileNotFoundException ex) 
        {
            
            Logger.getLogger(Scanner_PCL.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) 
        {
            
            Logger.getLogger(Scanner_PCL.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public void countTokens()
    {
        _tokens.stream().forEach((Symbol token) -> {
            
            System.out.println(token.value + " línea:" + (token.left + 1) + " | Tipo: " + (token.sym));
            
            if (_tokens_lines.containsKey(token.sym))
            {
                _tokens_lines.get(token.sym).add(token.left + 1);
            }
            else
            {
                ArrayList<Integer> newLine = new ArrayList<>();
                newLine.add(token.left + 1);
                _tokens_lines.put(token.sym, newLine);
            }
        });
        System.out.println(_tokens_lines.size());
    }
     
}
