package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteArquivos {
	public static void main(String[] args) {
		try {
			System.out.println(ArquivosUtil.lerArquivo("C:\\Teste\\arquivo.txt"));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(IOException  e) {
			
		}
		System.out.println("Continua executando");
	}

}
