//Se desea probar tanto la declaracion como el llamado de funciones


PROGRAM Prueba

VAR

 numero,limite,contador:int;  // todo esta bien


// se definen funciones con errores



PROCEDURE funcion1( x:int, y:int)
BEGIN
 funcion1:=0;
END


PROCEDURE funcion2( x, y)  //no declaro tipos de los parametros
BEGIN
 funcion2:=0;
END


PROCEDURE funcion3( int, int)  //no definio los identificadores
BEGIN
 funcion3:=0;
END


FUNCTION funcion4 () // es una funcion por lo que debe tener tipo de retorno
BEGIN
 funcion4:=0;
END


FUNCTION funcion5 ( x:int // error porque no cierra los parametros
BEGIN
 funcion5:=0; // nada de esto deberia dar error porque se deberia recuperar del error anterior
END


FUNCTION funcionBuena(x:int)
BEGIN
 funcionBuena(1); //llamada correcta a una funcion
 funcion();  //se espera que la acepte, aunque no este declarada y sin parametros

 funcion(4;   //llamada incorrecta
 funcionBuena:=0;
END


FUNCTION funcion8 // error no tiene los parentesis de los parametros
BEGIN
 funcion5:=0; 
END


BEGIN
 write("Fin");
END
