/**
 * Aqui definimos la clase Sala
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */

import java.util.*;

public class Sala{

	private int id;
	private int butacas;
	private List<Sesion> sesiones = new ArrayList<Sesion>();

	/**
	* Constructor de la clase Pelicula
	* @author Victoria Pelayo e Ignacio Rabuñal
	* @param titutlo titulo que va a tener la clase pelidula
	* @param director nombre del director de la pelicula
	* @param anno anno en el que la pelicula fue estrenada
	* @param sinopsis sinopsis de la pelicula
	* @genero genero genero de la pelicula
	*/
	public Sala(int id, int butacas){

		this.id = id;
		this.butacas = butacas;

	}

	/**
   * Imprime por pantalla los datos de la pelicula
   * @author Victoria Pelayo e Ignacio Rabunnal
   * @return cadena de caracteres formada por los datos
   */
	public String toString(){
		String sala = "";

		return sala = sala + "Id:" + id + "\nButacas: " + butacas+
						"\nSesiones: " + sesiones +"\n";
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
	* Devuelve las butacas de una sala
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

	public List<Sesion> getSesiones(){
		return sesiones;
	}

	/**
	* Se añade una butaca
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/
	public void addButaca(){
		butacas++;
	}

	/**
	* Se añade una sesion
	* @param sesion sesion que se desea añadir
	* @return true si se realiza con exito y false si no es asi
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/
	public boolean addSesion(Sesion sesion){
		int i;
		for(i = 0; i < sesiones.size(); i++){
			if(sesiones.get(i).getFecha() == sesion.getFecha()){
				return false;
			}
		}

		// Si para esa sesion se vende mas entradas que butacas hay en la sala
		// see cambian el numero de butacas en la sala
		if(sesion.getDisponibles() >= butacas){ 
			sesion.setButacas(butacas);
		}
		sesiones.add(sesion);
		return true;
	}

	/**
	* Se elimina una sesion
	* @param sesion sesion que se desea eliminar
	* @return true si se realiza con exito y false si no es asi
	* @author Victoria Pelayo e Ignacio Rabunnal
	*/
	public boolean delSesion(Sesion sesion){
		if(sesiones.isEmpty() == true){
			return false;
		}

		int i;
		for(i = 0; i < sesiones.size(); i++){
			if(sesiones.get(i) == sesion){
				sesiones.remove(i);
				return true;
			}
		}
		return false;
	}
	
}