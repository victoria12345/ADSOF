/**
 * Aqui definimos la clase Sesion
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */

public class Sesion{
	private Fecha fecha;
	private Pelicula pelicula;
	private int butacas;
	private int vendidas;

	/**
	* Constructor de la clase Pelicula
	* @param titutlo titulo que va a tener la clase pelidula
	* @param director nombre del director de la pelicula
	* @param anno anno en el que la pelicula fue estrenada
	* @param sinopsis sinopsis de la pelicula
	* @genero genero genero de la pelicula
	*/
	public Sesion(Fecha fecha, Pelicula pelicula, int bustacas, int vendidas){

		this.fecha = fecha;
		this.pelicula = pelicula;
		this.buacas = butacas;
		this.vendidas = vendidas;

	}

	/**
   * Imprime por pantalla los datos de la sesion
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por los datos
   */
	public String toString(){
		pelicula = "";

		return pelicula = pelicula + "Fecha: " + fecha + "\n"+
		"Pelicula: "+ pelicula + "\n"+
		"Total butacas: "+ butacas + "\n"+
		"Vendidas: "+ vendidas+ "\n";
	}

	/**
	* Devuelve la fecha d euna sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return fecha fecha de la sesion
	*/

	public Fechas getFecha(){
		return fecha;
	}

	/**
	* Devuelve la pelicula de una sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return pelicula pelicula que se proyecta en la sesion
	*/

	public Pelicula getPelicula(){
		return pelicula;
	}

	/**
	* Cambia la pelicula de una sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param pelicula nueva pelicula de la sesion
	*/

	public void setPelicula(Pelicula pelicula){
		this.pelicula = pelicula;
	}

	/**
	* Cambia la fecha de una sesion
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param fecha nueva fecha de la sesion
	*/

	public void setDirector(Fecha fecha){
		this.fecha = fecha;
	}

}