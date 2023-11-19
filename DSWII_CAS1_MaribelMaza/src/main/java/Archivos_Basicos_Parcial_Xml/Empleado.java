package Archivos_Basicos_Parcial_Xml;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder= {"idempleado", "nombre","apellido","telefono", "direccion", "observaciones", "sueldo" })
public class Empleado {
	//Declaramos sus variables
	private int idempleado;
	private String nombre;
	private String apellido;
	private String telefono;
	private String direccion;
	private String observaciones;
	private double sueldo;

	
	//*****************************
	// Getter y Setter
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	//*****************************
	//****** Constructores ********
	// constructor vacios
	public Empleado() {
		//super();
	}
	
	// constructor con fields
	
	public Empleado(int idempleado, String nombre,String apellido, String telefono, String direccion, String observaciones,
			double sueldo) {
		this.idempleado = idempleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.observaciones = observaciones;
		this.sueldo = (sueldo <= 1025) ? 1025 : sueldo;
	}
	
    @Override
    public String toString() {
        return "Empleado{" +
                "idempleado=" + idempleado +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
