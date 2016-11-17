//Esta es una prueba para verificar las declaraciones
//variables y constantes
PROGRAM Prueba

    VAR
        numero,limite,contador:int;     // todo esta bien
        :int;                           //hizo falta el identificador
        respuesta :  ;                  // falta tipo
        coleccion2: ARRAY[5] OF longint;  // error porque falta el OF

    CONST
        PI  3;                          // Falta el igual
        NOMBRE  "Juan Nñez";            // Falta el igual
        NOMBRE = "Juan Pérez";
        APELLIDO = "Pérez";
        APELLIDO = ;                   // Falta el valor

BEGIN

    WRITE("Hola prueba");

END