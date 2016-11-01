/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Fila { 
    private String token;
    private String tipoToken;
    private ArrayList<Integer> lineas;
    private ArrayList<Integer> ocurrencias;
    
    public Fila(String pToken, String pTipo,int pLinea){
        token = pToken;
        tipoToken = pTipo;
        lineas = new ArrayList<>();
        lineas.add(pLinea);
        ocurrencias = new ArrayList<>();
        ocurrencias.add(1);
    }
    
    public void aumentarOcurrencias(int pLinea) {
        int i =buscarLinea(pLinea);
        if (0<=i){
            int cantidad=ocurrencias.get(i);
            ocurrencias.set(i, cantidad+1);
        }
        else{
            lineas.add(pLinea);
            ocurrencias.add(1);
        }
    }
    private int buscarLinea(int pLinea){
        int indice=-1;
        for(int i = 0; i<lineas.size();i++){
            if (lineas.get(i) == pLinea){
                indice =i;
            }
        }
        return indice;
    }
    

    public String getToken() {
        return token;
    }

    public String getTipoToken() {
        return tipoToken;
    }

    public ArrayList<Integer> getLineas() {
        return lineas;
    }

    public ArrayList<Integer> getApariciones() {
        return ocurrencias;
    } 
    
    @Override
    public String toString(){
        String salida ="";
        salida+="|\t"+ token;
        salida+="\t|\t"+ tipoToken;
        if (tipoToken.length()<=14){
            salida+="\t\t|\t";
        }else{
            if (tipoToken.length()<=18){
                salida+="\t|\t";
            }else{
                salida+="|\t";
            }
        }
        for(int i = 0; i<lineas.size();i++){
            salida += String.valueOf(lineas.get(i)); 
            salida += "("+String.valueOf(ocurrencias.get(i))+"), ";
        }
        int largo =salida.length();
        salida = salida.substring(0,largo-2);
        return salida;
    }
}
