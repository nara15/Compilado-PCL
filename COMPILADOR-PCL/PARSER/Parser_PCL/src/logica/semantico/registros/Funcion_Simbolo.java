
package logica.semantico.registros;

/**
 *
 * @author Jose Mario Naranjo Leiva
 */
public class Funcion_Simbolo extends Simbolo
{
    
    private String _valorRetorno;
    private int _cant_Parametros;
    
    public Funcion_Simbolo(int id, int l, int r, Object o)
    {
        super(id, l, r, o);
    }

    public String getValorRetorno()
    {
        return _valorRetorno;
    }

    public void setValorRetorno(String _valorRetorno) 
    {
        this._valorRetorno = _valorRetorno;
    }

    public int getCant_Parametros()
    {
        return _cant_Parametros;
    }

    public void setCant_Parametros(int _cant_Parametros) 
    {
        this._cant_Parametros = _cant_Parametros;
    }

    @Override
    public String toString()
    {
        return "{" + " rol = " + this.getRol(sym) + ", _nombre = " + this.getNombre() + ", _valorRetorno = " + _valorRetorno + 
                ", _cant_Parametros = " + _cant_Parametros + '}';
    }
    
    
  
}
