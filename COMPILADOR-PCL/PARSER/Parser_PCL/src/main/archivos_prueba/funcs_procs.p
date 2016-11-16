//Esta es una prueba para verificar las declaraciones
//variables y constantes
PROGRAM Prueba

    FUNCTION funcion0 () : int // es una funcion por lo que debe tener tipo de retorno
    BEGIN
        WRITE("hola función 0");
        funcion0:= 12;
    END

    PROCEDURE funcion1( int  x, int y)
    BEGIN
        funcion1:=0.1;
    END

    FUNCTION funcion11 () : int  // es una funcion por lo que debe tener tipo de retorno
    BEGIN
        funcion11:=1;
    END


    PROCEDURE funcion2(int x, int y)  //no declaro tipos de los parametros
    BEGIN
        funcion2:=0;
    END


    PROCEDURE funcion3( int x,  int y)  //no definio los identificadores
    BEGIN
        funcion3:=0;
    END


    FUNCTION funcion4 ()   // es una funcion por lo que debe tener tipo de retorno
    BEGIN
        if (a = 2)
        BEGIN
            write("j");
        END
        funcion4:= 12;
        
    END

    FUNCTION funcion5 ()  // es una funcion por lo que debe tener tipo de retorno
    BEGIN
        funcion5:= 12.3;
    END

BEGIN

    WRITE ("Hola prueba");

END