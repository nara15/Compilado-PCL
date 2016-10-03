
package view;

import scanner_pcl.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java_cup.runtime.Symbol;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class ScannControlador 
{
    
    private static final Scanner_PCL s = new Scanner_PCL();
    
    private ArrayList<Symbol> _errors;
    
    public String analizarErrores()
    {
        String res = "";
        
        _errors = s.getErrors();
        
        for (Symbol sym : _errors)
        {
            res += sym.value + " Número de línea: " + (sym.left + 1) + " Número de columna: " + (sym.right + 1) + "\n";
        }
        
        return res;
    }
    
    public String analizar(String pPath)
    {
        s.processFile(pPath);
        s.countTokens();
        
         
        Map<Object, ArrayList<Integer>> tokens = s.getTokens_lines();
        Map<Object, Integer> types = s.getTokens_type();
       
        Iterator<Entry<Object,ArrayList<Integer>>> i = tokens.entrySet().iterator();
        String lines = "";
        String res = "";
        while(i.hasNext())
        {
            
            Map.Entry<Object, ArrayList<Integer>> entry = i.next();
      
             Map<Integer,Long> counts =
                entry.getValue().stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));
             
             for(Map.Entry<Integer, Long> entry_count : counts.entrySet())
             {
                
                lines += entry_count.getKey() + "(" + entry_count.getValue() + ") " ;
             
             }
             res += symbols.sym.getValue(types.get(entry.getKey())) + " _____ " + entry.getKey() + " _____ " + lines + "\n";
             
             
             lines = "";
        }
        
        return res;
    }
}
