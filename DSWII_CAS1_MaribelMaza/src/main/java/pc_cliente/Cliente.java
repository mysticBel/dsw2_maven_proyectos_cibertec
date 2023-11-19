package pc_cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
		Socket cliente=new Socket("localhost",4780);
		ObjectOutputStream salida=new ObjectOutputStream(cliente.getOutputStream());
		
		//realizamos una pregunta al servidor...
		salida.writeObject("hola servidor, consulta ¿Quién fue el presidente del Perú en 1844?");
		ObjectInputStream entrada=new ObjectInputStream(cliente.getInputStream());

		//emitimos un mensaje por consola..
		System.out.println("recibimos la respuesta del servidor");
		String mensaje=(String) entrada.readObject();

		//emitimos un mensaje por consola
		System.out.println("desde el servidor "+mensaje);
		//cerramos
		cliente.close();

 

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //fin del catch.....
	}
}
