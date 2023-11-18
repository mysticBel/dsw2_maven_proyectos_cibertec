package DataXml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//Agregamos etiqueta raiz de xml
@XmlRootElement
public class ClassTipoCliente {
	//declaramos los atributos
		private int idTipoCliente;
		private String nombre;
		//declaramos una variable de tipo cliente donde ClassCliente es la clase antes creada
		private List<ClassCliente> cliente;
		//Constructor con y sin parametros
		public ClassTipoCliente(){
			
		}//fin de constructor sin parametros
		
		//GETTER ANS SETTER
		public int getIdTipoCliente() {
			return idTipoCliente;
		}
		@XmlElement(name = "cliente")
		public void setIdTipoCliente(int idTipoCliente) {
			this.idTipoCliente = idTipoCliente;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public List<ClassCliente> getCliente() {
			return cliente;
		}
		public void setCliente(List<ClassCliente> cliente) {
			this.cliente = cliente;
		}
		

}//fin de ClassTipoCliente
