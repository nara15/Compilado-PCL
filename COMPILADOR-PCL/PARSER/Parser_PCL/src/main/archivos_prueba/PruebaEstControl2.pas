//Esta es una prueba para verificar las estructuras de control, read y write
// case, repeat


PROGRAM Prueba

VAR

 i:int;

BEGIN


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
else :
 i:=x;
else : // tiene doble else
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


