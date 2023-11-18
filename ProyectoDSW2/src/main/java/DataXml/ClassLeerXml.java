package DataXml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ClassLeerXml {
	// creamos el metodo leer datos xml
	public void LeerXml(){
		
		//Pide Try-catch, aplicamos JAXB ...
		try {
			JAXBContext leerxml = JAXBContext.newInstance(ClassTipoCliente.class);
			// aplicar una clase que nos permite leer el archivo xml
			// y vinculamos la clase que nos permite leer el archivo xml
			Unmarshaller leer = leerxml.createUnmarshaller();
			//
			//Aplicamos la clse File para ubicar el archivo que se va a dar lectura ..
			File leerarchivoxml = new File("D:/archivoxml/cliente.xml");
			// creamos un objeto de tipo ClassTipoCliente - casteo
			ClassTipoCliente tipoclleer = (ClassTipoCliente)leer.unmarshal(leerarchivoxml);
			//
			//aplicamos un bucle for para visualizar los datos que hay
			// en el archivo xml
			for(ClassCliente cli:tipoclleer.getCliente()){
				//imprimimos por pantalla los datos recuperados del archivo xml ...
				System.out.println("codigo "+ cli.getIdcliente()+ " nombre "+ cli.getNombre()
				+" apellido "+ cli.getApellido() + " dni "+cli.getDni()+" sexo "+cli.getSexo()+" telefono "+cli.getTelefono());
			} //fin bucle for
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}// fin de metodo LeerXml
	
}// fin de clase
