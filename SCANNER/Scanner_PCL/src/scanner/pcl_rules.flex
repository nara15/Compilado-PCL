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



DIGIT = [0-9]
ENTERO = {DIGIT}+
BLANCO = [\n| |\t|\r]
ID = [_|a-z|A-Z][a-z|A-Z|0-9|_]{1,9}
SUMA = "+"

%%

{BLANCO}                { /*Omitir el espacio blanco*/ }
{ID}                    {return token(sym.ID, yytext());}
{SUMA}                  { return token(sym.SUMA, yytext()); } 
{ENTERO}                { return token(sym.ENTERO, yytext()); }
{COMMENT_BODY}          {return token(sym.COMMENT, yytext());}
{COMMENT_LINE}          {return token(sym.COMMENT, yytext());}
{COMMEN_BODY_BRACKETS}  {return token(sym.COMMENT, yytext());}

<YYINITIAL> 
{
    /*
    * PALABRAS RESERVADAS
    */
    "and"        { return token(sym.IF,yytext()); }
    "array"      { return token(sym.ARRAY, yytext()); }
    "begin"      { return token(sym.BEGIN, yytext()); }
    "boolean"    { return token(sym.BOOLEAN, yytext()); }
    "byte"       { return token(sym.BYTE, yytext());}
    "case"       { return token(sym.CASE, yytext());}
    "char"       { return token(sym.CHAR, yytext());}
    "const"      { return token(sym.CONST, yytext());}
    "div"        { return token(sym.DIV, yytext());}
    "do"         { return token(sym.DO, yytext());}
    "downto"     { return token(sym.DOWNTO, yytext());}
    "else"       { return token(sym.ELSE, yytext());}
    "end"        { return token(sym.END, yytext());}
    "false"      { return token(sym.FALSE, yytext());}
    "for"        { return token(sym.FOR, yytext());}
    "forward"    { return token(sym.FORWARD, yytext());}
    "function"   { return token(sym.FUNCTION, yytext());}
    "goto"       { return token(sym.GOTO, yytext());}
    "if"         { return token(sym.IF, yytext());}
    "in"         { return token(sym.IN, yytext());}
    "inline"     { return token(sym.INLINE, yytext());}
    "int"        { return token(sym.INT, yytext());}
    "label"      { return token(sym.LABEL, yytext());}
    "longint"    { return token(sym.LONGINT, yytext());}
    "mod"        { return token(sym.MOD, yytext());}
    "nil"        { return token(sym.NIL, yytext());}
    "not"        { return token(sym.NOT, yytext());}
    "of"         { return token(sym.OF, yytext());}
    "or"         { return token(sym.OR, yytext());}
    "packed"     { return token(sym.PACKED, yytext());}
    "procedure"  { return token(sym.PROCEDURE, yytext());}
    "program"    { return token(sym.PROGRAM, yytext());}
    "read"       { return token(sym.READ, yytext());}
    "real"       { return token(sym.REAL, yytext());}
    "record"     { return token(sym.RECORD, yytext());}
    "repeat"     { return token(sym.REPEAT, yytext());}
    "set"        { return token(sym.SET, yytext());}
    "shortint"   { return token(sym.SHORTINT, yytext());}
    "string"     { return token(sym.STRING, yytext());}
    "then"       { return token(sym.THEN, yytext());}
    "to"         { return token(sym.TO, yytext());}
    "true"       { return token(sym.TRUE, yytext());}
    "type"       { return token(sym.TYPE, yytext());}
    "until"      { return token(sym.UNTIL, yytext());}
    "var"        { return token(sym.VAR, yytext());}
    "while"      { return token(sym.WHILE, yytext());}
    "with"       { return token(sym.WITH, yytext());}
    "write"      { return token(sym.WRITE, yytext());}
    "xor"        { return token(sym.XOR, yytext());}

}
  
                  
.                       { System.out.println("Caracter inválido " + yytext()); }  