package Archivos_Basicos_Parcial_Xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class EmpleadoJAXB {

    public static Empleado unmarshal() {
        try {
            JAXBContext context = JAXBContext.newInstance(Empleado.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            File file = new File("src/Datos_Empleado_Xml/empleado.xml");
            Empleado empleado = (Empleado) unmarshaller.unmarshal(file);

            if (empleado.getSueldo() >= 1600) {
                System.out.println("No tiene bono.");
            } else if (empleado.getSueldo()<=1600 &&  empleado.getSueldo()>= 1025 ) {
                System.out.println("Tiene bono.");
            } else {
                empleado.setSueldo(1025);
                System.out.println("Tiene bono.");
            }

            System.out.println(empleado);
            return empleado;

        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void marshal(Empleado empleado) {
        try {
            JAXBContext context = JAXBContext.newInstance(Empleado.class);
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();

            File file = new File("src/Datos_Empleado_Xml/empleado.xml");
            marshaller.marshal(empleado, file);

            System.out.println("XML generado exitosamente.");

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Empleado empleado = unmarshal();
        marshal(empleado);
    }
}
