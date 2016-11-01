package logica;

import java_cup.runtime.Symbol;

%%
%class Lexer
%cup
%line
%column

%{
public int linea(){return yyline;}
public int columna(){return yycolumn;}
StringBuilder string = new StringBuilder();
%}

/* DEFINICIONES DE MACROS */

/* L = [a-zA-Z_] */
/* N = [0-9] */
/* WHITE = [ \n\t\r] */

/* Entrada de Datos */
Tab = [\t]
TerminarLinea = \r | \r\n | \n
EntradaCaracteres = [^\r\n]
EspaciosBlanco = [ \f]

/* Comentarios */
ComentarioLinea = "#" {EntradaCaracteres}* {TerminarLinea}?
ComentarioMultiLinea = ([\"][\"][\"]  ~([\"][\"][\"])) | ([\'][\'][\']  ~([\'][\'][\']))
Comentario = {ComentarioLinea} | {ComentarioMultiLinea}

/* Identificadores */
Letra = [A-Za-z]
LetraNumero = {Letra} | [0-9]
LetraNumeroGuion = {LetraNumero} | [_]
Identificador = ( {Letra} {LetraNumeroGuion}* ) | ( [_]+ {LetraNumeroGuion}* )

/* Literales Enteros */
DecimalLiteral = 0 | [1-9][0-9]*
DecimalLong = {DecimalLiteral} [lL]

BinarioLiteral = 0 [bB] {BinarioDigito} {1,63}
BinarioLong = 0 [bB] {BinarioDigito} [lL]
BinarioDigito = [01]

HexaLiteral = 0 [xX] 0* {HexaDigito} {1,8}
HexaLong = 0 [xX] 0* {HexaDigito} {1,16} [lL]
HexaDigito = [0-9a-fA-F]

OctalLiteral = 0 [oO] {OctalDigito} {1,15}
OctalLong = 0 [oO] {OctalDigito} {1,21} [lL]
OctalDigito = [0-7]

/* Flotantes */
FlotanteOpciones = [0-9]+ \. [0-9]*  | \. [0-9]+ | [0-9]+
Exponente = [eE] [+-]? [0-9]+

FlotanteLiteral = ({FlotanteOpciones}) {Exponente}? [fF]
DobleLiteral = ({FlotanteOpciones}) {Exponente}?

/* Strings y Chars */
CaracterString = [^\r\n\"\\]
CaracterChar = [^\r\n\'\\]

%state STRING
%state CHAR

%%

<YYINITIAL> 
{
    {TerminarLinea} {return new Symbol(sym.salto_linea, new Simbolo(yytext(), "Separador", linea()+1, columna()+1));}

    /* Espacios en Blanco */
    {EspaciosBlanco} { /*Ignorar*/ }
    {Tab} { }
    
    /* Comentarios */
    {Comentario} { /*Ignorar*/ }    

    /* Palabras Reservadas */
    ("del") {return new Symbol(sym.del, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("from") {return new Symbol(sym.from, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("as") {return new Symbol(sym.as, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("with") {return new Symbol(sym.with_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("assert") {return new Symbol(sym.assert_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("pass") {return new Symbol(sym.pass, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("yield") {return new Symbol(sym.yield, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("import") {return new Symbol(sym.import_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("exec") {return new Symbol(sym.exec, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("finally") {return new Symbol(sym.finally_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("lambda") {return new Symbol(sym.lambda, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("this") {return new Symbol(sym.this_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("break") {return new Symbol(sym.break_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("continue") {return new Symbol(sym.continue_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("input") {return new Symbol(sym.input, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("is") {return new Symbol(sym.is, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("return") {return new Symbol(sym.return_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("range") {return new Symbol(sym.range, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("in") {return new Symbol(sym.in, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));} 
    ("print") {return new Symbol(sym.print_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("try") {return new Symbol(sym.try_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("except") {return new Symbol(sym.except, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("if") {return new Symbol(sym.if_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("while") {return new Symbol(sym.while_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("elif") {return new Symbol(sym.elif, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("else") {return new Symbol(sym.else_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("def") {return new Symbol(sym.def, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("class") {return new Symbol(sym.class_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("for") {return new Symbol(sym.for_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("int") {return new Symbol(sym.int_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("float") {return new Symbol(sym.float_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("boolean") {return new Symbol(sym.boolean_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("list") {return new Symbol(sym.list, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("char") {return new Symbol(sym.char_, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}
    ("string") {return new Symbol(sym.string, new Simbolo(yytext(), "Palabra Reservada", linea()+1, columna()+1));}

    
    /* Operadores */
    "+" {return new Symbol(sym.suma, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "-" {return new Symbol(sym.resta, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "*" {return new Symbol(sym.multiplicacion, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "/" {return new Symbol(sym.division, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "//"    {return new Symbol(sym.division_doble, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "%" {return new Symbol(sym.modulo, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "**"    {return new Symbol(sym.potencia, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}

    "=" {return new Symbol(sym.igual, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "+="    {return new Symbol(sym.mas_igual, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "-="    {return new Symbol(sym.menos_igual, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "*="    {return new Symbol(sym.multiplicacion_igual, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "/="    {return new Symbol(sym.division_igual, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "%="    {return new Symbol(sym.modulo_igual, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "**="   {return new Symbol(sym.potencia_igual, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "//="   {return new Symbol(sym.division_doble_igual, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}

    "!="    {return new Symbol(sym.not_igual, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "<>"    {return new Symbol(sym.menor_mayor, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    ">"     {return new Symbol(sym.mayor, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "<"     {return new Symbol(sym.menor_, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    ">="    {return new Symbol(sym.mayor_igual, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "<="    {return new Symbol(sym.menor_igual, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "=="    {return new Symbol(sym.igual_igual, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "and"   {return new Symbol(sym.and, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "or"    {return new Symbol(sym.or, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}

    "&" {return new Symbol(sym.ampersand, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "|" {return new Symbol(sym.pipe, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "^" {return new Symbol(sym.circunflejo, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "~" {return new Symbol(sym.tilde, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    ">>"    {return new Symbol(sym.shift_derecha, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "<<"    {return new Symbol(sym.shift_izquierda, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}

    "not"   {return new Symbol(sym.not, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}
    "!" {return new Symbol(sym.not_symbol, new Simbolo(yytext(), "Operador", linea()+1, columna()+1));}

    /* Separadores */
    "(" {return new Symbol(sym.parentesis_abre, new Simbolo(yytext(), "Separador", linea()+1, columna()+1));}
    ")" {return new Symbol(sym.parentesis_cierra, new Simbolo(yytext(), "Separador", linea()+1, columna()+1));}
    "," {return new Symbol(sym.coma, new Simbolo(yytext(), "Separador", linea()+1, columna()+1));}
    "."	{return new Symbol(sym.punto, new Simbolo(yytext(), "Separador", linea()+1, columna()+1));}
    ":"	{return new Symbol(sym.dos_puntos, new Simbolo(yytext(), "Separador", linea()+1, columna()+1));}
    "["	{return new Symbol(sym.cuadrado_abre, new Simbolo(yytext(), "Separador", linea()+1, columna()+1));}
    "]"	{return new Symbol(sym.cuadrado_cierra, new Simbolo(yytext(), "Separador", linea()+1, columna()+1));}
    ";"	{return new Symbol(sym.punto_coma, new Simbolo(yytext(), "Separador", linea()+1, columna()+1));}

    /* Literales */
    ("True") {return new Symbol(sym.true_, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}
    ("False") {return new Symbol(sym.false_, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}

    {DecimalLiteral} {return new Symbol(sym.decimal_literal, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}
    {DecimalLong}    {return new Symbol(sym.decimal_long, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}

    {HexaLiteral} {return new Symbol(sym.hexa_literal, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}
    {HexaLong}    {return new Symbol(sym.hexa_long, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}

    {OctalLiteral} {return new Symbol(sym.octal_literal, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}  
    {OctalLong}    {return new Symbol(sym.octal_long, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}

    {BinarioLiteral} {return new Symbol(sym.binario_literal, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}
    {BinarioLong}    {return new Symbol(sym.binario_long, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}

    {FlotanteLiteral}  {return new Symbol(sym.flotante_literal, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}
    {DobleLiteral} {return new Symbol(sym.double_literal, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}
    /*{DobleLiteral}[dD] {return new Symbol(sym.double_literal, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));}*/

    \"  {
            yybegin(STRING); 
            string.setLength(0);
        }

    \'  { 
            yybegin(CHAR); 
        }
    
    /* Identificadores */
    {Identificador} {return new Symbol(sym.identificador, new Simbolo(yytext(), "Identificador", linea()+1, columna()+1));} 
    
}


<STRING> 
{
    \"  { 
            yybegin(YYINITIAL);
            return new Symbol(sym.string_literal, new Simbolo(yytext(), "Literal", linea()+1, columna()+1));
        }
  
    {CaracterString}+   { string.append( yytext() ); }
  
    /* Salida del String */
    "\\b"   {string.append('\b');}
    "\\t"   {string.append('\t');}
    "\\n"   {string.append('\n');}
    "\\f"   {string.append('\f');}
    "\\r"   {string.append('\r');}
    "\\\""  {string.append('\"');}
    "\\'"   {string.append('\'');}	
    "\\\\"  {string.append('\\');}
    \\[0-3]?{OctalDigito}?{OctalDigito}  {
                                            char val = (char) Integer.parseInt(yytext().substring(1),8); 
                                            string.append(val);
                                         }
    "\\"{TerminarLinea} { }
  
    /* Casos de Error */
    \\. {return new Symbol(sym.ERROR, new Simbolo(yytext(), "ERROR", linea()+1, columna()+1));}
    {TerminarLinea} {return new Symbol(sym.ERROR, new Simbolo(yytext(), "ERROR", linea()+1, columna()+1));}
}

<CHAR> 
{
    \'  {yybegin(YYINITIAL);}
    
    {CaracterChar}  {
                        string.append(yytext()); 
                        return new Symbol(sym.char_literal, new Simbolo(Character.toString(yytext().charAt(0)), "Literal", linea()+1, columna()+1));
                    }
    {CaracterChar}{CaracterChar}+ {return new Symbol(sym.ERROR, new Simbolo(yytext(), "ERROR", linea()+1, columna()+1));}
  	
    /* Salida del Char */
    "\\b"\' {yybegin(YYINITIAL); return new Symbol(sym.char_literal, new Simbolo("\b", "Literal", linea()+1, columna()+1));}
    "\\t"\' {yybegin(YYINITIAL); return new Symbol(sym.char_literal, new Simbolo("\t", "Literal", linea()+1, columna()+1));}
    "\\n"\' {yybegin(YYINITIAL); return new Symbol(sym.char_literal, new Simbolo("\n", "Literal", linea()+1, columna()+1));}
    "\\f"\' {yybegin(YYINITIAL); return new Symbol(sym.char_literal, new Simbolo("\f", "Literal", linea()+1, columna()+1));}
    "\\r"\' {yybegin(YYINITIAL); return new Symbol(sym.char_literal, new Simbolo("\r", "Literal", linea()+1, columna()+1));}
    "\\\""\' {yybegin(YYINITIAL);return new Symbol(sym.char_literal, new Simbolo("\"", "Literal", linea()+1, columna()+1));}
    "\\'"\' {yybegin(YYINITIAL); return new Symbol(sym.char_literal, new Simbolo("\'", "Literal", linea()+1, columna()+1));}
    "\\\\"\' { yybegin(YYINITIAL); return new Symbol(sym.char_literal, new Simbolo("\\", "Literal", linea()+1, columna()+1));}
    \\[0-3]?{OctalDigito}?{OctalDigito}\' {
                                            yybegin(YYINITIAL); int val = Integer.parseInt(yytext().substring(1,yylength()-1),8); 
                                            string.append(val);
                                          }

    /* Casos de Error */
    \\. {return new Symbol(sym.ERROR, new Simbolo(yytext(), "ERROR", linea()+1, columna()+1));}
    {TerminarLinea} {return new Symbol(sym.ERROR, new Simbolo(yytext(), "ERROR", linea()+1, columna()+1));}
}

/* Errores de Léxico */

[^] {
        System.out.println("Error léxico en linea " + (linea()+1) + ", columna " + (columna()+1));
        return new Symbol(sym.ERROR, new Simbolo(yytext(), "ERROR", linea()+1, columna()+1));
    }
