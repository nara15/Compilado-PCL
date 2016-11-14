package logica.scanner;

import java_cup.runtime.*;
import logica.parser.sym;

%%

%{
    private Symbol token(int type, Object value)
    {
        return new Symbol(type, yyline + 1, yycolumn + 1, value);
    }
    
    public String current_lexeme()
    {
        int l = yyline+1;
        int c = yycolumn+1;
        return " (line: "+l+" , column: "+c+" , lexeme: '"+yytext()+"')";
    }
%}

%public
%class Scanner
%cup
%line
%column
%ignorecase

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

RANGO_DOS_PUNTOS = \.\.
BLANCO = [\n| |\t|\r]

%%

<YYINITIAL> 
{
    /*
    * PALABRAS RESERVADAS
    */
    "AND"        { return token(sym._AND, yytext()); }
    "ARRAY"      { return token(sym._array, yytext()); }
    "BEGIN"      { return token(sym._begin, yytext()); }
    "BOOLEAN"    { return token(sym._boolean, yytext()); }
    "BYTE"       { return token(1200, yytext());}
    "CASE"       { return token(sym._case, yytext());}
    "CHAR"       { return token(sym._char, yytext());}
    "CONST"      { return token(sym._const, yytext());}
    "DIV"        { return token(sym._op_DIV, yytext());}  
    "DO"         { return token(sym._do, yytext());}
    "DOWNTO"     { return token(1200, yytext());}
    "ELSE"       { return token(sym._else, yytext());}
    "END"        { return token(sym._end, yytext());}
    "FALSE"      { return token(sym._false, yytext());}
    "FOR"        { return token(sym._for, yytext());}
    "FORWARD"    { return token(1200, yytext());}
    "FUNCTION"   { return token(sym._function, yytext());}
    "GOTO"       { return token(1200, yytext());}
    "IF"         { return token(sym._if, yytext());}
    "IN"         { return token(1200, yytext());}
    "INLINE"     { return token(1200, yytext());}
    "INT"        { return token(sym._int, yytext());}
    "LABEL"      { return token(1200, yytext());}
    "LONGINT"    { return token(sym._longint, yytext());}
    "MOD"        { return token(sym._op_mod , yytext());}
    "NIL"        { return token(1200, yytext());}
    "NOT"        { return token(sym._NOT, yytext());}
    "OF"         { return token(sym._of, yytext());}
    "OR"         { return token(sym._OR, yytext());}
    "PACKED"     { return token(1200, yytext());}
    "PROCEDURE"  { return token(sym._procedure, yytext());}
    "PROGRAM"    { return token(sym._program, yytext());}
    "READ"       { return token(sym._read, yytext());}
    "REAL"       { return token(sym._real, yytext());}
    "RECORD"     { return token(1200, yytext());}
    "REPEAT"     { return token(sym._repeat, yytext());}
    "SET"        { return token(1200, yytext());}
    "SHORTINT"   { return token(sym._shortint, yytext());}
    "STRING"     { return token(sym._string, yytext());}
    "THEN"       { return token(sym._then, yytext());}
    "TO"         { return token(sym._to, yytext());}
    "TRUE"       { return token(sym._true, yytext());}
    "TYPE"       { return token(1200, yytext());}
    "UNTIL"      { return token(sym._until, yytext());}
    "VAR"        { return token(sym._var, yytext());}
    "WHILE"      { return token(sym._while, yytext());}
    "WITH"       { return token(1200, yytext());}
    "WRITE"      { return token(sym._write, yytext());}
    "XOR"        { return token(1200, yytext());}
    
    /**
    * OPERADORES Y SEPARADORES
    */
    
    ","          { return token(sym._coma, yytext());}
    ";"          { return token(sym._punto_coma, yytext());}
    "++"         { return token(sym._op_inc, yytext());}
    "--"         { return token(sym._op_dec, yytext());}
    ">="         { return token(sym._mayor_igual, yytext());}
    ">"          { return token(sym._mayor, yytext());}
    "<="         { return token(sym._menor_igual, yytext());}
    "<"          { return token(sym._menor, yytext());}
    "<>"         { return token(sym._distinto, yytext());}
    "="          { return token(sym._igual, yytext());}
    "+"          { return token(sym._op_suma, yytext());}
    "-"          { return token(sym._op_resta, yytext());}
    "*"          { return token(sym._op_multi, yytext());}
    "/"          { return token(sym._op_division, yytext());}
    "("          { return token(sym._parentesisAbre, yytext());}
    ")"          { return token(sym._parentesisCierra, yytext());}
    "["          { return token(sym._bra_aper, yytext());}
    "]"          { return token(sym._bra_cerr, yytext());}
    ":="         { return token(sym._asignacion, yytext());}
    "."          { return token(sym._punto, yytext());}
    ":"          { return token(sym._dos_puntos, yytext());}
    "+="         { return token(sym._op_mas_igual, yytext());}
    "-="         { return token(sym._op_menos_igual, yytext());}
    "*="         { return token(sym._op_mult_igual, yytext());}
    "/="         { return token(sym._op_div_igual, yytext());}
    ">>"         { return token(3000, yytext());}
    "<<"         { return token(3000, yytext());}
    "<<="        { return token(3000, yytext());}
    ">>="        { return token(3000, yytext());}
    
}

{BLANCO}                { /*Omitir el espacio blanco*/ }
    /**
    * LITERALES
    */
{ENTERO}                { return token(sym._entero, yytext()); }
{FLOTANTE}              { return token(sym._flotante, yytext());}
{NOTA_CIENTIFICA}       { return token(4000, yytext());}
{STRINGCHARACTER}       { return token(sym._hilera, yytext());}
{CHARACTER}             { return token(sym._caracter, yytext());}
{ID}                    { return token(sym._id, yytext().toUpperCase());}
    /**
    * COMENTARIOS
    */
{COMMENT_BODY}          { }
{COMMENT_LINE}          { }
{COMMEN_BODY_BRACKETS}  { }
    /**
    * ERRORES CONOCIDOS
    */
{ERROR_STRING_SIN_CERRAR} { return token(sym.error, "Hilera sin cerrar " + yytext());}
{ERROR_PUNTO_ANTES}     { return token(sym.error, "No tiene nada antes del punto " + yytext()); } 
{ERROR_PUNTO_DESPUES}   { return token(sym.error, "No tiene nada después del punto " + yytext()); }   
{ERROR_NOTA_1}          { return token(sym.error, "Notación científica mala " + yytext()); }
{ERROR_NOTA_2}          { return token(sym.error, "Notación científica mala - error no tiene nada después del exponente" + yytext()); }
{ERROR_NOTA_3}          { return token(sym.error, "Notación científica mala - error el numero después del E tiene que ser entero" + yytext()); }
{COMMENT_BODY_ERROR}    { return token(sym.error, "Comentario no cerrado" + yytext()); }
{ERROR_STRING}          { return token(sym.error, "No debe comenzar con números" + yytext()); }
{RANGO_DOS_PUNTOS}      { return token(sym._rango_dos_puntos,yytext());}
.                       { return token(sym.error, "Caracter inválido " + yytext()); }  