package grafos;
/**
 * Descripcion de la clase Vertice
 * 
 * @author Vctoria Pelayo e Ignacio Rabunnal
 */
public class Vertice<T> {
	/**
	 * Identificador del vertice
	 */
	private final int id = 0;
	
	/**
	 * Datos almacenados e el vertice
	 */
	private T datos ;
	
	/**
	 * Constructos de la clase Vertice
	 * @param datos dats del vertice 
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public Vertice(T datos) {
		this.datos = datos;
	}

	/**
	 * @return datos del vertice
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public T getDatos() {
		return datos;
	}

	/**
	 * Cambia los datos de un vertice
	 * @param datos nuevos datos del vertice
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public void setDatos(T datos) {
		this.datos = datos;
	}

	/**
	 * @return identificador del vertice 
	 * 
	 * @author Vctoria Pelayo e Ignacio Rabunnal
	 */
	public int getId() {
		return id;
	}

	
	
	
	
}
