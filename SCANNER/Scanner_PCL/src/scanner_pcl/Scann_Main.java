
package scanner_pcl;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Scann_Main 
{

    public static void main(String[] args) 
    {
        String rootPath = Paths.get("").toAbsolutePath().toString();
        
        String file = rootPath + "/src/scanner_pcl/test.txt";
        
        Scanner_PCL s = new Scanner_PCL();
        
        s.processFile(file);
        s.countTokens();
        
         
        Map<Object, ArrayList<Integer>> tokens = s.getTokens_lines();
        Map<Object, Integer> types = s.getTokens_type();
       
        
        
        
        Iterator<Entry<Object,ArrayList<Integer>>> i = tokens.entrySet().iterator();
        String lines = "";
        
        while(i.hasNext())
        {
            
            Map.Entry<Object, ArrayList<Integer>> entry = i.next();
      
             Map<Integer,Long> counts =
                entry.getValue().stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));
             
             for(Map.Entry<Integer, Long> entry_count : counts.entrySet())
             {
                
                lines += entry_count.getKey() + "(" + entry_count.getValue() + ") " ;
             
             }
             System.out.println(symbols.sym.getValue(types.get(entry.getKey())) + ": " + entry.getKey() + ": " + lines);
             lines = "";
        }
        System.out.println(s.getErrors());
    }
    
}
