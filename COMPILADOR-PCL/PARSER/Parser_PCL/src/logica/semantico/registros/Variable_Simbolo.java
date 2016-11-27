
package logica.semantico.registros;

/**
 *
 * @author Jose Mario
 */
public class Variable_Simbolo extends Simbolo
{
    private boolean _esGlobal;
    private String _funcionPadre;
    private String _tipo;
    
    public Variable_Simbolo(int id, int l, int r, Object o) 
    {
        super(id, l, r, o);
    }

    public boolean esGlobal() 
    {
        return _esGlobal;
    }

    public void setEsGlobal(boolean _esGlobal) 
    {
        this._esGlobal = _esGlobal;
    }

    public String getFuncionPadre() 
    {
        return _funcionPadre;
    }

    public void setFuncionPadre(String _funcionPadre) 
    {
        this._funcionPadre = _funcionPadre;
    }

    public String getTipo()
    {
        return _tipo;
    }

    public void setTipo(String _tipo)
    {
        this._tipo = _tipo;
    }
    
}
