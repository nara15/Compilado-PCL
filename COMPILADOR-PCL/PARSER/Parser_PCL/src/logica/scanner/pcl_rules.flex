package logica.scanner;

import java_cup.runtime.*;
import logica.parser.sym;

%%

%{
private Symbol token(int type, Object value)
{
    return new Symbol(type, yyline, yycolumn, value);
}
%}

%public
%class Scanner
%cup
%line
%column

/**
*   COMENTARIOS DEL LENGUAJE ---------------------------------------------------
*/
/**
*   Expresiones regulares para comentarios de linea
*/
start = [//]{2}
comment_line_body = [^\r\n]*(\r|\n|\r\n)?
COMMENT_LINE = {start}{comment_line_body}

/**
 * Expresiones regulares para comentarios de bloque (* ..... *)
 */
COMMENT_BODY = \(\*[^]*\*\)

/**
* Expresiones regulares para comentarios de bloque {......}
*/
COMMEN_BODY_BRACKETS = \{[^\}]+\}

/**
*   LITERALES ------------------------------------------------------------------
*/
ENTERO = \d+
FLOTANTE = -?\d+\.\d+
NOTA_CIENTIFICA = (\d+\.\d+)(E)-?[0-9]+
STRINGCHARACTER = \"[^\"]*\"
CHARACTER = #\d+

/*
*   IDENTIFICADORES ------------------------------------------------------------
*/
ID = [_|a-z|A-Z][a-z|A-Z|0-9|_]{0,127}

/**
*   ERRORES --------------------------------------------------------------------
*/
COMMENT_BODY_ERROR = "(*" ~"\n" | "(*" ~"\n\r" | "(*" ~"\r\n" | "(*" ~"\r"

ERROR_NOTA_1 = (\d+)(\E)-?[0-9]+
ERROR_NOTA_2 = (\d+\.\d+)(E)
ERROR_NOTA_3 = (\d+\.\d+)(E)-?[0-9]\.[0-9]+

ERROR_PUNTO_ANTES = \.\d+
ERROR_PUNTO_DESPUES = -?\d+\.

