package Archivos_Basicos_Parcial_Xml;

import java.util.Scanner;

public class Principal_Empleado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del empleado: ");
        double sueldo = scanner.nextDouble();

        Empleado empleado = new Empleado(101, "Miguel", "Perez", "3814945", "Lima", "empleado nuevo", sueldo);

        EmpleadoJAXB.marshal(empleado);
        EmpleadoJAXB.unmarshal();

        scanner.close();
    }

}
