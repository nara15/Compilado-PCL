
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
    
    protected String getRol(int rol)
    {
        switch(rol)
        {
            case roles.VARIABLE: 
                return "Variable"; 
            case roles.CONSTANTE:
                return "Constante";
            case roles.LITERAL:
                return "Literal";  
            case roles.PARAMETRO:
                return "Parámetro";
            case roles.FUNCION:
                return "Función";
            default:
                return "";
        }
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
