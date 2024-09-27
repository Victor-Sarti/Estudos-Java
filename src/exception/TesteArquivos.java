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
			// aqui trata IOExcption
		}catch(Exception e) {
			//aqui trata Execption no geral
		}finally {
			System.out.println("Passou  no Finally");
		}
		System.out.println("Continua executando");
	}

}
