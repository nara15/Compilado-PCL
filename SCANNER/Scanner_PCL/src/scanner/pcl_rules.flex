package scanner;

import java_cup.runtime.*;
import symbols.sym;

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
leftbrace = \([*]
rightbrace = [*]\)
commentbody = [^]*
COMMENT_BODY = \(\*[^]*\*\)
COMMENT_BODY_ERROR = \(\*[^]*

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


ERROR_NOTA_1 = (\d+)(\E)-?[0-9]+
ERROR_NOTA_2 = (\d+\.\d+)(E)
ERROR_NOTA_3 = (\d+\.\d+)(E)-?[0-9]\.[0-9]+

ERROR_PUNTO_ANTES = \.\d+
ERROR_PUNTO_DESPUES = -?\d+\.

ERROR_STRING = [0-9]+[_|:|a-z|A-Z][a-z|A-Z|0-9|_|:]{0,127}


ERROR_STRING_SIN_CERRAR = (.*?\")

/*
*   IDENTIFICADORES ------------------------------------------------------------
*/
ID = [_|a-z|A-Z][a-z|A-Z|0-9|_]{0,127}


BLANCO = [\n| |\t|\r]

%%

<YYINITIAL> 
{
    /*
    * PALABRAS RESERVADAS
    */
    "AND"        { return token(sym.PALABRA_RESERVADA, yytext()); }
    "ARRAY"      { return token(sym.PALABRA_RESERVADA, yytext()); }
    "BEGIN"      { return token(sym.PALABRA_RESERVADA, yytext()); }
    "BOOLEAN"    { return token(sym.PALABRA_RESERVADA, yytext()); }
    "BYTE"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "CASE"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "CHAR"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "CONST"      { return token(sym.PALABRA_RESERVADA, yytext());}
    "DIV"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "DO"         { return token(sym.PALABRA_RESERVADA, yytext());}
    "DOWNTO"     { return token(sym.PALABRA_RESERVADA, yytext());}
    "ELSE"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "END"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "FALSE"      { return token(sym.PALABRA_RESERVADA, yytext());}
    "FOR"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "FORWARD"    { return token(sym.PALABRA_RESERVADA, yytext());}
    "FUNCTION"   { return token(sym.PALABRA_RESERVADA, yytext());}
    "GOTO"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "IF"         { return token(sym.PALABRA_RESERVADA, yytext());}
    "IN"         { return token(sym.PALABRA_RESERVADA, yytext());}
    "INLINE"     { return token(sym.PALABRA_RESERVADA, yytext());}
    "INT"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "LABEL"      { return token(sym.PALABRA_RESERVADA, yytext());}
    "LONGINT"    { return token(sym.PALABRA_RESERVADA, yytext());}
    "MOD"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "NIL"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "NOT"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "OF"         { return token(sym.PALABRA_RESERVADA, yytext());}
    "OR"         { return token(sym.PALABRA_RESERVADA, yytext());}
    "PACKED"     { return token(sym.PALABRA_RESERVADA, yytext());}
    "PROCEDURE"  { return token(sym.PALABRA_RESERVADA, yytext());}
    "PROGRAM"    { return token(sym.PALABRA_RESERVADA, yytext());}
    "READ"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "REAL"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "RECORD"     { return token(sym.PALABRA_RESERVADA, yytext());}
    "REPEAT"     { return token(sym.PALABRA_RESERVADA, yytext());}
    "SET"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "SHORTINT"   { return token(sym.PALABRA_RESERVADA, yytext());}
    "STRING"     { return token(sym.PALABRA_RESERVADA, yytext());}
    "THEN"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "TO"         { return token(sym.PALABRA_RESERVADA, yytext());}
    "TRUE"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "TYPE"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "UNTIL"      { return token(sym.PALABRA_RESERVADA, yytext());}
    "VAR"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "WHILE"      { return token(sym.PALABRA_RESERVADA, yytext());}
    "WITH"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "WRITE"      { return token(sym.PALABRA_RESERVADA, yytext());}
    "XOR"        { return token(sym.PALABRA_RESERVADA, yytext());}
    
    /**
    * OPERADORES Y SEPARADORES
    */
    
    ","          { return token(sym.COMA, yytext());}
    ";"          { return token(sym.PUNTO_COMA, yytext());}
    "++"         { return token(sym.OP_INC, yytext());}
    "--"         { return token(sym.OP_DEC, yytext());}
    ">="         { return token(sym.OP_MAYOR_IGUAL, yytext());}
    ">"          { return token(sym.OP_MAYOR, yytext());}
    "<="         { return token(sym.OP_MENOR_IGUAL, yytext());}
    "<"          { return token(sym.OP_MENOR, yytext());}
    "<>"         { return token(sym.OP_DISTINTO, yytext());}
    "="          { return token(sym.OP_IGUAL, yytext());}
    "+"          { return token(sym.OP_SUMA, yytext());}
    "-"          { return token(sym.OP_RESTA, yytext());}
    "*"          { return token(sym.OP_MULTIPLICACION, yytext());}
    "/"          { return token(sym.OP_DIVISION, yytext());}
    "("          { return token(sym.PAR_APER, yytext());}
    ")"          { return token(sym.PAR_CERR, yytext());}
    "["          { return token(sym.BRA_APER, yytext());}
    "]"          { return token(sym.BRA_CERR, yytext());}
    ":="         { return token(sym.ASIGN, yytext());}
    "."          { return token(sym.PUNTO, yytext());}
    ":"          { return token(sym.DOS_PUNTO, yytext());}
    "+="         { return token(sym.OP_SUMA_ASIGN, yytext());}
    "-="         { return token(sym.OP_RESTA_ASIGN, yytext());}
    "*="         { return token(sym.OP_MUL_ASIGN, yytext());}
    "/="         { return token(sym.OP_DIV_ASIGN, yytext());}
    ">>"         { return token(sym.OP_SHIFT_DER, yytext());}
    "<<"         { return token(sym.OP_SHIFT_IZQ, yytext());}
    "<<="        { return token(sym.OP_SHIFT_IZQ_ASIGN, yytext());}
    ">>="        { return token(sym.OP_SHIFT_DER_ASIGN, yytext());}
    
}

{BLANCO}                { /*Omitir el espacio blanco*/ }

{ENTERO}                { return token(sym.ENTERO, yytext()); }
{FLOTANTE}              { return token(sym.FLOTANTE, yytext());}
{NOTA_CIENTIFICA}       { return token(sym.NOTA_CIENTIFICA, yytext());}
{STRINGCHARACTER}       { return token(sym.STRING_C, yytext());}
{CHARACTER}             { return token(sym.CHARACTER, yytext());}
{ID}                    { return token(sym.ID, yytext().toUpperCase());}

{COMMENT_BODY}          { return token(sym.COMMENT, yytext());}
{COMMENT_LINE}          { return token(sym.COMMENT, yytext());}
{COMMEN_BODY_BRACKETS}  { return token(sym.COMMENT, yytext());}

{ERROR_STRING_SIN_CERRAR} { return token(sym.ERROR_LEXICO, "Hilera sin cerrar " + yytext());}
{ERROR_PUNTO_ANTES}     { return token(sym.ERROR_LEXICO, "No tiene nada antes del punto " + yytext()); } 
{ERROR_PUNTO_DESPUES}   { return token(sym.ERROR_LEXICO, "No tiene nada después del punto" + yytext()); }   
{ERROR_NOTA_1}          { return token(sym.ERROR_LEXICO, "Notación científica mala " + yytext()); }
{ERROR_NOTA_2}          { return token(sym.ERROR_LEXICO, "Notación científica mala - error no tiene nada después del exponente" + yytext()); }
{ERROR_NOTA_3}          { return token(sym.ERROR_LEXICO, "Notación científica mala - error el numero después del E tiene que ser entero" + yytext()); }
{COMMENT_BODY_ERROR}    { return token(sym.ERROR_LEXICO, "Comentario no cerrado" + yytext()); }
{ERROR_STRING}          { return token(sym.ERROR_LEXICO, "No debe comenzar con números" + yytext()); }
.                       { return token(sym.ERROR_LEXICO, "Caracter inválido " + yytext()); }  