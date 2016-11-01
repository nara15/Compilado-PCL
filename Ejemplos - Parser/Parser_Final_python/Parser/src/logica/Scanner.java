package logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java_cup.runtime.Symbol;

public class Scanner {
	
	public void generarLexer() {
        File file = new File("src/logica/Lexer.flex");
        jflex.Main.generate(file);
    }
	
	private Reader leerArchivo(String ruta) {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader(ruta));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return reader;
	}
    
    public void probarLexerFile(String ruta) throws Exception {
        Lexer lexer = new Lexer(leerArchivo(ruta));
       
//        while(true) {
//            Symbol symbol = lexer.next_token();
//            Simbolo token = (Simbolo) symbol.value;
//            if(token == null) {
//                break;
//            }
//            if(token.getToken() == "ERROR") {
//                System.out.println(token.getToken() + " : " + token.getSimbolo() + " -> " + symbol);   
//            }
//        }
        
        Parser miParser = new Parser(lexer);
        miParser.parse();
    }
}