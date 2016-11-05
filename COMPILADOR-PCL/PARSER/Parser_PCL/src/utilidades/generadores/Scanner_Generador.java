/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades.generadores;

import java.io.File;
import java.nio.file.Paths;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Scanner_Generador implements IGenerador
{

    /**
     * Este método genera la clase Scanner del compilador PCL. Se especifica la
     * ruta del archivo con la especificación del escáner.
     * @param pPath Ruta al archivo .flex con la especificación del Scanner
     * del compilador PCL. El path es la ruta relativa dentro del proyecto; por
     * ejemplo "/src/scanner/"
     * @param pNombreArchivo Nombre del archivo. Por ejemplo "rules.flex";
     */
    @Override
    public void generar(String pPath, String pNombreArchivo) 
    {
        String rootPath = Paths.get("").toAbsolutePath().toString();
        
        File claseGenerada = new File(rootPath + pPath);
        
        String file = rootPath + pPath + pNombreArchivo;
        
        File sourceCode = new File(file);
        
        System.out.println("Ruta del archivo de la especificación: " + sourceCode);
        System.out.println("Ruta de la clase generada: " + claseGenerada);
        
        jflex.Main.generate(sourceCode);
    }
    
}
