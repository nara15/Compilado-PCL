
package logica.semantico;

import logica.semantico.registros.Simbolo;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

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
    
    public Simbolo buscar(String nombre)
    {
        return this._tablaSimbolos.get(nombre);
    }
    
    @Override
    public String toString() 
    {
        String res = "";
        
        Set<Entry<String,Simbolo>> entries = this._tablaSimbolos.entrySet();
        
        for (Entry e : entries)
        {
            res += e.getValue().toString() + "\n";
        }
        
        return res;
    }
    
    
}
