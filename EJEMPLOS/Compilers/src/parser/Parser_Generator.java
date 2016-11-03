
package parser;

import java.io.IOException;
import java.nio.file.Paths;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Parser_Generator {

 
    public static void main(String[] args) throws IOException, Exception
    {
        String rootPath = Paths.get("").toAbsolutePath().toString();

        String cupFilePath = rootPath + "/src/parser/parser_spec.cup";

        String [] cupArgs = new String[5];
        cupArgs[0] = "-destdir"; cupArgs[1] = rootPath + "/src/parser";    // Para guardar los archivos en el paquete correspondiente
        cupArgs[2] = "-parser";  cupArgs[3] = "Parser";                             // El nombre del parser
        cupArgs[4] = cupFilePath;   
        
        java_cup.Main.main(cupArgs);
        
         System.out.println("Creado en: " + rootPath + "/src/parser");
    }
    
}
