
package main;

import utilidades.generadores.IGenerador;
import utilidades.generadores.Parser_Generador;
import utilidades.generadores.Scanner_Generador;

/**
 *
 * @author José Mario Naranjo Leiva
 */
public class Generacion
{

    public static void main(String[] args)
    {
        IGenerador gen;
        
        gen = new Scanner_Generador();
        
        gen.generar("/src/logica/scanner/", "pcl_rules.flex");
        
        gen = new Parser_Generador();
        
        gen.generar("/src/logica/parser/", "pcl.cup");
    }
    
}
