
package logica.semantico.registros;

/**
 *
 * @author Jose Mario
 */
public class Simbolo_Parametro extends Simbolo
{
    private String _funcion;
    private String _tipo;
    private int _posParametro;
    

    public Simbolo_Parametro(int id, int l, int r, Object o)
    {
        super(id, l, r, o);
    }

    public String getFuncion()
    {
        return _funcion;
    }

    public void setFuncion(String _funcion) 
    {
        this._funcion = _funcion;
    }

    public String getTipo()
    {
        return _tipo;
    }

    public void setTipo(String _tipo) 
    {
        this._tipo = _tipo;
    }

    public int getPosParametro() 
    {
        return _posParametro;
    }

    public void setPosParametro(int _posParametro) 
    {
        this._posParametro = _posParametro;
    }
    
    

    @Override
    public String toString() 
    {
        return "{ rol = " + this.getRol(sym) + ", nombre = " + this.getNombre() + ", _funcion = "
                + _funcion + ", _tipo = " + _tipo + '}';
    }
    
    
    
}
