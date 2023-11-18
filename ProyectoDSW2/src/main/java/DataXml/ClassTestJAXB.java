package DataXml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ClassTestJAXB {

	// Metodo principal
	public static void main(String[] args) {
		// Instanciamos las respectivas clases
		List<ClassCliente> list = new ArrayList<ClassCliente>();
		ClassCliente cliente = new ClassCliente();
		
		//agregamos cliente
		cliente.setIdcliente(100);
		cliente.setNombre("Rosa Maria");
		cliente.setApellido("Perez Gomes");
		cliente.setDni("145678");
		cliente.setSexo("f");
		cliente.setTelefono("3814950");

		//agregamos al listado
		list.add(cliente);
		ClassCliente clientedos=new ClassCliente();
		clientedos.setIdcliente(200);
		clientedos.setNombre("Nilson Alexander");
		clientedos.setApellido("Ramirez");
		clientedos.setDni("145789");
		clientedos.setSexo("m");
		clientedos.setTelefono("7896478");

		//agregamos al listado
		list.add(clientedos);
		ClassCliente clientetres=new ClassCliente();
		clientetres.setIdcliente(300);
		clientetres.setNombre("Jorge Luis");
		clientetres.setApellido("Tasayco");
		clientetres.setDni("789466");
		clientetres.setSexo("m");
		clientetres.setTelefono("387459");

		//agregamos al listado
		list.add(clientetres);

		//instanciamos la clase classtipocliente...
		ClassTipoCliente cltip=new ClassTipoCliente();

		//asignamos el listado
		cltip.setCliente(list);

		//aplicamos JAXB
		try {
			JAXBContext con=JAXBContext.newInstance(ClassTipoCliente.class);
			//aplicamos la clase marshaler
			//vinculamos marshaller con jaxbcont...
			Marshaller mar=con.createMarshaller();
			//prepara formato para el archivo xml...
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

			//aplicamos la clase file..
			File archivoxml=new File("D:/archivoxml/cliente.xml");
			mar.marshal(cltip,archivoxml);

      //emitimos mensaje por consola
				System.out.println("archivo convertido");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //fin del catch...

	} // fin de metodo principal

} // fin de clase test
