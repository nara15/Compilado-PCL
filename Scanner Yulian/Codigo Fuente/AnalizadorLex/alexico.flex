/**
Instituto Tecnológico de Costa Rica
Escuela de Computación
Curso: 		Compiladores e Intérpretes.
Proyecto: 	Scanner - "archivo.flex".
Profesora:	Ing. Erika Marin Schumann.
Estudiante:	Yulian Gerardo Ulloa Porras

II Semestre, 2016
 */
/*___________________ Seccion de codigo de usuario ___________________*/
package analizadorlex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//clase de los token devueltos
class Yytoken {
    Yytoken (int numToken,String token, String tipo, int linea, int columna){
        //Contador para el número de tokens reconocidos
        this.numToken = numToken;
        //String del token reconocido
        this.token = new String(token);
        //Tipo de componente léxico encontrado
        this.tipo = tipo;
        //Número de linea
        this.linea = linea;
        //Columna donde empieza el primer carácter del token
        this.columna = columna;
    }
    //Métodos de los atributos de la clase
    public int numToken;
    public String token;
    public String tipo;
    public int linea;
    public int columna;
    //Metodo que devuelve los datos necesarios que escribiremos en un archive de salida
    public String toString() {
        return "Token #"+numToken+": "+token+" C.Lexico: "+tipo+" ["+linea
        + "," +columna + "]";
    }
}






/*___________________ Seccion de opciones y declaraciones de JFlex ___________________*/
%% 

//----- inicio de opciones -----

//Cambiamos el nombre la funcion para el siguiente token por nextToken
%function nextToken

//Clase publica
%public

//Cambiamos el nombre de la clase del analizador
%class AnalizadorLexico

//Agregamos soporte a unicode
%unicode

//Codigo java
%{
	
    private int contador;
    private ArrayList<Yytoken> tokens;

	private void writeOutputFile() throws IOException{
			String filename = "fileTokensFound.out";
			BufferedWriter out = new BufferedWriter(
				new FileWriter(filename));
            System.out.println("\n*** Tokens guardados en archivo ***\n");
			for(Yytoken t: this.tokens){
				//System.out.println(t);
				out.write(t + "\n");
			}
			out.close();
	}
    private void ImprimirError(int pLinea, int pColumna){
        System.out.println("ERROR LEXICO, "
            + "linea:" +String.valueOf(pLinea)
            + " columna:" +String.valueOf(pColumna));
    }
%}
//Creamos un contador para los tokens
%init{
    contador = 0;
	tokens = new ArrayList<Yytoken>();
%init}

//Cuando se alcanza el fin del archivo de entrada
%eof{
	try{
		this.writeOutputFile();
	}catch(IOException ioe){
		ioe.printStackTrace();
	}
%eof}

//Activar el contador de lineas, variable yyline
%line

//Activar el contador de columna, variable yycolumn
%column
//Fin de opciones


//----- Expresiones regulares -----

EXP_ALPHA=[A-Za-z]
EXP_DIGITO=[0-9]
EXP_ALPHANUMERIC={EXP_ALPHA}|{EXP_DIGITO}
ESPACIO=" "
TABULADOR=\t

PALABRAS_RESERVADAS = "AND" | "ARRAY" | "BEGIN" | "BOOLEAN" | "BYTE" | "CASE" | "CHAR" | "CONST" | "DIV" | "DOWNTO" | "DO" | "ELSE" | "END" | "FALSE" | "FILE" | "FORWARD" | "FOR" | "FUNCTION" | "GOTO" | "IF" | "INLINE" | "INT" | "IN" | "LABEL" | "LONGINT" | "MOD" | "NIL" | "NOT" | "OF" | "OR" | "PACKED" | "PROCEDURE" | "PROGRAM" | "READ" | "REAL" | "RECORD" | "REPEAT" | "SET" | "SHORTINT" | "STRING" | "THEN" | "TO" | "TRUE" | "TYPE" | "UNTIL" | "VAR" | "WHILE" | "WITH" | "WRITE" | "XOR"

