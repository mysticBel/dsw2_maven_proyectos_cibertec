package DataJson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ClassConvertirJSONProductos {

	public static void main(String[] args) {
		// instanciamos
		ClassProducto clprod = new ClassProducto();
		//asignamos valores
		clprod.setIdproducto(100);
		clprod.setNombre("naranjass");
		clprod.setDescriproducto("vitamina C");
		clprod.setCantidad(100);
		clprod.setNrolote(7897);
		clprod.setCodbarras(777789999);
		
		// Primera forma de serializar :
		Gson primfor = new Gson();
		// Aplicamos el metodo toJson() para convertir los objetos en data Json :
		String datosjson = primfor.toJson(clprod);
		// imprmimos mensaje y datos por consola
		System.out.println("************** Primera forma");
		System.out.println(datosjson);
		
		
		// Segunda Forma Gson Builder
		Gson segundafor = new GsonBuilder().setPrettyPrinting().create();
		// almacenamos la data en una variable string..
		String datosjsondos = segundafor.toJson(clprod);
		// imprmimos mensaje y datos por consola
				System.out.println("************** Segunda forma");
				System.out.println(datosjsondos);
		
		// VAMOS AGUARDAR EN UNA CARPETA un archivo json
				//Creamos una carpeta archivoJson en unidad "D:"
				// En la carpeta guardaremos el archivo mascota.json
				// para ello , aplicaremos la clase File
				File archivojson = new File("D:/archivoJson/producto.json");
				//aplicamos la clase Printwriter
				PrintWriter pw;
				try {
					pw = new PrintWriter(archivojson);				
					pw.write(datosjsondos); // utilizamos el metodo write
					pw.close(); // cerramos
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

				
			
				
				
	} // fin metodo principal

} // fin clase convertir
