import java.util.*;

public class Usuario{
	private TipoUsuario tipo;
	private String nick;
	private String contraseña;
	private String nombre;
	private String apellido;
	private boolean bloqueado;
	private int tarjeta;
	private List<Inmueble> inmuebles = new ArrayList<Inmueble>();
	private List<Oferta> ofertas = new ArrayList<Oferta>();


	public Usuario(TipoUsuario tipo, String nick, String contraseña, String nombre,  String apellido, int tarjeta){
		this.nick = nick;	
		this.contraseña = contraseña;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tarjeta = tarjeta;
		this.tipo = tipo;
		this.bloqueado = FALSE;
		this.inmuebles = NULL;
		this.ofertas = NULL;

	}

	/**
	* Imprime los datos del cine por pantalla
	* @author Victoria Pelayo e Ignacio Rabuñal
	*/
	public String toString(){
		String usuario = "";

		return usuario + "Nick: " + nick + "\n"
		+ "Contraseña: " + contraseña + "\n"
		+ "Nombre" + nombre + "\n"
		+ "Apellido: " + apellido + "\n"
		+ "Tarjeta: " + tarjeta + "\n"
		+ "Tipo de usuario: " + tipo + "\n"
		+ "Bloqueado: " + bloqueado + "\n";
	}

	/**
	* Devuelve el nombre de un cine
	* @return nombre nombre del cine 
	*/
	public String getNombre(){
		return this.nombre;
	}

	public String getApellido(){
		return this.apellido;
	}

	public String getNick(){
		return this.nick;
	}

	public String getContraseña(){
		return this.contraseña;
	}

	public String getTarjeta(){
		return this.tarjeta;
	}

	public String getBloqueado(){
		return this.bloqueado;
	}

	public String getTipo(){
		return this.tipo;
	}

	public String getInmuebles(){
		return this.inmuebles;
	}

	public String getOfertas(){
		return this.ofertas;
	}

	public String setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String setApellido(String apellido){
		this.apellido = apellido;
	}

	public String setNick(String nick){
		this.nick = nick;
	}

	public String setContraseña(String contraseña){
		this.contraseña = contraseña;
	}

	public String setTarjeta(int tarjeta){
		this.tarjeta = tarjeta;
	}

	public String setBloqueado(boolean bloqueado){
		this.bloqueado = bloqueado;
	}

	public String setTipo(TipoUsuario tipo){
		this.tipo = tipo;
	}
}