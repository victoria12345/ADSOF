package grafos.got;

public class Persona {
	/**
	 * Nombre de la persona
	 */
	private String nombre;
	/**
	 * Casa de la persona, null si no pertenece a ninguna
	 */
	private String casa;
	
	/**
	 * Constructor de la clase persona
	 * @param nombre nmbre de la persona
	 * @param casa casa de la persona
	 */
	public Persona (String nombre,String casa2){
		this.nombre = nombre;
		this.casa = casa2;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the casa
	 */
	public String getCasa() {
		return casa;
	}

	/**
	 * @param casa the casa to set
	 */
	public void setCasa(String casa) {
		this.casa = casa;
	}
	
}
