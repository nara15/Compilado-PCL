
PROGRAM Prueba

BEGIN

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
        begin
          i:= x++;
        end
        else
        begin
          i:=x--;
        end
  END
  else
  BEGIN
      i := x;
  END


  
END