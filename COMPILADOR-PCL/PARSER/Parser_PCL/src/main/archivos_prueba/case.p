PROGRAM Prueba

BEGIN
    CASE variable                       //error
        1 : WRITE("uno");       
         : WRITE("dos");             // error      
        3 : WRITE("tres");
        4  :  WRITE("cuatro");          
    ELSE                                // error
        if (variable > 10) then
        begin
            write("es mayor que diez");
        end
        else
        begin
            write("No sé qué número es");
        end
END