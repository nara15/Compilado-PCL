/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
