/**
 * Aqui definimos la clase Sala
 * @author Victoria Pelayo e Ignacio Rabuñal
 * grupo 2101
 */

import java.util.*;

public class Sala{

	public static int MAXSESIONES = 10;
	public static int MAXBUTACAS = 100;

	private int id;
	private List<Entrada> butacas = new ArrayList<Entrada>();
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
	public Sala(int id, List<Entrada> butacas, List<Sesion> sesiones){

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
		String sesion = "";

		return sesion = sesion + "Id:" + id + "\nButacas: " + butacas+
						"\n Sesiones: " + sesiones +"\n";
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

	public List<Entrada> getButacas(){
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
	* @param butaca butaca que se desea añadir
	* @return true si se realiza con exito y false si no es asi
	*/
	public boolean addButaca(Entrada butaca){
		if(butacas.size() == MAXBUTACAS){
			return false;
		}

		butacas.add(butaca);
		return true;
	}

	/**
	* Se elimina una butaca
	* @param butaca butaca que se desea eliminar
	* @return true si se realiza con exito y false si no es asi
	*/
	public boolean delButaca(Entrada butaca){
		if(butacas.isEmpty() == true){
			return false;
		}

		int i;
		for(i = 0; i < butacas.size(); i++){
			if(butacas.get(i).getId() == butaca.getId()){
				butacas.remove(i);
				return true;
			}
		}

		return false;
	}

	/**
	* Se añade una sesion
	* @param sesion sesion que se desea añadir
	* @return true si se realiza con exito y false si no es asi
	*/
	public boolean addSesion(Sesion sesion){
		if(sesiones.size() == MAXSESIONES){
			return false;
		}

		int i;
		for(i = 0; i < sesiones.size(); i++){
			if(sesiones.get(i).getFecha() == sesion.getFecha()){
				return false;
			}
		}

		sesiones.add(sesion);
		return true;
	}

	/**
	* Se elimina una sesion
	* @param sesion sesion que se desea eliminar
	* @return true si se realiza con exito y false si no es asi
	*/
	public boolean delSesion(Sesion sesion){
		if(sesiones.isEmpty() == true){
			return false;
		}

		int i;
		for(i = 0; i < sesiones.size(); i++){
			if(sesiones.get(i).getId() == sesion.getId()){
				sesiones.remove(i);
				return true;
			}
		}

		return false;
	}
	
}