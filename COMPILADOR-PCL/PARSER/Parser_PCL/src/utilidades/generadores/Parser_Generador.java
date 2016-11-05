
package utilidades.generadores;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Parser_Generador implements IGenerador
{

    /**
     * Este método genera la clase Parser del compilador PCL. Se especifica la
     * ruta del archivo con la especificación del parser.
     * @param pPath Ruta al archivo .cup con la especificación del Scanner
     * del compilador PCL. El path es la ruta relativa dentro del proyecto; por
     * ejemplo "/src/parser/parser_spec.cup".
     */
    @Override
    public void generar(String pPath, String pArchivoNombre) 
    {
        String rootPath = Paths.get("").toAbsolutePath().toString();

        String cupFilePath = rootPath + pPath;

        String [] cupArgs = new String[5];
        cupArgs[0] = "-destdir"; cupArgs[1] = cupFilePath;  // Para guardar los archivos en el paquete correspondiente
        cupArgs[2] = "-parser";  cupArgs[3] = "Parser";                         // El nombre del parser
        cupArgs[4] = cupFilePath + pArchivoNombre;  
        
        System.out.println("Ruta de la especificación: " + cupArgs[4]);
        System.out.println("Creado en: " + cupFilePath);
        
        try 
        {
            java_cup.Main.main(cupArgs);
            
           
            
        } 
        catch (IOException ex) 
        {
            System.err.println("Se se pudo hallar el archivo .cup");
            
        } catch (Exception ex) 
        {
            Logger.getLogger(Parser_Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
