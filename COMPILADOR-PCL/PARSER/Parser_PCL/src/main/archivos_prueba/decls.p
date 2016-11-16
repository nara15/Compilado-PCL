//Esta es una prueba para verificar las declaraciones
//variables y constantes
PROGRAM Prueba

    VAR
        numero,limite,contador:int;  // todo esta bien
        :int; //hizo falta el identificador
        respuesta :  ; // falta tipo
        coleccion2: ARRAY[5]  longint; // error porque falta el OF
        a : ;

    CONST
        PI  3;
        NOMBRE  "Juan Nñez";
        NOMBRE = "Juan Pérez";
        APELLIDO = "Pérez";
        APELLIDO = ;

BEGIN

    WRITE("Hola prueba");

END