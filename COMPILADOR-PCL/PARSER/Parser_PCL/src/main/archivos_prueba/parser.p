//Esta es una prueba para verificar las estructuras de control
//if-else, while, for
PROGRAM Prueba

VAR

numero,limite,contador:int;  // todo esta bien

:int; //hizo falta el identificador

respuesta & :  ; // falta tipo

  coleccion2: ARRAY[5]  longint; // error porque falta el OF
   
PROCEDURE funcion1( int x, int y)
BEGIN
funcion1:=0;
END


PROCEDURE funcion2( x, y)  //no declaro tipos de los parametros
BEGIN
funcion2:=0;
END


PROCEDURE  funcion3( int, int)  //no definio los identificadores
BEGIN
funcion3:=0;
END


FUNCTION funcion4 () // es una funcion por lo que debe tener tipo de retorno
BEGIN
funcion4:=0;
END


BEGIN

// Pruebas del IF

  if () then //deberia dar error, pues debe haber una expresion
  BEGIN
  i:=0;
  END
  ELSE
  BEGIN
    i:=0;
  END

 
  if if (NOT a) then //deberia dar error por doble if
  begin
      i:=0; 
  end
  else
  begin
    i:=0;
  end

  if (x>4)  then //deberia aceptar if anidados y cualquier tipo de expresion dentro de ( )
  BEGIN
        if (a>=2) then
          i:= x++;
        else
          i:=x--;
  END
  else
  BEGIN
      i:= x;
  END


      // PRUEBAS DEL FOR

      for i>9 to 8 do // la primer expresion no es asignacion
      BEGIN
        i:=0;
      END


      for X:= 1  10 do//falta el to
      BEGIN
                  i:=0;
      END


      for X:= 1 to 10 do
      BEGIN
          while (a>8) do
        BEGIN
          i:=0;
        END
      END


  //PRUEBAS DEL WHILE

        while do  //debe dar error no tiene expresion
        BEGIN
          i:=0;
        END

        while () do  //debe dar error no tiene expresion
        BEGIN
          i:=0;
        END

        while (a>8) do
        BEGIN
          i:=0;
        END

END