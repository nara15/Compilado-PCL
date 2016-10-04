
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
        
        String file = rootPath + "/src/scanner_pcl/test1.pcl";
        
        Scanner_PCL s = new Scanner_PCL();
        
        s.processFile(file);
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
             
             if (types.get(entry.getKey()) == symbols.sym.ID)
             {
                String type = symbols.sym.getValue(types.get(entry.getKey()));
                String st = (String) entry.getKey();
                st = st.toLowerCase();
                res += type + "_____" + st + "_____" + lines + "\n";
             }
             else
             {
                res += symbols.sym.getValue(types.get(entry.getKey())) + "_____" + entry.getKey() + "_____" + lines + "\n";
             }
            
             
             
             lines = "";
        }
        System.out.println(s.getErrors());
        System.out.println(res);
        
    }
    
}
