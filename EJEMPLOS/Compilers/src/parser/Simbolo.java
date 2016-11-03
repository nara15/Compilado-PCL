/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

public class Simbolo {
	
	String simbolo;
	String token;
	private int columna;
	private int linea;
	
	public Simbolo(String simbolo, String token, int linea, int columna) {
		this.simbolo = simbolo;
		this.token = token;
		this.linea = linea;
		this.columna = columna;
	}
	
	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getLinea() {
		return linea;
	}

	public void setLinea(int linea) {
		this.linea = linea;
	}
	
	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public String toString() {
		String msg = "\n===========================~TOKEN~===================================\n";
		if (!simbolo.equals(""))
			msg += "Simbolo:\t" + simbolo + "\n";
		msg += "Token:\t\t" + token + "\n";
		msg += "Linea:\t\t" + linea + "\n";
		msg += "Columna:\t\t" + columna + "\n";
		return msg;
	}
}