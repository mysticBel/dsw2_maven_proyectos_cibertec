package DataJson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestConvertirJSONmascota {

	public static void main(String[] args) {
		// instanciamos la respectiva clase
		ClassMascota clmas = new ClassMascota();
		// Asignamos valores
		clmas.setIdmascota(100);
		clmas.setNommascota("Boby");
		clmas.setRaza("Pastor Aleman");
		clmas.setColor("Negro");
		clmas.setVacuna("5");
		clmas.setEdad("5");
		clmas.setPeso("7kg");

		//HAY DOS FORMAS DE SERIALIZAR
		
		// 1. Primera Forma
		Gson gsonmascota = new Gson();
			//aplicamos el metodo "TOJSON"
		String datosmascota = gsonmascota.toJson(clmas);
		//imprimimos �pr consola
		System.out.println("***********Primera Forma ");
		System.out.println(datosmascota);
		System.out.println(" ");
		
		// 2. Segunda Forma
		Gson gsonmascotaBuilder = new GsonBuilder().setPrettyPrinting().create();
			//almacenamos los valores en una variable de tipo string
			String datosmascotaBuilder = gsonmascotaBuilder.toJson(clmas);
			//imprimimos �pr consola
			System.out.println("***********Segunda Forma Builder");
			System.out.println(datosmascotaBuilder);
		
		// VAMOS A colocarlo en una carpeta :
			//Creamos una carpeta archivoJson en unidad "D:"
			// En la carpeta guardaremos el archivo mascota.json
			// para ello , aplicaremos la clase File
			File archivojson = new File("D:/archivoJson/mascota.json");
			//aplicamos la clase Printwriter
			PrintWriter pw;
			try {
				pw = new PrintWriter(archivojson);				
				pw.write(datosmascotaBuilder); // utilizamos el metodo write
				pw.close(); // cerramos
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	} // fin del metodo principal

}// fin de clase test
