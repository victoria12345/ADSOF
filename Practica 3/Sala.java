/**
 * Aqui definimos la clase Sala
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */

public class Sala{
	public static int MAXSALAS = 10;
	public static int MAXENTRADAS = 100;
	private int id;
	private Enrtadas[] = butacas[MAXENTRADAS];
	private Sesion[] = sesiones[MAXSALAS];

	/**
	* Constructor de la clase Pelicula
	* @param titutlo titulo que va a tener la clase pelidula
	* @param director nombre del director de la pelicula
	* @param anno anno en el que la pelicula fue estrenada
	* @param sinopsis sinopsis de la pelicula
	* @genero genero genero de la pelicula
	*/
	public Sala(int id, int butacas, Sesion[] sesiones){

		this.id = id;
		this.butacas = butacas;
		this.sesiones = sesiones;

	}

	/**
   * Imprime por pantalla los datos de la pelicula
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
	* Devuelve el id de una sala
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return id id de la sala
	*/

	public int getId(){
		return id;
	}

	/**
	* Devuelve numero de butacas de una sala
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return butacas numero de butacas de una sala
	*/

	public int getButacas(){
		return butacas;
	}

	/**
	* Devuelve las sesiones que hay en una sala
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @return sesiones array de las sesiones de esa sala
	*/

	public int getSesiones(){
		return sesiones;
	}

	/**
	* Cambia el numero de butacas de una sala
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param butacas nuevo numero de butacas en la sala
	*/

	public void setButacas(int butacas){
		this.butacas = butacas;
	}

	/**
	* Modifica el array de sesiones de Sala
	* @author Victoria Pelayo e Ignacio Rabunnal
	* @param sesiones array de sesiones que habra en esa sala
	*/

	public void setSesiones(Sesiones[] sesiones){
		this.sesiones = sesiones;
	}

	/**
	* Añadir una sesion a una sala
	* @param sesion sesion que se quiere añadir
	* @return true si se ha añadido y false si no es asi
	*/

}