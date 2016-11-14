PROGRAM 
    VAR
    a,b : STRING;
    j : STRING;
    jose : STRING;
BEGIN 
  
    if (i < 12) then //deberia dar error, pues debe haber una expresion
    BEGIN
        i:=0;
    END
    ELSE
    BEGIN
        i:=0;
    END

    if (x>4)  then //deberia aceptar if anidados y cualquier tipo de expresion dentro de ( )
     BEGIN
           if (a>=2) then
           BEGIN
             i := x ++;
           END
           else
           BEGIN
             i := x --;
           END
     END
     else
     BEGIN
         i:= x;
     END

    
    
    READ (a);
    WRITE("Resultado! ", (3+4)*4);
    WRITE("Hola: ", jose, a, b);
   
END