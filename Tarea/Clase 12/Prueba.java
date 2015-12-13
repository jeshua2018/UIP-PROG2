import java.io.BufferedReader;
import java.io.FileReader;


public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Programa que lee un archivo de texto plano
		
		// El nombre del archivo que vamos a abrir.
		String nombreArchivo = "temp.txt";
		
		//va a ser referencia de una linea en un momento determinado.
		String linea = null;
		
		try{
			// FileReader lee un archivo de texto en el encoding por defecto.
			FileReader fileReader = new FileReader(nombreArchivo);
			
			//siempre se debe enlazar FileReader en BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			
			while((linea = bufferedReader.readline()) != null){
		}

	}

}
