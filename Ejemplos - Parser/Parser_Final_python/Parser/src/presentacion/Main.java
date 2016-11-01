package presentacion;

import logica.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner();
		String archivoCodigo = "archivo.txt";
                
                //System.out.println("HAY 0 ERRORES ");
                //scanner.generarLexer();
		scanner.probarLexerFile(archivoCodigo);
    }
}