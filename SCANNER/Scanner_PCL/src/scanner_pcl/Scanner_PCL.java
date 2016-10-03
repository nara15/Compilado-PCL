
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
    private final ArrayList<Symbol> _errors;
    private final Map<Object, ArrayList<Integer>> _tokens_lines;
    private final Map<Object, Integer> _tokens_type;
    private Scanner _scanner;

    public Scanner_PCL()
    {
        _tokens = new ArrayList<>();
        _errors = new ArrayList<>();
        _tokens_lines = new HashMap<>(); 
        _tokens_type = new HashMap<>();
    }

    public ArrayList<Symbol> getTokens()
    {
        return _tokens;
    }

    public ArrayList<Symbol> getErrors()
    {
        return _errors;
    }

    public Map<Object, ArrayList<Integer>> getTokens_lines()
    {
        return _tokens_lines;
    }

    public Map<Object, Integer> getTokens_type()
    {
        return _tokens_type;
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
          
                if (symbol.sym == symbols.sym.ERROR_LEXICO)
                {
                    _errors.add(symbol);
                }
                else
                {
                     _tokens.add(symbol);
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
    
    public void countTokens()
    {
        _tokens.stream().forEach((Symbol token) -> {
            
            String newTokenValue = (String) token.value;
            
            if (_tokens_lines.containsKey(newTokenValue))
            {
                _tokens_lines.get(newTokenValue).add(token.left + 1);
            }
            else
            {
                ArrayList<Integer> newLine = new ArrayList<>();
                newLine.add(token.left + 1);
                _tokens_lines.put(newTokenValue, newLine); 
                _tokens_type.put(newTokenValue, token.sym);
            }
        });
       
    }
     
}
