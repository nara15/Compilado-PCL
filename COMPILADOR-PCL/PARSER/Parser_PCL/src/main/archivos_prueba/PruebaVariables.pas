//Esta es una prueba para las declaraciones de variables globales y locales y constantes


PROGRAM Prueba



PROCEDURE funcion1() //esta esta bien
VAR
   variable: int;
BEGIN
   funcion1:= 0;
END


PROCEDURE funcion1() //esta esta bien
VAR
   variable: int;

CONST
	A= 123;
BEGIN
   funcion1:= 0;
END

PROCEDURE funcion1() //esta esta bien
BEGIN
   funcion1:= 0;
END

PROCEDURE funcion1() //tiene errores
VAR
   variable; // no le define tipo
   i: int;

CONST
	A := 123; // error: es solo el =
BEGIN
   funcion1:= 0;
END

variable: int;  //error pues no se permiten variables globales despues de la primer declaracion de funcion


BEGIN
VAR //error pues no se permiten variables globales dentro del bloque
 variable: int;
 write("Fin");
END



