package scanner;
import java_cup.runtime.*;
import symbols.sym;

%%

/*-*
*   FUNCIONES LÉXICAS ---------------------------------------------
*/
%cup
%line
%column
%unicode
%public
%class PascalLexer

%{
    private Symbol newSym(int tokenID)
    {
        return new Symbol(tokenID, yyline, yycolumn);
    }
    
    private Symbol newSym(int tokenID, Object value)
    {
        return new Symbol(tokenID, yyline, yycolumn, value);
    }
%}

/*-*
*   DEFINICIÓN DE LAS EXPRESIONES REGULARES ----------------------
*/
letter          = [A-Za-z]
digit           = [0-9]
alphanumeric    = {letter}|{digit}
other_id_char   = [_]
identifier      = {letter}({alphanumeric}|{other_id_char})*
integer         = {digit}*
real            = {integer}\.{integer}
char            = '.'
leftbrace       = \{
rightbrace      = \}
nonrightbrace   = [^}]
comment_body    = {nonrightbrace}*
comment         = {leftbrace}{comment_body}{rightbrace}
whitespace      = [\n| |\t|\r]

%%

and             { return newSym(sym.AND,yytext()); }
array           { return newSym(sym.ARRAY,yytext()); }
begin           { return newSym(sym.BEGIN,yytext()); }
else            { return newSym(sym.ELSE,yytext()); }
end             { return newSym(sym.END,yytext()); }
if              { return newSym(sym.IF,yytext()); }
of              { return newSym(sym.OF,yytext()); }
or              { return newSym(sym.OR,yytext()); }
program         { return newSym(sym.PROGRAM,yytext()); }
procedure       { return newSym(sym.PROCEDURE,yytext()); }
then            { return newSym(sym.THEN,yytext()); }
type            { return newSym(sym.TYPE,yytext()); }
var             { return newSym(sym.VAR,yytext()); }
"*"             { return newSym(sym.TIMES,yytext()); }
"+"             { return newSym(sym.PLUS,yytext()); }
"-"             { return newSym(sym.MINUS,yytext()); }
"/"             { return newSym(sym.DIVIDE,yytext()); }
";"             { return newSym(sym.SEMI,yytext()); }
","             { return newSym(sym.COMMA,yytext()); }
"("             { return newSym(sym.LEFT_PAREN,yytext()); }
")"             { return newSym(sym.RT_PAREN,yytext()); }
"["             { return newSym(sym.LEFT_BRKT,yytext()); }
"]"             { return newSym(sym.RT_BRKT,yytext()); }
"="             { return newSym(sym.EQ,yytext()); }
"<"             { return newSym(sym.GTR,yytext()); }
">"             { return newSym(sym.LESS,yytext()); }
"<="            { return newSym(sym.LESS_EQ,yytext()); }
">="            { return newSym(sym.GTR_EQ,yytext()); }
"!="            { return newSym(sym.NOT_EQ,yytext()); }
":"             { return newSym(sym.COLON,yytext()); }
":="            { return newSym(sym.ASSMNT,yytext()); }
"."             { return newSym(sym.DOT,yytext()); }
{identifier}    { return newSym(sym.IDENT, yytext()); }
{integer}       { return newSym(sym.INT, new Integer(yytext())); }
{real}          { return newSym(sym.REAL, new Double(yytext())); }
{char}          { return newSym(sym.CHAR, new Character(yytext().charAt(1))); }
{comment}       { /* For this stand-alone lexer, print out comments. */
                  System.out.println("Recognized comment: " + yytext()); }
{whitespace}    { /* Ignore whitespace. */ }
.               { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar); }