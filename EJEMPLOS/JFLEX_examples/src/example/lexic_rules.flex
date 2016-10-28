/*-***
 *
 * This file defines a stand-alone lexical analyzer for a subset of the Pascal
 * programming language.  This is the same lexer that will later be integrated
 * with a CUP-based parser.  Here the lexer is driven by the simple Java test
 * program in ./PascalLexerTest.java, q.v.  See 330 Lecture Notes 2 and the
 * Assignment 2 writeup for further discussion.
 *
 */


import java_cup.runtime.*;


%%
/*-*
 * LEXICAL FUNCTIONS:
 */

%cup
%line
%column
%unicode
%class PascalLexer

%{

/**
 * Return a new Symbol with the given token id, and with the current line and
 * column numbers.
 */
Symbol newSym(int tokenId) {
    return new Symbol(tokenId, yyline, yycolumn);
}

/**
 * Return a new Symbol with the given token id, the current line and column
 * numbers, and the given token value.  The value is used for tokens such as
 * identifiers and numbers.
 */
Symbol newSym(int tokenId, Object value) {
    return new Symbol(tokenId, yyline, yycolumn, value);
}

%}


/*-*
 * PATTERN DEFINITIONS:
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
whitespace      = [ \n\t]


%%
/**
 * LEXICAL RULES:
 */
and             { return newSym(1); }
array           { return newSym(2); }
begin           { return newSym(3); }
else            { return newSym(4); }
end             { return newSym(5); }
if              { return newSym(6); }
of              { return newSym(7); }
or              { return newSym(8); }
program         { return newSym(11); }
procedure       { return newSym(12); }
then            { return newSym(13); }
type            { return newSym(14); }
var             { return newSym(15); }
"*"             { return newSym(16); }
"+"             { return newSym(17); }
"-"             { return newSym(20); }
"/"             { return newSym(21); }
";"             { return newSym(22); }
","             { return newSym(23); }
"("             { return newSym(24); }
")"             { return newSym(25); }
"["             { return newSym(30); }
"]"             { return newSym(31); }
"="             { return newSym(32); }
"<"             { return newSym(33); }
">"             { return newSym(34); }
"<="            { return newSym(35); }
">="            { return newSym(36); }
"!="            { return newSym(37); }
":"             { return newSym(38); }
":="            { return newSym(50); }
"."             { return newSym(51); }
{identifier}    { return newSym(52, yytext()); }
{integer}       { return newSym(53, new Integer(yytext())); }
{real}          { return newSym(54, new Double(yytext())); }
{char}          { return newSym(56, new Character(yytext().charAt(1))); }
{comment}       { /* For this stand-alone lexer, print out comments. */
                  System.out.println("Recognized comment: " + yytext()); }
{whitespace}    { /* Ignore whitespace. */ }
.               { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar); }
