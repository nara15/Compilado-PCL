//Esta es una prueba para verificar las estructuras de control, read y write
// case, repeat


PROGRAM Prueba

VAR

 i:int;

BEGIN


// Pruebas del Repeat

Repeat
  i:=x;
Until (4>8)

Repeat
  i:=x;
Until  //falto condicion

Repeat
BEGIN  // no lleva BEGIN - END
  i:=x;
END
Until (4>8)

Repeat
  i:=x;
Until (4*8) // la expresion no es booleana


//Pruebas del Case


Case selector OF
 1 : i:=x;
 2 : i:=x;
 3 : i:=x;
Else
 i:=x;

Case  OF  // no tiene selector
 1 : i:=x;
 2 : i:=x;
 3 : i:=x;
Else
 i:=x;

case (a DIV b) OF  // no debe ser una operacion
  1 : i:=x;
  2 : i:=x;
  3 : i:=x;
else
 i:=x;

case (a > b) OF  // no debe ser una condicion
  1 : i:=x;
  2 : i:=x;
  3 : i:=x;
Else
 i:=x;


case selector OF
 x : i:=x;  // tiene que ser constante
 2 : i:=x;
 3 :  // falto la sentencia
else
 i:=x;

case selector OF
   1 : i:=x;
   2 : i:=x;
   3 : i:=x;
// no tiene el else

case selector OF
 1 : i:=x;
 2 : i:=x;
 3 : i:=x;
else
 i:=x;
else // tiene doble else
  i:=x;


//Pruebas del READ - WRITE


	read;  //se espera error
    read();
    read(X);
    read(123);  //se espera error, pues no se acepta expresion entre ( )
    read(x++); //se espera error

    write(213+ 518- 345);
    write(C);
    write(C, 123, "Hola");
    write( );     //se espera error]
    write ;       //se espera error

END


