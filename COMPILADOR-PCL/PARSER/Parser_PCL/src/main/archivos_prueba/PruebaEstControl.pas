//Esta es una prueba para verificar las estructuras de control
//if-else, while, for

PROGRAM Prueba

VAR

 i:int;

BEGIN

// Pruebas del IF

  if ( a < 3) then //deberia dar error, pues debe haber una expresion
  begin
   i:=0;
  end
  else
  begin
    i:=0;
  end

  if (a=TRUE) then //deberia dar error, pues no cierra la expresion
     i:=0;
  else
    i:=0;

  if (x=2)  //error sin then
 begin
     i:= x++;
end  
else
begin
      i:= x--;
end



  if if (NOT a) then //deberia dar error por doble if
  	i:=0;
   else
     i:=0;

   if (x=2) then
       i:= x++;
   else
      i:= x--;
   else       //else sin if
      i:= x--;

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

       for x:= 7 to (f>9) do // segunda expresion no puede ser una condicion
       BEGIN
	      i:=0;
       END

       for X:= 1 to 10 //falta el do
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


       for X:= 1 to 10 do
	   BEGIN
	      i:=0;
	   // no cerro el for


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


        while (a>8)   //falta el do
		BEGIN
			i:=0;
        END


        while (a>8) do
		  i:=0;//falta el BEGIN
        END


        while (a>8) do
		BEGIN
			if (b= false) then
   				i:=0;
  			else
    			i:=0;
        END

END




