/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlex;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author yulianup
 */
public class GenerarAnalizadorLexico {
    public static void main(String[] args) {
        System.out.println("\n*** Generando ***\n");
        String archLex = "";
        if(args.length > 0){
            System.out.println("\n*** Procesando archivo custom ***\n");
            archLex = args[0];
        }else{
            System.out.println("\n*** Procesando archivo default ***\n");
            archLex = "alexico.flex";
        }
        String[] entrada = {archLex};
        jflex.Main.main(entrada);
        //Movemos el archivo generado al directorio src
        File arch = new File("AnalizadorLexico.java");
        if(arch.exists()){
            System.out.println("" + arch);
            Path currentRelativePath = Paths.get("");
            String nuevoDir = currentRelativePath.toAbsolutePath().toString()
                    + File.separator + "src" + File.separator 
                    + "analizadorlex" + File.separator+arch.getName();
            File archViejo = new File(nuevoDir);
            archViejo.delete();
            if(arch.renameTo(new File(nuevoDir))){
                System.out.println("\n*** Generado ***\n");
                System.out.println("\n*** Saliendo automaticamente ***\n");
                System.exit(0);
            }else{
                System.out.println("\n*** No generado ***\n");
            }
        }else{
            System.out.println("\n*** Codigo no existente ***\n");
        }
    }
}
