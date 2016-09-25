package scanner;

import java_cup.runtime.*;

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



BLANCO = [\n| |\t|\r]
ID = ([_|a-z|A-Z][a-z|A-Z|0-9|_]{1,123})
SUMA = "+"
ENTERO = 0|[1-9][0-9]*

%%

if                      { return token(sym.IF,yytext()); }
then                    { return token(sym.THEN, yytext()); }
and                     { return token(sym.AND, yytext()); }
{BLANCO}                { /*Omitir el espacio blanco*/ }
{ID}                    { return token(sym.ID, yytext()); } 
{SUMA}                  { return token(sym.SUMA, yytext()); } 
{ENTERO}                { return token(sym.ENTERO, yytext()); }
{COMMENT_BODY}          {return token(sym.COMMENT, yytext());}
{COMMENT_LINE}          {return token(sym.COMMENT, yytext());}
{COMMEN_BODY_BRACKETS}  {return token(sym.COMMENT, yytext());}
.                       { throw new RuntimeException("Caracter inválido " + yytext()); }  