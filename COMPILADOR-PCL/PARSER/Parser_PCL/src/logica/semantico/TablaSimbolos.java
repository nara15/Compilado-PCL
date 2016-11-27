
package logica.semantico;

import logica.semantico.registros.Simbolo;
import java.util.HashMap;

/**
 *
 * @author Jose Mario
 */
public class TablaSimbolos
{
    private final HashMap<String,Simbolo> _tablaSimbolos;
    
    public TablaSimbolos()
    {
        this._tablaSimbolos = new HashMap<>();   
    }
    
    public boolean insertarSimbolo(String pNombreKey, Simbolo s)
    {
        if (this._tablaSimbolos.get(pNombreKey) == null)
        {
            this._tablaSimbolos.put(pNombreKey, s);
            return true;
        }
        else
        {
            return false;
        }
    }
}
