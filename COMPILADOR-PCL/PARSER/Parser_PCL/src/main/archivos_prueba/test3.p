PROGRAM prueba
    VAR
    a,b, c, d : int;
    j:  string;
    nombres: ARRAY [1 .. 100] OF STRING;
    apellido: string ;
    numero,limite,contador:int;  // todo esta bien
    //:int; //hizo falta el identificador
    //respuesta :  ; // falta tipo
    
    CONST
        PI = 3;
        NOMBRE = "Juan Pérez";
        NOMBRE = "Juan Pérez";
        APELLIDO = "Pérez";
        APELLIDO = 2.5;
    
    PROCEDURE funcion1( int x, int y)
    BEGIN
        funcion1:=0;
    END

    FUNCTION Saludar(): STRING
    BEGIN
       VAR a,b,c : STRING; 
    END

    FUNCTION fib(INT n):INT
    BEGIN
        VAR a : INT; 
    END

    
BEGIN 

    IF (q<7) THEN
        BEGIN
            WRITE("Hola");
        END
    ELSE
        BEGIN
            IF (a = 2) THEN
            BEGIN
                WRITE("Hola otra vez");
            END
        END
        
    FOR i:=1 TO 10 DO
        BEGIN
            IF (saludo = "hola") THEN
            BEGIN
                WRITE("Hola");
                
                WHILE (hola <= 3) DO
                    BEGIN
                        READ(a);
                        WRITE("HOLA:", a);
                    END
            END
            ELSE
                BEGIN
                    IF (hola < (123 + 78 + saludo)) THEN
                    BEGIN
                        WRITE("Hola otra vez");
                    END
                END
        END
    
  
    REPEAT 
        REPEAT
            READ();
            a := 3 + 3 + 3;
        UNTIL (a = 3)
    UNTIL (hola <= 2) 

    CASE variable OF
        1 : WRITE("Hola"); 
        2 : WRITE("dos");
       
         
    a := ((2 + 2) + (2 + b));
    b := 5*(6-3)+1;
    c := a;
    d := a++ ;



    read();
    read (a,b);
    write();
    WRITE("Hola: " jose, a, b);
   
END