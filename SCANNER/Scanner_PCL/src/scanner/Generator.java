
package scanner;

import java.io.File;
import java.nio.file.Paths;

/**
 *
 * @author Josè Mario Naranjo Leiva
 */
public class Generator
{
    public static void main(String[] args)
    {
        String rootPath = Paths.get("").toAbsolutePath().toString();
        
        String file = rootPath + "/src/scanner/pcl_rules.flex";
        
        File sourceCode = new File(file);
        
        jflex.Main.generate(sourceCode);
    }
    
}
