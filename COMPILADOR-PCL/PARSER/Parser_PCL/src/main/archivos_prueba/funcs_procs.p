//Esta es una prueba para verificar las declaraciones
//variables y constantes
PROGRAM Prueba

    PROCEDURE funcion1(  x, int y)
    BEGIN
        funcion1:=0;
    END

    PROCEDURE funcion2( x, y)  //no declaro tipos de los parametros
    BEGIN
        funcion2:=0;
    END
    
    FUNCTION funcion5 (int x)  // es una funcion por lo que debe tener tipo de retorno
    BEGIN
        if (x < 3)
        begin
            write(""menor de 3);
        end
        funcion5:= 12.3;
    END

    PROCEDURE funcion3( int , int)  //no definio los identificadores
    BEGIN
        funcion3:=0;
    END

    FUNCTION funcion4 ()  // es una funcion por lo que debe tener tipo de retorno
    BEGIN
        funcion4:=0;
    END

    

BEGIN

    
    if (a > 3) then
    BEGIN
        VAR
        numero,limite,contador:int; 
        :int; 
        respuesta :  ; 
        coleccion2: ARRAY[5]  longint; 

        write("No es A");
    END

END