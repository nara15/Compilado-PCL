
package logica.semantico;

import java.util.Stack;

/**
 *
 * @author Jose Mario
 * @param <Simbolo>
 */
public class PilaSemantica<Simbolo> extends Stack<Simbolo>
{
    public PilaSemantica() 
    {
      
    }
    
    public int buscar(Class<?> tipo)
    {
        for(int i = this.size() - 1; i >= 0; i--)
        {
            if (this.get(i).getClass() == tipo)
            {
               return i;
            }  
        }
        return -1;   
    }
  
}
