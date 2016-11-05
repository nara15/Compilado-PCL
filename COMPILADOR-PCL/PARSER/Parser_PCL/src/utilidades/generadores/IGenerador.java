
package utilidades.generadores;

/**
 *
 * @author jonaranjo
 */
public interface IGenerador
{
    /**
     * Este método genera alguna clase del compilador PCL. Se especifica la
     * ruta del archivo con la especificación de la clase por ser generada.
     * @param pPath Ruta al archivo .cup con la especificación del Scanner
     * del compilador PCL. El path es la ruta relativa dentro del proyecto; por
     * ejemplo "/src/parser/".
     * @param pArchivoNombre Nombre del archivo. Por ejemplo "parser_spec.cup"
     */
    public void generar(String pPath, String pArchivoNombre);
}
