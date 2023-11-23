package DataJson;

import com.google.gson.annotations.SerializedName;

public class ClassProducto {
	
	@SerializedName("codigo")
	private int idproducto;
	@SerializedName("Articulo")
	private String nombre;
	@SerializedName("Descripcion del articulo")
	private String descriproducto;
	@SerializedName("Stock")
	private int cantidad;
	@SerializedName("Lote de Fabricacion")
	private int nrolote;
	@SerializedName("Codigo de Barras")
	private int codbarras;
	
	
	// Constructores

	public ClassProducto(int idproducto, String nombre, String descriproducto, int cantidad, int nrolote,
			int codbarras) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.descriproducto = descriproducto;
		this.cantidad = cantidad;
		this.nrolote = nrolote;
		this.codbarras = codbarras;
	}
	public ClassProducto() {
		//super();
	}
	
	// Getter y setters
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescriproducto() {
		return descriproducto;
	}
	public void setDescriproducto(String descriproducto) {
		this.descriproducto = descriproducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getNrolote() {
		return nrolote;
	}
	public void setNrolote(int nrolote) {
		this.nrolote = nrolote;
	}
	public int getCodbarras() {
		return codbarras;
	}
	public void setCodbarras(int codbarras) {
		this.codbarras = codbarras;
	}
	


	
}
