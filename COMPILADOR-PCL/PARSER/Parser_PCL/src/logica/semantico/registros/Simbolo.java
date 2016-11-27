
package logica.semantico.registros;

import java_cup.runtime.Symbol;

/**
 *
 * @author Jose Mario
 */
public abstract class Simbolo extends Symbol
{
    protected String _nombre;
    
    public Simbolo(int id, int l, int r, Object o)
    {
        super(id, l, r, o);
    }

    public String getNombre() 
    {
        return _nombre;
    }

    public void setNombre(String _nombre)
    {
        this._nombre = _nombre;
    }
    
    

}
