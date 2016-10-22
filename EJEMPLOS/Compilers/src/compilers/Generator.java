
package compilers;

import java.io.File;
import java.nio.file.Paths;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Generator
{
    public static void main(String[] args)
    {
        String rootPath = Paths.get("").toAbsolutePath().toString();
        
        String file = rootPath + "/src/scanner/rules.flex";
        
        File sourceCode = new File(file);
        
        jflex.Main.generate(sourceCode);
        
    }
    
}
