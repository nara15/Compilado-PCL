package analizadorlex;
import java.util.ArrayList;
/**
 * @author yulianup
 *
Instituto Tecnológico de Costa Rica
Escuela de Computación
Curso: 		Compiladores e Intérpretes.
Proyecto: 	Scanner.
Profesora:	Ing. Erika Marin Schumann.
Estudiante:	Yulian Gerardo Ulloa Porras

II Semestre, 2016
 */
public class ListadoToken {
    private ArrayList<Fila> tabla;

    public ListadoToken() {
        tabla = new ArrayList<>();
    }
    public ArrayList<Fila> getTabla(){
        return tabla;
    }
    
    public void agregarToken(String pToken, String pTipo,int pLinea){
        int i = buscarToken(pToken);
        if (i<0){
            Fila nuevaFila =new Fila(pToken,pTipo,pLinea);
            tabla.add(nuevaFila);
        }else{
            Fila modFila = tabla.get(i);
            modFila.aumentarOcurrencias(pLinea);
            tabla.set(i, modFila);
        }
    }
    private int buscarToken(String pToken){
        int indice=-1;
        for(int i = 0; i<tabla.size();i++){
            if (pToken.equalsIgnoreCase(tabla.get(i).getToken())){
                indice =i;
            }
        }
        return indice;
    }
    
    @Override
    public String toString(){
        String salida = "";
        salida += "|\tToken";
        salida += "\t|\tTipo de Token";
        salida += "\t\t|\t#Linea (ocurrencias en linea) \n";
        int cantidad = tabla.size();
        for (int i=0;i<cantidad;i++){
            salida += tabla.get(i).toString()+"\n";
        }
        return salida;
    }
    
    
}

