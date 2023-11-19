package Telnet;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTelnet {

		// declaramos los objetos
		ServerSocket server;
		Socket socket;
		int puerto= 62000;
		DataOutputStream salida;
		BufferedReader entrada;

		// Creamos un metodo de nombre iniciar ..
		public void iniciar(){
		// Emitimos un mensaje
			System.out.println("Esperando conexion desde un cliente");
			
			try {
				server = new ServerSocket(puerto);
				socket = new Socket();
				//
				socket = server.accept();
				entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String mensaje = entrada.readLine();
				//imprimimos en la consola
				System.out.println("mensaje del cliente : " + mensaje);
				salida = new DataOutputStream(socket.getOutputStream());
				salida.writeUTF("El servidor contesta al cliente : " + mensaje);
				
				//cerramos
				socket.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
