
package scanner_pcl;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Scann 
{

    public static void main(String[] args) 
    {
        //PRUEBAS DE CONCEPTO
        
        //int[] enteros = new int[2];
   /*     
        ArrayList<String> animals = new ArrayList<>();
        
        animals.add("perro");
        animals.add("vaca");
        animals.add("perro");
        animals.add("caballo");
        animals.add("vaca");
        
        Map<String,Long> counts =
                animals.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));
        
        counts.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        
        
       HashMap<String, ArrayList<Integer>> tokens = new HashMap<>(); 
           
           */
        
        String rootPath = Paths.get("").toAbsolutePath().toString();
        
        String file = rootPath + "/src/scanner_pcl/test1.txt";
        
        Scanner_PCL s = new Scanner_PCL();
        
        s.processFile(file);
        s.countTokens();
        
        String linecount = "";
        String token = "";
        
       
     /*   
        s.getTokens_lines().entrySet().stream().forEach((entry)->{
            
            Map<Integer,Long>counts = entry.getValue().stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));
  
        });
             */
        
       
    
        
   
        
       
       
        
    }
    
}