ERROR_STRING = [0-9]+[_|:|a-z|A-Z][a-z|A-Z|0-9|_|:]{0,127}
ERROR_STRING_SIN_CERRAR = [\"] ~[^\"]


BLANCO = [\n| |\t|\r]

%%

<YYINITIAL> 
{
    /*
    * PALABRAS RESERVADAS
    */
    "AND"        { return token(1200, yytext()); }
    "ARRAY"      { return token(1200, yytext()); }
    "BEGIN"      { return token(sym.BEGIN, yytext()); }
    "BOOLEAN"    { return token(sym.BOOLEAN, yytext()); }
    "BYTE"       { return token(1200, yytext());}
    "CASE"       { return token(1200, yytext());}
    "CHAR"       { return token(sym.CHAR, yytext());}
    "CONST"      { return token(1200, yytext());}
    "DIV"        { return token(1200, yytext());}
    "DO"         { return token(1200, yytext());}
    "DOWNTO"     { return token(1200, yytext());}
    "ELSE"       { return token(1200, yytext());}
    "END"        { return token(sym.END, yytext());}
    "FALSE"      { return token(1200, yytext());}
    "FOR"        { return token(1200, yytext());}
    "FORWARD"    { return token(1200, yytext());}
    "FUNCTION"   { return token(1200, yytext());}
    "GOTO"       { return token(1200, yytext());}
    "IF"         { return token(1200, yytext());}
    "IN"         { return token(1200, yytext());}
    "INLINE"     { return token(1200, yytext());}
    "INT"        { return token(sym.INT, yytext());}
    "LABEL"      { return token(1200, yytext());}
    "LONGINT"    { return token(sym.LONGINT, yytext());}
    "MOD"        { return token(1200, yytext());}
    "NIL"        { return token(1200, yytext());}
    "NOT"        { return token(1200, yytext());}
    "OF"         { return token(1200, yytext());}
    "OR"         { return token(1200, yytext());}
    "PACKED"     { return token(1200, yytext());}
    "PROCEDURE"  { return token(1200, yytext());}
    "PROGRAM"    { return token(sym.PROGRAM, yytext());}
    "READ"       { return token(1200, yytext());}
    "REAL"       { return token(sym.BOOLEAN, yytext());}
    "RECORD"     { return token(1200, yytext());}
    "REPEAT"     { return token(1200, yytext());}
    "SET"        { return token(1200, yytext());}
    "SHORTINT"   { return token(sym.SHORTINT, yytext());}
    "STRING"     { return token(sym.STRING, yytext());}
    "THEN"       { return token(1200, yytext());}
    "TO"         { return token(1200, yytext());}
    "TRUE"       { return token(1200, yytext());}
    "TYPE"       { return token(1200, yytext());}
    "UNTIL"      { return token(1200, yytext());}
    "VAR"        { return token(sym.VAR, yytext());}
    "WHILE"      { return token(1200, yytext());}
    "WITH"       { return token(1200, yytext());}
    "WRITE"      { return token(1200, yytext());}
    "XOR"        { return token(1200, yytext());}
    
    /**
    * OPERADORES Y SEPARADORES
    */
    
    ","          { return token(sym.COMA, yytext());}
    ";"          { return token(sym.PUNTO_COMA, yytext());}
    "++"         { return token(3000, yytext());}
    "--"         { return token(3000, yytext());}
    ">="         { return token(3000, yytext());}
    ">"          { return token(3000, yytext());}
    "<="         { return token(3000, yytext());}
    "<"          { return token(3000, yytext());}
    "<>"         { return token(3000, yytext());}
    "="          { return token(3000, yytext());}
    "+"          { return token(3000, yytext());}
    "-"          { return token(3000, yytext());}
    "*"          { return token(3000, yytext());}
    "/"          { return token(3000, yytext());}
    "("          { return token(3000, yytext());}
    ")"          { return token(3000, yytext());}
    "["          { return token(3000, yytext());}
    "]"          { return token(3000, yytext());}
    ":="         { return token(3000, yytext());}
    "."          { return token(3000, yytext());}
    ":"          { return token(sym.DOS_PUNTO, yytext());}
    "+="         { return token(3000, yytext());}
    "-="         { return token(3000, yytext());}
    "*="         { return token(3000, yytext());}
    "/="         { return token(3000, yytext());}
    ">>"         { return token(3000, yytext());}
    "<<"         { return token(3000, yytext());}
    "<<="        { return token(3000, yytext());}
    ">>="        { return token(3000, yytext());}
    
}

{BLANCO}                { /*Omitir el espacio blanco*/ }
    /**
    * LITERALES
    */
{ENTERO}                { return token(4000, yytext()); }
{FLOTANTE}              { return token(4000, yytext());}
{NOTA_CIENTIFICA}       { return token(4000, yytext());}
{STRINGCHARACTER}       { return token(4000, yytext());}
{CHARACTER}             { return token(4000, yytext());}
{ID}                    { return token(sym.ID, yytext().toUpperCase());}
    /**
    * COMENTARIOS
    */
{COMMENT_BODY}          { return token(5000, yytext());}
{COMMENT_LINE}          { return token(5000, yytext());}
{COMMEN_BODY_BRACKETS}  { return token(5000, yytext());}
    /**
    * ERRORES CONOCIDOS
    */
{ERROR_STRING_SIN_CERRAR} { return token(sym.error, "Hilera sin cerrar " + yytext());}
{ERROR_PUNTO_ANTES}     { return token(sym.error, "No tiene nada antes del punto " + yytext()); } 
{ERROR_PUNTO_DESPUES}   { return token(sym.error, "No tiene nada después del punto" + yytext()); }   
{ERROR_NOTA_1}          { return token(sym.error, "Notación científica mala " + yytext()); }
{ERROR_NOTA_2}          { return token(sym.error, "Notación científica mala - error no tiene nada después del exponente" + yytext()); }
{ERROR_NOTA_3}          { return token(sym.error, "Notación científica mala - error el numero después del E tiene que ser entero" + yytext()); }
{COMMENT_BODY_ERROR}    { return token(sym.error, "Comentario no cerrado" + yytext()); }
{ERROR_STRING}          { return token(sym.error, "No debe comenzar con números" + yytext()); }
.                       { return token(sym.error, "Caracter inválido " + yytext()); }  