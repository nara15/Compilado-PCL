//Esta es una prueba para las declaraciones de variables globales y locales y constantes


PROGRAM Prueba

VAR

 numero,limite,contador:int;  // todo esta bien

 :integer; //hizo falta el identificador

 respuesta : STRING ; // todo esta bien

 coleccion: ARRAY[50] OF int;

 coleccion2: ARRAY[5]  longint; // error porque falta el OF

 coleccion2: ARRAY[i OF shortint; // error porque falta el ]


 varsintipo ; //error porque no se le declara el tipo


CONST

	 Min        = 0;
     Max        = 1000;
     Incremento = 5;
     N          = Max div Incremento;  // Deberia dar un error
     Saludo     = "Hola";
     Suma       = (3 * 2) + (5 * 4);   //deberia dar error. Aqui no van operaciones


PROCEDURE funcion1() //esta esta bien
VAR
   variable: int;
BEGIN
   funcion1:= 0;
END


PROCEDURE funcion1() //esta esta bien
VAR
   variable: int;

CONST
	A= 123;
BEGIN
   funcion1:= 0;
END

PROCEDURE funcion1() //esta esta bien
BEGIN
   funcion1:= 0;
END

PROCEDURE funcion1() //tiene errores
VAR
   variable; // no le define tipo
   i: int;

CONST
	A := 123; // error: es solo el =
BEGIN
   funcion1:= 0;
END

variable: int;  //error pues no se permiten variables globales despues de la primer declaracion de funcion


BEGIN
VAR //error pues no se permiten variables globales dentro del bloque
 variable: int;
 write("Fin");
END



