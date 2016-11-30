
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
    private Object _valor;
    
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

    public Object getValor() 
    {
        return _valor;
    }

    public void setValor(Object _valor) 
    {
        this._valor = _valor;
    }

    @Override
    public String toString() 
    {
        String  res = "";
        
        if (this.esGlobal())
        {
            res = "Global";
        }
        else
        {
            res = "Local";
        }
        return "{" + " rol = "+ this.getRol(sym) + ", _nombre = " + this.value + ", _tipo = " + _tipo + ", _valor = " + _valor + 
                ", funcionPadre = " + this.getFuncionPadre() + " , ámbito = " + res + '}';
    }
    
    
    
}
