
package logica.semantico;

import logica.semantico.registros.Variable_Simbolo;
import logica.semantico.registros.Simbolo;
import logica.semantico.registros.roles;

/**
 *
 * @author Jose Mario
 */
public class Test
{
    
    public static void main(String[] args)
    {
        PilaSemantica<Simbolo> pila = new PilaSemantica();
        
        Variable_Simbolo s = new Variable_Simbolo(1,1,1,"Hola");
        
        
        System.out.println(roles.VARIABLE);
    }
    
}
