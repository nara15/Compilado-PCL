
package logica.semantico.registros;

/**
 * Registro semántico genérico.
 * Uso principal: Manejo de tipos
 * @author Jose Mario
 */
public class Generico_Simbolo extends Simbolo
{

    public Generico_Simbolo(int id, int l, int r, Object o)
    {
        super(id, l, r, o);
    }

    @Override
    public String toString()
    {
        return "{" + this.getNombre() + " " + this.value + '}';
    }
    
}
