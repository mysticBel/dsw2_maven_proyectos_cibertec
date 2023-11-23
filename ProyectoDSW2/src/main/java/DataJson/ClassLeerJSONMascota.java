package DataJson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import com.google.gson.Gson;

public class ClassLeerJSONMascota {

	public static void main(String[] args) {
		// Ubicamos la ruta del archivo que va a ser leido
		
		String ruta= "D:/archivoJson/mascota.json";
		
		
		try {
			// Recuperamos la ruta para ser leido el archivo json...
			Reader lectura = Files.newBufferedReader(Paths.get(ruta));
			// instanciamos la clase GSON...
			Gson leer = new Gson();
			// aplicamos la interface Map.. con el metodo fromjson
			Map<?,?> leefinal = leer.fromJson(lectura, Map.class);
			//Imprimimos los valores recuperados
			System.out.println("Codigo " + leefinal.get("codigo")+
					" nombre " + leefinal.get("nommascota")+
					" raza " + leefinal.get("raza")+
					" pelo " + leefinal.get("colorpelo")+
					" nro de vacunas " + leefinal.get("nrovacunas")+
					"edad " + leefinal.get("edad")+
					"peso " + leefinal.get("peso")
					);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	} // fin del metodo principal

} // fin clase ller