/* COMENTARIOS */
SALTO=\n|\r|\r\n|\n\r
charEntrada = [^\r\n]
COMENTARIOS = {ComentariosBloque} | {ComentariosLinea}
ComentariosBloque = ([\(][\*]  ~([\*][\)])) | ([\{]  ~([\}]))
ComentariosLinea = "/""/" {charEntrada}* {SALTO}?

IDENTIFICADOR={EXP_ALPHA}(({EXP_ALPHANUMERIC}){0,126})

/* LITERALES */
ENTERO= {EXP_DIGITO}+
FLOTANTE = {ENTERO}+ "." {ENTERO}+
N_CIENTIFICA = {ENTERO}+ "." ({ENTERO}+) "E" ("-")? {ENTERO}+
REAL = {FLOTANTE}|{N_CIENTIFICA}
STRING = ([\"]  ~([\"]))
CARACTER = ([\"].[\"]) | [\#]{EXP_DIGITO} | [\#]{EXP_DIGITO}{EXP_DIGITO} | [\#]"1"{EXP_DIGITO}{EXP_DIGITO} | [\#]"2"[0-4]{EXP_DIGITO} | [\#]"2" "5" [0-5]


OPERADORES = ">>=" | "<<=" | "+=" | "-=" | "*=" | "/=" | ">>" | "<<" | ":=" | "++" | "--" | ">=" | "<=" | "<>" | "=" | "+" | "-" | "*" | "/" | "(" | ")" | "[" | "]" | "." | ":" | "," | ";" | ">" | "<"


//fin declaraciones





//Errores

ComentariosBloqueError = ([\(][\*]  ~{SALTO}) | ([\{]  ~{SALTO})
RealError = [^1-9] "."  {ENTERO}+ | {ENTERO}+ "."  [^0-9] | {ENTERO}+ "." [^0-9] "E" ("-")? [^0-9]
ERRORES = {ComentariosBloqueError}



/*___________________ Seccion de reglas lexicas ___________________*/
//Regla     {Acciones}
%% 

{RealError} {
	ImprimirError(yyline+1,yycolumn+1);	
}

{COMENTARIOS} { /* ignore */ }


{OPERADORES} {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"Operador",yyline,yycolumn);
    tokens.add(t);
    return t;
}

{PALABRAS_RESERVADAS} {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"Palabra_Reservada",yyline,yycolumn);
    tokens.add(t);
    return t;
}
{IDENTIFICADOR} {
    contador++;
    Yytoken t = new Yytoken(contador,yytext().toLowerCase(),"Identificador",yyline,yycolumn);
    tokens.add(t);
    return t;
}
{CARACTER} {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"Literal_Caracter",yyline,yycolumn);
    tokens.add(t);
    return t;
}
{STRING} {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"Literal_String",yyline,yycolumn);
    tokens.add(t);
    return t;
}

{FLOTANTE} {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"Literal_Numerica_Flotante",yyline,yycolumn);
    tokens.add(t);
    return t;
}
{REAL} {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"Literal_Numerica_Real",yyline,yycolumn);
    tokens.add(t);
    return t;
}
{ENTERO} {
    contador++;
    Yytoken t = new Yytoken(contador,
        String.valueOf(Integer.valueOf(yytext())),
        "Literal_Numerica_Entera",yyline,yycolumn);
    tokens.add(t);
    return t;
}

{ESPACIO} {
 	//ignorar
}

{TABULADOR} {
    //ignorar
}

{SALTO} {
    //contador++;
    //Yytoken t = new Yytoken(contador,"","fin_linea",yyline,yycolumn);
    //tokens.add(t);
    //return t;
    //ignorar
}

{ERRORES} {
	ImprimirError(yyline+1,yycolumn+1);
}

//mas errores
. {
	//contador++;
	//Yytoken t = new Yytoken(-1,"ERROR_LEXICO","ERROR_LEXICO",yyline,yycolumn);
	//return t;
    ImprimirError(yyline+1,yycolumn+1);
}
