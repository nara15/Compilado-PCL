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
COMMENT_BODY = {leftbrace}{commentbody}{rightbrace}

/**
* Expresiones regulares para comentarios de bloque {......}
*/
COMMEN_BODY_BRACKETS = \{[^]*\}

/**
*   LITERALES ------------------------------------------------------------------
*/
ENTERO = \d+
FLOTANTE = -?\d+\.\d+
NOTA_CIENTIFICA = (-?\d+\.?\d+)(E)-?[0-9]+
STRINGCHARACTER = \"[^\"]*\"
CHARACTER = #\d+


/*
*   IDENTIFICADORES ------------------------------------------------------------
*/
ID = [_|a-z|A-Z][a-z|A-Z|0-9|_]{1,127}


BLANCO = [\n| |\t|\r]

%%

<YYINITIAL> 
{
    /*
    * PALABRAS RESERVADAS
    */
    "and"        { return token(sym.PALABRA_RESERVADA, yytext()); }
    "array"      { return token(sym.PALABRA_RESERVADA, yytext()); }
    "begin"      { return token(sym.PALABRA_RESERVADA, yytext()); }
    "boolean"    { return token(sym.PALABRA_RESERVADA, yytext()); }
    "byte"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "case"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "char"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "const"      { return token(sym.PALABRA_RESERVADA, yytext());}
    "div"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "do"         { return token(sym.PALABRA_RESERVADA, yytext());}
    "downto"     { return token(sym.PALABRA_RESERVADA, yytext());}
    "else"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "end"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "false"      { return token(sym.PALABRA_RESERVADA, yytext());}
    "for"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "forward"    { return token(sym.PALABRA_RESERVADA, yytext());}
    "function"   { return token(sym.PALABRA_RESERVADA, yytext());}
    "goto"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "if"         { return token(sym.PALABRA_RESERVADA, yytext());}
    "in"         { return token(sym.PALABRA_RESERVADA, yytext());}
    "inline"     { return token(sym.PALABRA_RESERVADA, yytext());}
    "int"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "label"      { return token(sym.PALABRA_RESERVADA, yytext());}
    "longint"    { return token(sym.PALABRA_RESERVADA, yytext());}
    "mod"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "nil"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "not"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "of"         { return token(sym.PALABRA_RESERVADA, yytext());}
    "or"         { return token(sym.PALABRA_RESERVADA, yytext());}
    "packed"     { return token(sym.PALABRA_RESERVADA, yytext());}
    "procedure"  { return token(sym.PALABRA_RESERVADA, yytext());}
    "program"    { return token(sym.PALABRA_RESERVADA, yytext());}
    "read"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "real"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "record"     { return token(sym.PALABRA_RESERVADA, yytext());}
    "repeat"     { return token(sym.PALABRA_RESERVADA, yytext());}
    "set"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "shortint"   { return token(sym.PALABRA_RESERVADA, yytext());}
    "string"     { return token(sym.PALABRA_RESERVADA, yytext());}
    "then"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "to"         { return token(sym.PALABRA_RESERVADA, yytext());}
    "true"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "type"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "until"      { return token(sym.PALABRA_RESERVADA, yytext());}
    "var"        { return token(sym.PALABRA_RESERVADA, yytext());}
    "while"      { return token(sym.PALABRA_RESERVADA, yytext());}
    "with"       { return token(sym.PALABRA_RESERVADA, yytext());}
    "write"      { return token(sym.PALABRA_RESERVADA, yytext());}
    "xor"        { return token(sym.PALABRA_RESERVADA, yytext());}
    
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
{ID}                    { return token(sym.ID, yytext().toLowerCase());}

{COMMENT_BODY}          { return token(sym.COMMENT, yytext());}
{COMMENT_LINE}          { return token(sym.COMMENT, yytext());}
{COMMEN_BODY_BRACKETS}  { return token(sym.COMMENT, yytext());}
                 
.                       { return token(sym.ERROR_LEXICO, "Caracter inválido " + yytext()); }  