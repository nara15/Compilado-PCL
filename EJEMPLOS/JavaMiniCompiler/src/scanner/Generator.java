
package scanner;

import java.io.File;
import java.nio.file.Paths;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Generator
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String rootPath = Paths.get("").toAbsolutePath().toString();
        
        String file = rootPath + "/src/scanner/rules.flex";
        
        File sourceCode = new File(file);
        
        jflex.Main.generate(sourceCode);
    }
    
}
