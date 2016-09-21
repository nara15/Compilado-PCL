
package example;

import java_cup.runtime.*;

%%

%{
private Symbol token(int type, Object value)
{
    return new Symbol(type, yyline, yycolumn, value);
}
%}

%public
%class Lexer
%cup
%line
%column

BLANCO = [\n| |\t|\r]
ID = [_|a-z|A-Z][a-z|A-Z|0-9|_]*
SUMA = "+"
ENTERO = 0|[1-9][0-9]*

%%

if          { return token(sym.IF,yytext()); }
then        { return token(sym.THEN, yytext()); }
and         { return token(sym.AND, yytext()); }
{BLANCO}    { /*Omitir el espacio blanco*/ }
{ID}        { return token(sym.ID, yytext()); } 
{SUMA}      { return token(sym.SUMA, yytext()); } 
{ENTERO}    { return token(sym.ENTERO, yytext()); }
.           { throw new RuntimeException("Caracter inválido " + yytext()); }  