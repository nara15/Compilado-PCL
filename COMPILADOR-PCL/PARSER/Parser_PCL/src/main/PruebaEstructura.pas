///Se quiere probar la estructura del PROGRAMa
// Este codigo contiene varios  ejemplos de estructura que se deben probar.

PROGRAM Prueba

PROCEDURE funcion1( x:int, y:int)
BEGIN
 funcion1:=0;
END
i:= x++; //se espera error de sintaxis por expresion fuera de funcion


VAR  // las variables no pueden venir despues de una declaracion de funcion

 i:int;

BEGIN
 write("Fin") // falta punto y coma
END


(*

VAR  //falta la declaracion de progama
 i:int;

BEGIN
 write("Fin");
END

*)


(*

PROGRAM Prueba

VAR

 i:int;


PROCEDURE funcion1( x:int, y:int)
BEGIN
 funcion1:=0;
END

BEGIN
 write("Fin");
// PROGRAMa sin END

*)


(*

PROGRAM Prueba

VAR

 i:int;


PROCEDURE funcion1( x:int, y:int)
BEGIN
 funcion1:=0;
END

//PROGRAMa sin BEGIN
 write("Fin");
END

*)

